package main_package;
import java.util.Scanner;
public class Menu {
	public int menucreator(Character_stats player,int result,int stat) {
		display mydisplay = new display();
		Scanner input= new Scanner(System.in);		
		int intuser;
		boolean open=true;
		
			  
		   
		    		    	
		    	
		   while(open) { 
		    mydisplay.path(stat);
		    intuser=input.nextInt();
		    while(!(intuser==1||intuser==2||intuser==3||intuser==4)) {
		    	System.out.println("Please enter  within the range number:\n\n");
		    	mydisplay.path(stat);
			    intuser=input.nextInt();
		    }
		    switch(intuser) {
		    case 1:
		    	open=false;
		    	return 1;
		    	
		    case 2:	
		    	open=false;
		    	return 2;
		    case 3:
		    	mydisplay.stats(player);
		    	break;
		    case 4:
		    	System.exit(0);
		    }
		    
		}
		  return 0;
	}
	
	
	
}
