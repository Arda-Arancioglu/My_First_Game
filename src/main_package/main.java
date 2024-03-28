package main_package;

public class main {
 
	public static void main(String[] args) {
		final int default_value_vit=3;
		final int default_value_str=3;
		final int default_value_magic=3;
		final int default_value_agl=3;
		final int default_value_luck=3;
		int result=1;
		int loop=1;
		int zort=0;
		int stat =10 ;
		
		display mydisplay = new display();
		Character_stats myStats = new Character_stats();
		enemy1 easy = new enemy1();
		combat comb = new combat();
		Menu menu=new Menu();
		
		myStats.setVit(default_value_vit);
		myStats.setStr(default_value_str);
		myStats.setMagic(default_value_magic);
		myStats.setAgl(default_value_agl);
		myStats.setLuck(default_value_luck);
		myStats.setHealth(default_value_vit*10);
		easy.setHealth(easy.getVit()*10);
		mydisplay.menu();
		
		
	
		for(int i=0;i<=6;i++) {
			
			enemy1 enemy=new enemy1();
			enemy.setHealth(enemy.getVit()*10);
			loop=menu.menucreator(myStats,result,stat);
			if (i==6&&loop==1) {
				
				enemy.setVit(enemy.getVit()+3);
				enemy.setStr(enemy.getStr()+3);
				enemy.setMagic(enemy.getMagic()+3);
				enemy.setAgl(enemy.getAgl()+3);
				enemy.setLuck(enemy.getLuck()+3);
				enemy.setHealth(enemy.getVit()*10);
				comb.combats(myStats, enemy , result);
				continue;
			}
			if(loop==1) {
			comb.combats(myStats, enemy , result);
			System.out.println("You have levelled up by 1");
			
			stat+=1;
					}
			if(loop==2) {
			
			myStats.statincreaser(myStats, stat);
			stat=0;
			}
		}
		loop=menu.menucreator(myStats,result,stat);
		
	  System.out.println("You have encountered a BOSS!!");
	  
		
		
	}

}
