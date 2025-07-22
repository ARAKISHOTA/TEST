package InheritanceA;

public class InheritanceA {
	private String name;
	private int state;
	
	
	InheritanceA(String name){
		setName(name);
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getState() {
		return state;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setState(int state) {
		this.state = state;
	}
}