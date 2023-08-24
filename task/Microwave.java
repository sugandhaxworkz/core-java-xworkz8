class     Microwave   { 

      static int minTemp=0;
	  static int maxTemp=7;
	  static int currentTemp=4;
	  static boolean isConnected;

   public static boolean onOrOff(){
	   System.out.println("inside onOrOff");
	   // if(false==false)
	     if(isConnected== false){
		   isConnected = true;
		   System.out.println("the microwave turned on..");
   }else if(isConnected==true){
	        isConnected= false;
			System.out.println("the microwave is turned off");
        
     
	   System.out.println("end of onOrOff");
	   
   }
   return isConnected;
   }
   
	  
	   public static void increaseTemp(){
		System.out.println("start of increaseTemp");
		
		if(isConnected==true){
			if(currentTemp< maxTemp){
			
			currentTemp=currentTemp+1;
			System.out.println("the current temperature is " + currentTemp);
			}
	 else{ System.out.println("max temperature is reached");
	 }
		}else{
		
	   System.out.println("End of increase temperature");
   }   
   
}
 
	  
	  public static void decreaseTemp(){
		System.out.println("start of decreaseTemp");
		
		if(isConnected==true){
			if(currentTemp> minTemp){
			
			currentTemp=currentTemp-1;
			System.out.println("the current temperature is " + currentTemp);
			}
	 else{
		 System.out.println("minimum temperature is reached");
	 }
		}
		else{
			
	   System.out.println("End of decrease temperature");
   }   
   
  
}
}