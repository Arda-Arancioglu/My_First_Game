package main_package;
import java.util.Random;
import java.util.Scanner;

public class Character_stats {
	private int vit;
	private	int str;
	private	int magic;
	private	int agl;
	private	int luck;
	private int health;
	
	public int getHealth() {
		return health;
	}

	public void setHealth(int newHealth) {
		this.health = newHealth;
	}

	public int getVit() {
		return vit;
	}

	public void setVit(int vit) {
		this.vit = vit;
	}

	public int getStr() {
		return str;
	}

	public void setStr(int str) {
		this.str = str;
	}

	public int getMagic() {
		return magic;
	}

	public void setMagic(int magic) {
		this.magic = magic;
	}

	public int getAgl() {
		return agl;
	}

	public void setAgl(int agl) {
		this.agl = agl;
	}

	public int getLuck() {
		return luck;
	}

	public void setLuck(int luck) {
		this.luck = luck;
	}

	public void statincreaser(Character_stats chst,int stat_numbr) {
		Scanner sc = new Scanner(System.in);
		int user_inputint=0;
		
		while(stat_numbr>0){
		
		System.out.printf("\nPlease enter which skill you want to increase \n");	
		String user_input= sc.nextLine();
		
		user_input=user_input.toLowerCase();
		
		
		switch(user_input) {
		
		case "vit":
			System.out.printf("Please enter how much you want to increase %s\n",user_input);
			user_inputint=sc.nextInt();
			if(user_inputint>stat_numbr) {
				System.out.println("Please enter the number of stats correctly\n");
			}
			else {
				
				chst.setVit(chst.getVit()+user_inputint);
				stat_numbr-=user_inputint;
				setHealth(getHealth()+(user_inputint*10));
				
			}
			break;
			
		case "str":
			System.out.printf("Please enter how much you want to increase %s\n",user_input);
			user_inputint=sc.nextInt();
			if(user_inputint>stat_numbr) {
				System.out.println("Please enter the number of stats correctly\n");
			}
			else {
				chst.setStr(chst.getStr()+user_inputint);
				stat_numbr-=user_inputint;
			}
			break;
			
		case "magic":
			System.out.printf("Please enter how much you want to increase %s\n",user_input);
			user_inputint=sc.nextInt();
			if(user_inputint>stat_numbr) {
				System.out.println("Please enter the number of stats correctly\n");
			}
			else {
				chst.setMagic(chst.getMagic()+user_inputint);
				stat_numbr-=user_inputint;
			}
			break;
			
		case "agl":
			System.out.printf("Please enter how much you want to increase %s\n",user_input);
			user_inputint=sc.nextInt();
			if(user_inputint>stat_numbr) {
				System.out.println("Please enter the number of stats correctly\n");
			}
			else {
				chst.setAgl(chst.getAgl()+user_inputint);
				stat_numbr-=user_inputint;
			}
			break;
			
		case "luck":
			System.out.printf("Please enter how much you want to increase %s\n",user_input);
			user_inputint=sc.nextInt();
			if(user_inputint>stat_numbr) {
				System.out.println("Please enter the number of stats correctly\n");
			}
			else {
				chst.setLuck(chst.getLuck()+user_inputint);
				stat_numbr-=user_inputint;
			}
			break;
			
		default:
			System.out.print("Please enter it correctly\n");
		}
		System.out.printf("You have %d stat points left \n",stat_numbr);
		sc.nextLine();
	}
	
	}
	
	
	int basicslash=0;
	int basicbeam=0;
	int basicdodge=0;
	int basicmagicres=0;
	int basicphysicalres=0;
	int speed=1;
	
	public  void setskills() {
		Random rnd =new Random();
		if(getStr()>0) {
			if(getStr()%2==0)
				basicslash=rnd.nextInt((getStr()/2)+1)+(getStr()/2);
			else
				basicslash=rnd.nextInt((getStr()/2)+1)+(getStr()/2)+1;
		}
		if(getMagic()>0) {
			if(getMagic()%2==0)
				basicbeam=rnd.nextInt((getMagic()/2)+1)+(getMagic()/2);
			else
				basicbeam=rnd.nextInt((getMagic()/2)+1)+(getMagic()/2)+1;
		}
				
		if(getAgl()>0) {
			if(getAgl()%2==0)
				basicdodge=rnd.nextInt((getAgl()/2)+1)+(getAgl()/2); 
			else
				basicdodge=rnd.nextInt((getAgl()/2)+1)+(getAgl()/2)+1; 
		}
		
		if(getStr()>0) {
			if(getStr()%2==0)
				basicphysicalres=rnd.nextInt((getStr()/2)+1)+(getStr()/2);	
			else
				basicphysicalres=rnd.nextInt((getStr()/2)+1)+(getStr()/2)+1;	
		}
		
		if(getMagic()>0) {
			if(getMagic()%2==0)
				basicmagicres=rnd.nextInt((getMagic()/2)+1)+(getMagic()/2);	
			else 
				basicmagicres=rnd.nextInt((getMagic()/2)+1)+(getMagic()/2)+1;	
		}
			
	
		if(getAgl()>0) {
			speed+=(getAgl()-(getAgl()%5))/5;
		}
			
		
		
	}
	
	
}
