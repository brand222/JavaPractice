package OOPExample;

public class Animal {
	
	private String name;
	private double height;
	private int weight;
	private String sound;
	
	public void setName(String newName) {
		this.name = newName;
	}
	public String getName() {
		return this.name;
	}
	
	public void setWeight(int newWeight) {
		
		if(newWeight > 0) {
			this.weight = newWeight;
		} 
		else 
		{
			System.out.println("Weight must be bigger than 0");
		}
	}
	
	public int getWeight(){
		return this.weight;
	}
	
	public void setHeight(int newHeight) {
		this.height = newHeight;
	}
	
	public double getHeight(){
		return this.height;
	}
	
	public void setSound(String newSound){
		this.sound = newSound;
	}
	
	public String getSound(){
		return this.sound;
	}

}
