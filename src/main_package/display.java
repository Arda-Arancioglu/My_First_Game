package main_package;

public  class display {

	public void menu() {
		System.out.printf("\t\t\tWelcome to the Game\n\nIn this very game you will win if you have the LUCK."+
				"\nWell if you don't believe in your luck \nDon't even consider playing it\n");
		/*System.out.printf("\nFor starters you have 10 starter points,\ndistribute them with caution!\n"+
				"\nSo now choose your skills:\n\n");
				*/
	    
	}
	public void stats(Character_stats stats) {
		
		System.out.printf("Vit:%d\n",stats.getVit());
	    System.out.printf("Str:%d\n",stats.getStr());
	    System.out.printf("Magic:%d\n",stats.getMagic());
	    System.out.printf("Agl:%d\n",stats.getAgl());
	    System.out.printf("Luck:%d\n",stats.getLuck());
		
	}
	public void enemy1stats(enemy1 stats) {
		System.out.printf("Vit:%d\n",stats.getVit());
	    System.out.printf("Str:%d\n",stats.getStr());
	    System.out.printf("Magic:%d\n",stats.getMagic());
	    System.out.printf("Agl:%d\n",stats.getAgl());
	    System.out.printf("Luck:%d\n",stats.getLuck());
	}
	
	public void Fight(Character_stats stats, enemy1 stat) {
	    System.out.println("You have encountered an enemy\nHere is your and the enemy's stats:");
	    System.out.printf("Vit:%d\t\tVit:%d\n", stats.getVit(), stat.getVit());
	    System.out.printf("Str:%d\t\tStr:%d\n", stats.getStr(), stat.getStr());
	    System.out.printf("Magic:%d\t\tMagic:%d\n", stats.getMagic(), stat.getMagic());
	    System.out.printf("Agl:%d\t\tAgl:%d\n", stats.getAgl(), stat.getAgl());
	    System.out.printf("Luck:%d\t\tLuck:%d\n\n", stats.getLuck(), stat.getLuck());
	    System.out.printf("Health:%d\tHealth:%d\n\n", stats.getVit() * 10, stat.getVit() * 10);
	}
	public void counterspells() {
		System.out.print("You can defense\n");
		System.out.println("You have:\n1-)Basic Dodge\n2-)Basic Physical Ressistance\n3-)Basic Magic Ressistance");
	}
	public void attackspells() {
		System.out.print("You can attack\n");
		System.out.println("You have:\n1-)Basic Slash\n2-)Basic Beam");
	}
	public void Healths(Character_stats stats,enemy1 stat) {
		System.out.printf("Health:%d\tHealth:%d\n\n", stats.getVit() * 10, stat.getVit() * 10);		
	}
	public void path(int stat) {
		System.out.print("Please choose what you want to do:\n\n"
				+ "1-)Continue the adventure\n");
		System.out.printf("2-)Level up(You have %d unused stat(s))\n",stat);
		System.out.print("3-)Show stats\n"
				+ "4-)Exit\n");
		
		
	}
}
