class Swiggy2 {
	
	
	public static double search (String foodName,int quantity){
		double price=0.0;
		System.out.println("invoked seach: foodName(String), quantity(int)");
		if (foodName=="pizza"){
			price=110.00*quantity;
		}
		
		if (foodName=="veg biryani"){
			price=260.60*quantity;
		}
		
		if (foodName=="jeera rice"){
			price=150.00*quantity;
		}
	
	System.out.println("end of search");
     return price;
	}
}
