package com.Day28;
public class ProxyPatternDemo {
	interface SecretKeyAccess {
		String getSecretKey(String password);
}
	static class RealSecretKey implements SecretKeyAccess {
		private final String secretKey;
		public RealSecretKey() {
			this.secretKey = "ThisIsASecretKey123!";
}
@Override
public String getSecretKey(String password) {
return this.secretKey;
}
}
	static class SecretKeyProxy implements SecretKeyAccess {
		private final RealSecretKey realSecretKey;
		private final String correctPassword;
		public SecretKeyProxy(String correctPassword) {
			this.realSecretKey = new RealSecretKey();
			this.correctPassword = correctPassword;
}
@Override

public String getSecretKey(String password) {
	if (this.correctPassword.equals(password)) {
		return realSecretKey.getSecretKey(password);
} 
	else {
		return "Access Denied: Incorrect Password";
}
}
}
	public static void main(String[] args) {
		String correctPassword = "password123";
		SecretKeyProxy proxy = new SecretKeyProxy(correctPassword);
		System.out.println(proxy.getSecretKey("password123")); // Output: ThisIsASecretKey123!
		System.out.println(proxy.getSecretKey("wrongpassword")); // Output: Access Denied: IncorrectPassword

}
}
