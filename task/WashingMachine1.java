class    WashingMachine1  {
	
	  static int minSpin=0;
	  static int maxSpin=7;
	  static int currentSpin=4;
	  static boolean isConnected;

   public static boolean onOrOff(){
	   System.out.println("inside onOrOff");
	   // if(false==false)
	     if(isConnected== false){
		   isConnected = true;
		   System.out.println("the washing machine is turned on...");
   }else if(isConnected==true){
	        isConnected= false;
			System.out.println("the washing machine is turned off");
        
     
	   System.out.println("end of onOrOff");
	   
   }
   return isConnected;
   }
   
	  
	   public static void increaseSpin(){
		System.out.println("start of increaseSpin");
		
		if(isConnected==true){
			if(currentSpin< maxSpin){
			
			currentSpin=currentSpin+1;
			System.out.println("the current spin is " + currentSpin);
			}
	 else{ System.out.println("max spin is reached");
	 }
		}else{
		
	   System.out.println("End of increase spin");
   }   
   
}
 
	  
	  public static void decreaseSpin(){
		System.out.println("start of decreaseSpin");
		
		if(isConnected==true){
			if(currentSpin> minSpin){
			
			currentSpin=currentSpin-1;
			System.out.println("the current spin is " + currentSpin);
			}
	 else{
		 System.out.println("minimum spin is reached");
	 }
		}
		else{
			
	   System.out.println("End of decrease spin");
   }   
   
  
}
}