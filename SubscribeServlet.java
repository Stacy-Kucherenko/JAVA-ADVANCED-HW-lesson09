package ui;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import dao.DAOException;
import domain.Subscribe;
import service.SubscribeService;
import service.impl.SubscribeServiceImpl;

@WebServlet("/subscribe")
public class SubscribeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private SubscribeService subscribeService = SubscribeServiceImpl.getSubscribeService();

	private Logger log = Logger.getLogger(SubscribeServlet.class);

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		log.trace("Getting fields values...");
		HttpSession session = request.getSession();
		Integer userId = (Integer) session.getAttribute("userID");
		String magazineID = request.getParameter("magazineID");

		Subscribe subscribe = new Subscribe(userId, Integer.parseInt(magazineID), true, LocalDate.now(), 10);

		try {
			log.trace("Saving subscribe in database...");
			subscribeService.insert(subscribe);
		} catch (DAOException e) {
			log.error("Creating subscribe failed!", e);
		}

		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write("Success");
	}

}
