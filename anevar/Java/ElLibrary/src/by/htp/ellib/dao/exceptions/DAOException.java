package by.htp.ellib.dao.exceptions;

public class DAOException extends Exception {

	private static final long serialVersionUID = -8965379665382661518L;

	public DAOException () {
		super();
	}
	
	public DAOException (String message) {
		super(message);
	}
	
	public DAOException (Exception e) {
		super(e);
	}
	
	public DAOException (String message, Exception e) {
		super(message, e);
	}

}
