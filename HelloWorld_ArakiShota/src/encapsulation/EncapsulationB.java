package encapsulation;

public class EncapsulationB {
	public static void main(String[] args) {
		String name = "ライオン";
		float weight = 2.1F;
		int speed = 80;
		
		//encapsulationA encapsulation = new encapsulationA(name,weight,speed);
		
		EncapsulationA encapsulation = new EncapsulationA();
		
		encapsulation.setName(name);
		encapsulation.setWeight(weight);
		encapsulation.setSpeed(speed);
		
		System.out.println("動物名：" + encapsulation.getName());
		System.out.println("体長：" + encapsulation.getWeight() + "m");
		System.out.println("速度：" + encapsulation.getSpeed() + "km/h");
	}
}
