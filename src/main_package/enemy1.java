package main_package;
import java.util.Random;
public class enemy1 {
	Random rnd = new Random();
	private int vit;
	private	int str;
	private	int magic;
	private	int agl;
	private	int luck;
	private int health;
	
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public  int getVit() {
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
	
	public  enemy1() {
		setVit(rnd.nextInt(4)+2);
		setStr(rnd.nextInt(4)+2);
		setMagic(rnd.nextInt(6));
		setAgl(rnd.nextInt(4)+2);
		setLuck(rnd.nextInt(4)+2);
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
