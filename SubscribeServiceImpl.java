package service.impl;

import java.util.List;

import dao.DAOException;
import dao.SubscribeDAO;
import domain.Subscribe;
import impl.SubscribeDAOImpl;
import service.SubscribeService;

public class SubscribeServiceImpl implements SubscribeService {
	private static SubscribeService subscribeService;
	private SubscribeDAO subscribeDAO;

	private SubscribeServiceImpl() {
		this.subscribeDAO = new SubscribeDAOImpl();
	}

	public static SubscribeService getSubscribeService() {
		if (subscribeService == null) {
			subscribeService = new SubscribeServiceImpl();
		}

		return subscribeService;
	}
	
	@Override
	public Subscribe insert(Subscribe t) throws DAOException {
		return subscribeDAO.insert(t);
	}

	@Override
	public List<Subscribe> readAll() throws DAOException {
		return subscribeDAO.readAll();
	}

	@Override
	public Subscribe readByID(int id) throws DAOException {
		return subscribeDAO.readByID(id);
	}

	@Override
	public boolean updateByID(Subscribe t) throws DAOException {
		return subscribeDAO.updateByID(t);
	}

	@Override
	public boolean delete(int id) throws DAOException {
		return subscribeDAO.delete(id);
	}

	@Override
	public Subscribe insert(Subscribe t) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Subscribe> readAll() throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Subscribe readByID(int id) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateByID(Subscribe t) throws DAOException {
		// TODO Auto-generated method stub
		return false;
	}

}
