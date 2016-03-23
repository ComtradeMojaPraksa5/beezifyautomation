package ids;

/**
 * @author Tarik
 *	This enum class contains basic IDs:
 *		- BASE_URL - represents basic url of the website
 *		- LOGIN_USERNAME - username to use when signing in
 *		- LOGIN_PASSWORD - password to use when signing in
 *		- LOGIN_DOMAIN - domain to use when signing in
 *		------> TF - text field
 *		------> BTN - button
 *		------> CSS - css selector
 *		------> UL - unordered list
 *		- TF_LOGIN_USERNAME_ID - identifier for 'Username' input
 *		- TF_LOGIN_PASSWORD_ID - identifier for 'Password' input
 *		- TF_DOMAIN_ID - identifier for 'Domain' input
 *		- BTN_SIGN_IN_ID - identifier for 'Sign in' button
 */
public enum BaseIDs {
	// Credentials
	BASE_URL("https://hive.beezify.io/user/login"),
	LOGIN_USERNAME("bobr"),
	LOGIN_PASSWORD("bobr"),
	LOGIN_DOMAIN("demo"),
	
	// Login Identifiers
	
	TF_LOGIN_USERNAME_ID("login"),
	TF_LOGIN_PASSWORD_ID("password"),
	TF_DOMAIN_ID("domain"),
	BTN_SIGN_IN_ID("user-login"),
	
	// Navbar identifiers
	
	BTN_QUICKACTIONS_CSS(".btn.dropdown-toggle.transparent-button"),
	UL_QUICKACITIONS_DROPMENU_CSS(".dropdown.pull-left.open"),
	BTN_NOTIFICATION_CSS(".chat-button-wrapper.btn-head.btn-borderless.dropdown-toggle"),
	// div (that box) which is displayed when 'the bell' is clicked
	DIV_NOTIFICATION_CSS(".dropdown-menu.dropdown-menu-lg.no-radius"),
	A_USERINFO_CLASS(".nav.navbar-nav.user-info");
	
	private final String id;
	
	private BaseIDs(String id){
		this.id = id;
	}
	
	public final String get(){
		return this.id;
	}
	
}
