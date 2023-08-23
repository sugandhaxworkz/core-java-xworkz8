class  Modulus {
	
	public static void main (String [] module){
		
		module(12,67,56);
		module(67,89);
		module(34,78,25);
		module(90,67);
		module(56,89,57);
		module(78,34);
		module(67,34,56);
		module(56,64);
		module(90,56,89);
		module(67,89);
		
	}
	
	public static void module(int a, int b){
		System.out.println(a%b);
	}
	
	public static void module(int a ,int b, int c){
		 System.out.println(a%b%c);
	 }
}