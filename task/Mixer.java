class    Mixer  {
	
	  static int minSpeed=0;
	  static int maxSpeed=5;
	  static int currentSpeed=2;
	  static boolean isConnected;

   public static boolean onOrOff(){
	   System.out.println("inside onOrOff");
	   // if(false==false)
	     if(isConnected== false){
		   isConnected = true;
		   System.out.println("the mixer is turned on");
   }else if(isConnected==true){
	        isConnected= false;
			System.out.println("the mixer is turned off");
        
     
	   System.out.println("end of onOrOff");
	   
   }
   return isConnected;
   }
   
	  
	   public static void increaseSpeed(){
		System.out.println("start of increaseSpeed");
		
		if(isConnected==true){
			if(currentSpeed< maxSpeed){
			
			currentSpeed=currentSpeed+1;
			System.out.println("the current speed is " + currentSpeed);
			}
	 else{ System.out.println("max speed is reached");
	 }
		}else{
		
	   System.out.println("End of increase speed");
   }   
   
}
 
	  
	  public static void decreaseSpeed(){
		System.out.println("start of decreaseSpeed");
		
		if(isConnected==true){
			if(currentSpeed> minSpeed){
			
			currentSpeed=currentSpeed-1;
			System.out.println("the current speed is " + currentSpeed);
			}
	 else{
		 System.out.println("minimum speed is reached");
	 }
		}
		else{
			
	   System.out.println("End of decrease speed");
   }   
   
  
}
}