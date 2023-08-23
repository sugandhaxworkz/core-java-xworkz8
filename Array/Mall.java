
class   Mall   {
	
	static String shops[]={"spring food", "cleo dress point", "the blue collection","kitchen stuff plus", "uptrend","glamful","krispy",
	"fashion addict", "silver fox", "grand food mart", "market333", "hudson market","freshway market","organic orchard", "pine grocery"};
	
	public static void main (String []mall) {
		
		//System.out.println("The shops in the mall are " + shops[0]+ " " + shops[1] + " " + shops[3] + " " + shops[4]);
		
		
      System.out.println(" The shops are  " + shops.length);
		for(int shopIndex=0; shopIndex<shops.length;shopIndex++ ){
			System.out.println(shops[shopIndex]);
		}
			
			System.out.println("----------------");
			
		for(int shopIndex=shops.length-1;shopIndex>=0; shopIndex--){
     System.out.println(shops[shopIndex]);
		}	 
	}
}	
	