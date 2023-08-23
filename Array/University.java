class  University   {
	
	static String colleges[]= {"kodachadri" ,"Indira Gndhi", "LB college", "sahyadri", "DVS college" ,"Kamala Nehru", "National college",
              "kuvempu", "ATNCC college", "Acharya college", "gnana deepa ",  "Ramakrishna", "kumadwathi", "akshara", "PES college",
    "pace college", " malnad college","sharavathi", "Bapuji", " Nirmala"};

  public static void main (String[] university) {
     System.out.println("main started");
 // System.out.println( " The college names are " +  colleges[0] + " " + colleges[1] + " " +  colleges[2]);
 
 System.out.println("The colleges in the university are " );
  
   for(int collegeIndex=0;collegeIndex<colleges.length;collegeIndex++){
	   System.out.println(colleges[collegeIndex]);
   }
  
  System.out.println("------------------------");
  
  for(int collegeIndex=colleges.length-1;collegeIndex>=0;collegeIndex--){
	  System.out.println(colleges[collegeIndex]);
  }
  
  System.out.println("main ended");
  
  
  
  
  

}
  
  
  }