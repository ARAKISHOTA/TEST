package Self_introduction;

class Person{
	 // インスタンスフィールドを定義
	private String name;
	private int age;
	private double height;
	private double weight;
	private double bmi;
	static int count = 0;
	
	 // コンストラクタを定義しインスタンスフィールドに値をセット
	 Person(String name,int age,double height,double weight){
		 this.name = name;
		 this.age = age;
		 this.height = height;
		 this.weight = weight;
		 count++;
	 }
	 
	 public double BMI() {
		 this.bmi = this.weight / (this.height * this.height);
		 return this.bmi;
	 }
	 
	 public void print() {
		 System.out.println("名前は" + this.name + "です");
		 System.out.println("年は" + this.age + "です");
		 System.out.println("BMIは" + String.format("%.1f", this.BMI()) + "です"); 
	 }
	 
	 public void printCount() {
		 System.out.println("\n合計" + count + "人です");
	 }
}
