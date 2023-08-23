class  FaceBook   {
	
	
	public static void main(String[]args){
		
		System.out.println("Welcome to facebook");
		
		login("sugandha@gmail.com", "password123");
		login(2345667785l, "password235");
	}
	public static void login(String emailId, String password){
		System.out.println("login with emailId");
	}
	
	public static void login(long phoneNumber, String password){
		System.out.println("login with phoneNumber");
	}
}