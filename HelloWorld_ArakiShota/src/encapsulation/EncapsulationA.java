package encapsulation;

public class EncapsulationA {
	private String name;
	private float weight;
	private int speed;
	
	
	public String getName() {
		return name;
	}
	
	public float getWeight() {
		return weight;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
