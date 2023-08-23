class    SportShop  {
	
	// Datatype variableName[]={val1 ,val2..};
	static String sportMaterial[]= {"Cricket Bat", "Foot ball", "Volley ball", "Hockey", "Leather boaed", "Carrom Board", "trophies", "Medals", "Jersey", 
	"Badminton", "wicket", "ball", "net", "bat", "chess board"};
	
	
	
	static int price[]={1000,3000,1200,5000,250,700,5000,2000,500,2000, 600,100,800,400,300 };
	
	public static void main(String shop[]) {
		System.out.println("main started");
		System.out.println("The sport material available are");
		
		
		/*static String sportMaterial[]= {"Cricket Bat", "Foot ball", "Volley ball", "Hockey", "Leather boaed", "Carrom Board", "trophies", "Medals", "Jersey", 
	"Badminton", "wicket", "ball", "net", "bat", "chess board"};*/
		
	/*	System.out.println(sportMaterial[0] + " price is -" + price[0]);
		System.out.println("-------------------------------------");
		System.out.println(sportMaterial[1] + " price is -"  + price[1]);
		System.out.println("-------------------------------------");
		System.out.println(sportMaterial[2] + " price is -"  + price[2]);
		System.out.println("-------------------------------------");
		System.out.println(sportMaterial[3] + " price is -"  + price[3]);
		System.out.println("-------------------------------------");
		System.out.println(sportMaterial[4] + " price is -"  + price[4]);
		System.out.println("-------------------------------------");
		System.out.println(sportMaterial[5] + " price is -"  + price[5]);
		System.out.println("-------------------------------------");
		System.out.println(sportMaterial[6] + " price is -"  + price[6]);
		System.out.println("-------------------------------------");
		System.out.println(sportMaterial[7] + " price is -"  + price[7]);
		System.out.println("-------------------------------------");
		System.out.println(sportMaterial[8] + " price is -"  + price[8]);
		System.out.println("-------------------------------------");
		System.out.println(sportMaterial[9] + " price is -"  + price[9]);
		System.out.println("-------------------------------------");
		System.out.println(sportMaterial[10] + " price is -"  + price[10]);
		System.out.println("-------------------------------------");
		System.out.println(sportMaterial[12] + " price is -"  + price[12]);
		System.out.println("-------------------------------------");
		System.out.println(sportMaterial[13] + " price is -"  + price[13]);
		System.out.println("-------------------------------------");
		System.out.println(sportMaterial[14] + " price is -"  + price[14]);*/
		//looping statement // devsIndex=0
		System.out.println(" The length of sport material is " + sportMaterial.length);
		for(int sportIndex=0; sportIndex < sportMaterial.length ; sportIndex++           ) {
			System.out.println(sportMaterial[sportIndex]);
		}
		// System.out.print(sportMaterial[devsIndex] + "   ");
		
		System.out.println("-----------------");
		
		for( int index= sportMaterial.length-1; index>=0; index--){
			System.out.println(sportMaterial[index]);
		}
		
		
		
		
		System.out.println("main ended");
		
	}
}