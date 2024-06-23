package in.kanha.exception;

public class UserNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8101928504329288803L;
	public UserNotFoundException() {
		// TODO Auto-generated constructor stub
	}
	public UserNotFoundException(String msg) {
		super(msg);
	}
}
