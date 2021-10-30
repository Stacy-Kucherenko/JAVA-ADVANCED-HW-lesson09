package service;

import dao.DAOAbstractCRUD;
import dao.DAOException;
import domain.User;

public interface UserService extends DAOAbstractCRUD<User>{
	
	User readByEmail(String email) throws DAOException;

	boolean updateByEmail(User t) throws DAOException;

}
