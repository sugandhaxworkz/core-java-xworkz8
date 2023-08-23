class   GoogleMap  {   

  static String roads[]={ "Nanda road", "Jayanagar road", "KR road", " KHroad", "MG road", "NR road", "JC road", "RV road", "SC road",
  "Sampige road", " Race cource road", "Commercial Street", " Bannerghatta road", "Kasturba road"," Brigade road", " Hosur road", 
  "Avenue road", "Infantry road", " Church street", "Inner ring road", " Lavelle road", "Yalhanka road", "Banashankari road", 
  "Basavanagudi road", "Hebbal road"};

    public static void main (String [] google) {
    System.out.println("main started");
  //  System.out.println( " The roads name are " + roads[0]  + " " + roads[1]+ " " + roads[2]);
      System.out.println("The roads in map are ");
	  for(int mapIndex=0;mapIndex<roads.length;mapIndex++){
		  System.out.println(roads[mapIndex]);
	  }
	  
	  System.out.println("----------------------");
	  
	  for(int mapIndex=roads.length-1;mapIndex>=0;mapIndex--){
		  System.out.println(roads[mapIndex]);
	  }
	  
	  System.out.println("main ended");
	  
	}
}	
  