package ExceptionsLogin;

public class WrongUsernameandPassword extends Exception {
	public WrongUsernameandPassword() {
		super(String.format("Wrong username and password!"));
	}
}


