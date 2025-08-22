package Self_introduction1_2;

class Person{
	 // インスタンスフィールドを定義
	private static int count = 0;
	private String name;
	private int age;
	private double height, weight;
	
	 // コンストラクタを定義しインスタンスフィールドに値をセット
	 Person(String name,int age,double height,double weight){
		 this.name = name;
		 this.age = age;
		 this.height = height;
		 this.weight = weight;
		 Person.count++;
	 }
	 
	 public double bmi(){
		 return this.weight / this.height / this.height;
	 }
	 
	 public void print() {
		 System.out.println("名前は" + this.name + "です");
		 System.out.println("年は" + this.age + "です");
		 System.out.println("BMIは" + Math.floor(this.bmi()) + "です");
	 }
	 
	 public static void printCount() {
		 System.out.println("\n合計" + Person.count + "人です");
	 }
}
