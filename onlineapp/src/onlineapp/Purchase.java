package onlineapp;

import java.util.Scanner;

public class Purchase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int app_price = 3;
		int song_price= 7;
		int user_input = 0;
		int no_of_apps_1 = 0;
		int no_of_apps_2 = 0;
		int no_of_songs = 0;

		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("How much money do you wish to prepay");
	    user_input = myObj.nextInt();  // Read user input
	    
	   
	    if(user_input < 1) {
	    	 System.out.println("Please enter valid input");
	    }else {
	    //	first method
	    	  no_of_apps_1 = user_input / app_price;
	    	int  credit_1 = user_input % app_price;
	    	  
	    // second method
	    	  no_of_songs = user_input / song_price;
	    	  int credit_2 = user_input % song_price;
	    	  no_of_apps_2 = credit_2 / app_price;
	    	  int credit_3 = credit_2 % app_price;
	    	  
	    	  System.out.println("With this amount, you will be able to purchase "+no_of_apps_1 +" app(s). You will then have "+ credit_1+"$ left as a credit on your account.\n Alternatively, for this amount, you will be able to purchase "+ no_of_songs +" song(s) and "+ no_of_apps_2 +" app(s). You will then have "+ credit_3 +"$ left as a credit on your account");
	  	
	    	
	    }
	    
	  }

}
