class  Swiggy2Executor  {
	
	public static void main (String[]args){
		
		
		double priceWithQuantity=Swiggy2.search("pizza",3);
		System.out.println("The price for pizza with quantity 3 is " + priceWithQuantity);
		
		double priceWithQuantity1=Swiggy2.search("veg biryani",3);
		System.out.println("The price for veg biryani with quantity 3 is " + priceWithQuantity1);
		double priceWithQuantity2=Swiggy2.search("jeera rice",3);
		System.out.println("The price for jeera rice with quantity 3 is " + priceWithQuantity2);
		
		System.out.println("main ended");
		
	}
		
}
		