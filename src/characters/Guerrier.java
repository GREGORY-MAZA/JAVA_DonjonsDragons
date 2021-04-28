package characters;

public class Guerrier {

	private String name;
	private int life;
	private int attack;
	
	public Guerrier() {
		name=null;
		life =5;
		attack=5;
		
	}
	
	public Guerrier(String name2) {
		name=name2;
		life =5;
		attack=5;
	}
	
	public Guerrier(String name, int life, int attack ) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		
	}
	
	public String toString() {
		
		return name;
	}
	
	
	
	
}


