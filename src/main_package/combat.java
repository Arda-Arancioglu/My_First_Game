package main_package;
import java.util.Scanner;
import java.util.Random;
public class combat {
	int mcplays;
	int enemyplays;
	int setenemy=0;
	int chosena=0;
	int chosenc=0;
	int mcdodgeprb=0;
	int endodgeprb=0;
	int block=0;
	int enblock;
	int counter=0;
	int enhp;
	int mchp;
	
	public void combats(Character_stats mcstat,enemy1 enstat,int result) {
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		display ds =new display();
		enhp=enstat.getHealth();
		mchp=mcstat.getHealth();
		//mcstat.getHealth()>0 && enstat.health>0
		ds.Fight(mcstat, enstat);
		
		while(mchp>0 && enhp>0) {
			if(mchp<=0) {
				System.out.printf("\nmy hp:%d 	enemy hp:%d\n",mchp,enhp);
				System.out.print("Game over");
				break;
			}
			if(enhp<=0) {
				System.out.printf("\nmy hp:%d 	enemy hp:%d\n",mchp,enhp);
				System.out.print("You won");
				break;
			}
			
			mcstat.setskills();
			enstat.setskills();
			mcplays=0;
			enemyplays=0;
			
		//player attacks enemy defends	
			
			System.out.printf("my hp:%d enemy hp:%d\n",mchp,enhp);
			
			mcattack(mcstat);
			encounter(mcstat,enstat);
			
		//enemy attacks player defends	
			if(mchp<=0) {
				System.out.printf("my hp:%d enemy hp:%d\n",mchp,enhp);
				System.out.print("Game over\n");
				break;
			}
			if(enhp<=0) {
				System.out.printf("my hp:%d enemy hp:%d\n",mchp,enhp);
				System.out.print("You won\n");
				break;
			}
			System.out.printf("my hp:%d enemy hp:%d\n",mchp,enhp);
			
			enattack(enstat);
			mccounter(mcstat,enstat);
			
			
			
			if((enstat.getAgl()>mcstat.getAgl()||enstat.speed>mcstat.speed)&& counter%4==0) {
				System.out.print("Enemys speed is more so the enemy attacks 1 more round\nthis round is not counterable:\n");
				enattack(enstat);
				mchp=mchp-enemyplays;
			}
			if((mcstat.getAgl()>enstat.getAgl()||mcstat.speed>enstat.speed)&& counter%4==0) {
				System.out.print("Your speed is more so  you attack 1 more round\nThis round is not counterable:\n");
				mcattack(mcstat);
				enhp=enhp-mcplays;
			}
			counter++;
			
			
		}
		if(mchp<=0) {
			System.out.printf("\nmy hp:%d 	enemy hp:%d\n",mchp,enhp);
			System.out.print("Game over");
			System.exit(0);
		}
		if(enhp<=0) {
			result=1;
		}
		
		
		
		
	}
	
	
	public void mcattack(Character_stats mcstat) {
		Scanner sc = new Scanner(System.in);
		display ds  = new display();
		ds.attackspells();
		chosena = sc.nextInt();
		while(!(chosena==1||chosena==2)) {
			System.out.println("Please enter only one of these: 1,2 ");
			chosena =sc.nextInt();
		}
		if (chosena==1) {
		mcplays=mcstat.basicslash+mcstat.getLuck();
		System.out.printf("You have played basic slash.\nbasic slash damage:%d\n",mcplays);
		}
		else {
		mcplays= mcstat.basicbeam+mcstat.getLuck();	
		System.out.printf("You have played basic beam.\nbasic beam damage:%d\n",mcplays);
		}
		
		
	}
	
	
	public void mccounter(Character_stats mcstat,enemy1 enstat) {
		display ds=new display();
		Scanner sc = new Scanner(System.in);
		Random rand= new Random();
		ds.counterspells();
		chosenc = sc.nextInt();
		while(!(chosenc==1||chosenc==2||chosenc==3)) {
			System.out.println("Please enter only one of these: 1 , 2 , 3 ");
			chosenc =sc.nextInt();
			}
		if(chosenc==1) {
			mcdodgeprb = mcstat.basicdodge + mcstat.getLuck()-enstat.getLuck();
			System.out.printf("Your dodge chance is %d\n",mcdodgeprb);
			if(mcdodgeprb>(rand.nextInt(34)+1)) {
			System.out.print("You have successfully dodged it\n");
			}
			else {
			System.out.print("You couldn't dodge it");	
			mchp-=enemyplays;
			}
		}
		else if(chosenc==2) {
			if (setenemy==1) {
				block = mcstat.basicphysicalres+mcstat.getLuck()-enstat.getLuck();
			}
			else {
				block=0;
				}
			if(block>enemyplays) {
				System.out.println("You didn't get any damage");
			}
			else {
				mchp=mchp-enemyplays+block;
			}
				
		}
		else {
			if(setenemy==2) {
				block = mcstat.basicmagicres+mcstat.getLuck()-enstat.getLuck();
			}
			else {
				block=0;
			}
			if(block>enemyplays) {
				System.out.println("You didn't get any damage");
			}
			else {
				mchp=mchp-enemyplays+block;
				}
			
		}
		
		
	}


	public void enattack(enemy1 enstat) {
	if (enstat.basicbeam>enstat.basicslash) {
		System.out.println("Enemy plays basic slash\n");
		enemyplays=enstat.basicslash+enstat.getLuck();
		System.out.printf("basic slash damage: %d\n\n",enemyplays);
		setenemy=1;
	}
	else {
		System.out.println("Enemy plays basic beam \n");
		enemyplays=enstat.basicbeam+enstat.getLuck();
		System.out.printf("basic beam damage: %d\n\n",enemyplays);
		setenemy=2;
	}
	
}
	
	public void encounter(Character_stats mcstat,enemy1 enstat) {
		Random rnd = new Random();
		
		int localrand=rnd.nextInt(2);
			if(localrand==0) {
				endodgeprb=enstat.basicdodge+enstat.getLuck()-mcstat.getLuck();
				System.out.printf("Enemy trys to dodge with a chance of %d\n",endodgeprb);
				if(endodgeprb>(rnd.nextInt(34)+1))
					System.out.printf("Enemy succesfully dodged the attack %d\n\n",mcplays);
				else {
					System.out.printf("Enemy couldn't dodge the attack %d\n\n",mcplays);
					enhp-=mcplays;
				}
				
					
			}
			else{
				if(chosena==1) {
					enblock=enstat.basicphysicalres+enstat.getLuck()-mcstat.getLuck();
					System.out.printf("Enemy tries to physical block %d damage \n\n",enblock);
					enhp=enhp-mcplays+enblock;
					
				}
				else {
					enblock=enstat.basicmagicres+enstat.getLuck()-mcstat.getLuck();
					System.out.printf("Enemy tries to Magical block %d damage \n\n",enblock);
					enhp=enhp-mcplays+enblock;
										
				}
				
			}
			
	
			
	}
}


	