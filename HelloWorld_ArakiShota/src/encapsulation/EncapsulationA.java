package encapsulation;

public class EncapsulationA {
	private String name;
	private float weight;
	private int speed;
	
	/*public encapsulationA(String name, float weight, int speed) {
		this.name = name;
		this.weight = weight;
		this.speed = speed;
	}*/
	
	/*public void print() {
		System.out.println("動物名：" + this.name);
		System.out.println("体長：" + this.weight + "m");
		System.out.println("速度：" + this.speed + "km/h");
	}*/
	
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
