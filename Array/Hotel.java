class  Hotel  {
	
	static String foodMenu[]= { "Dosa", "Idli", "Vada", "Vangibath", 
	"Fried rice", "upma", "Roti", "masala dosa", "poori", "puliyogare", "lemon rice", "maggi", "jeerarice", "pulav","curdrice", "set dosa", 
	"bisibelebath", "tomatobath",
	"shavigebath","chapthi", "parota", "noodles","Kharabath", "masala bath", "veg biryani", "veg pulav", "chicken fry", "fish fry",
	"egg rice", "dal thadka", "gobi", "pani poori",
	"bhel puri", "sev puri", "samosa", "pav bhaji", " paneer manchurian", "veg roll", "egg roll", "paneer roll","veg noodles", "soup", 
	"butter roti","corn soup","palak paneer",
	"menthe bath", "palak rice", "pakoda", "masala vada","burger"};
	
	public static void main(String Hotel[]) {
		
		//System.out.println("The food menu is " + foodMenu[0]+"  "+foodMenu[6]);
		System.out.println(" The length of food menu is " + foodMenu.length);
		for(int hotelIndex=0; hotelIndex<foodMenu.length;hotelIndex++ ){
			System.out.println(foodMenu[hotelIndex]);
		}
			
			System.out.println("----------------");
			
		for(int hotelIndex=foodMenu.length-1;hotelIndex>=0; hotelIndex--){
     System.out.println(foodMenu[hotelIndex]);
		}	 
		
		//for(datatype var=value;conditionstatement;increment statement)
		
	}
}