package service.impl;

import java.util.List;

import dao.DAOException;
import dao.UserDAO;
import domain.User;
import impl.UserDAOImpl;
import service.UserService;

public class UserServiceImpl implements UserService {
	private static UserService userService;
	private UserDAO userDAO;

	private UserServiceImpl() {
		this.userDAO = new UserDAOImpl();
	}

	public static UserService getUserService() {
		if (userService == null) {
			userService = new UserServiceImpl();
		}

		return userService;
	}

	@Override
	public User insert(User t) throws DAOException {
		return userDAO.insert(t);
	}

	@Override
	public List<User> readAll() throws DAOException {
		return userDAO.readAll();
	}

	@Override
	public User readByID(int id) throws DAOException {
		return userDAO.readByID(id);
	}

	@Override
	public User readByEmail(String email) throws DAOException {
		return userDAO.readByEmail(email);
	}

	@Override
	public boolean updateByID(User t) throws DAOException {
		return userDAO.updateByID(t);
	}

	@Override
	public boolean updateByEmail(User t) throws DAOException {
		return userDAO.updateByEmail(t);
	}

	@Override
	public boolean delete(int id) throws DAOException {
		return userDAO.delete(id);
	}

	@Override
	public User insert(User t) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> readAll() throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User readByID(int id) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateByID(User t) throws DAOException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User readByEmail(String email) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateByEmail(User t) throws DAOException {
		// TODO Auto-generated method stub
		return false;
	}

}