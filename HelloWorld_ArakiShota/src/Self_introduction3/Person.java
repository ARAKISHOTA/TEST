package Self_introduction3;

class Person{
	 // インスタンスフィールドを定義
	private static int count = 0;
	private String firstName, lastName;
	private int age;
	private double height, weight;
	
	 // コンストラクタを定義しインスタンスフィールドに値をセット
	 Person(String firstName,String lastName,int age,double height,double weight){
		 this.firstName = firstName;
		 this.lastName = lastName;
		 this.age = age;
		 this.height = height;
		 this.weight = weight;
		 Person.count++;
	 }
	 
	 public String fullName(){
		  return this.firstName + this.lastName;
	 }
	 
	 public void print(){
		  System.out.println("名前は" + this.fullName() + "です");
		  System.out.println("年は" + this.age + "です");
		  System.out.println("BMIは" + Math.ceil(this.bmi()) + "です");
	 }
	 
	 public double bmi(){
		  return this.weight / this.height / this.height;
	 }
	 
	 public static void printCount() {
		 System.out.println("\n合計" + Person.count + "人です");
	 }
	 
}
