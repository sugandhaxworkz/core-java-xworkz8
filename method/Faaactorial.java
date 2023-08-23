class  Faaactorial {
	
	
	public static void main(String[]args) {
	System.out.println("main started");	
		
		getFact(6);
		getFact(7);
		getFact(8);
		getFact(9);
	System.out.println("main ended");
	
	}
	
	public static void getFact(int factNumber){
		int fact =1;
	for(int n=1;n<=factNumber;n++){
		fact=fact*n;
	}
   System.out.println("The factorial of " + factNumber + " is " + fact);
	}
}	
	
		