package OOPS;

public class Monster {

	public final String TOMBSTONE = "Here Lies a Dead monster";
	
	private int health = 500;
	private int attack = 20;
	private int movement = 2;
	private int xPosition = 0;
	private int yPosition = 0;
	private boolean alive = true;
	
	public String name = "Big Monster";
	
	//here we are creating our accessor methods
	
	public int getAttack() {
		return attack;
	}
	
	public int getMovement() {
		return movement;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int decreaseHealth) {
		health = health - decreaseHealth;
		if (health < 0) {
			alive = false;
		}
	}
	
	public void setHealth(double decrease) {
		int intDecreaseHealth = (int) decrease;
		health = health - intDecreaseHealth;
		if (health < 0) {
			alive = false;
		}
	}
	
	//whenever a new object is created, the first method that is called is the constructor
	//it will only be executed once
	//you cannot have a return type within a constructor
	public Monster(int health, int attack, int movement) {
		this.health = health;
		this.attack = attack;
		this.movement = movement;
	}
	
	//here we are overloading the constructor
	//This is the default constructor
	public Monster() {
		
	}
	
	public Monster(int newHealth) {
		health = newHealth;
	}
	
	public Monster(int newHealth, int newAttack) {
		this(newHealth);
		attack = newAttack;
	}
	
	public static void main(String[] args) {
		Monster frank = new Monster();
		
		System.out.println(frank.attack);
		System.out.println(frank.health);
	}
	
	
	
	
}
