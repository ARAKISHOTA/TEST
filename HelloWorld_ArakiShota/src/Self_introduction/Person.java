package Self_introduction;

class Person{
	 // インスタンスフィールドを定義
	String name;
	int age;
	double height;
	double weight;
	double bmi;
	int number_of_people = 0;
	
	 // コンストラクタを定義しインスタンスフィールドに値をセット
	 Person(String name,int age,double height,double weight){
		 this.name = name;
		 this.age = age;
		 this.height = height;
		 this.weight = weight;
		 this.number_of_people++;
	 }
	 
	 public double BMI() {
		 this.bmi = this.weight / (this.height * this.height);
		 return this.bmi;
	 }
	 
	 public void print() {
		 System.out.println("名前は" + this.name + "です");
		 System.out.println("年は" + this.age + "です");
		 System.out.println("BMIは" + String.format("%.1f", this.bmi) + "です");
		 System.out.println("\n合計" + this.number_of_people + "人です");
	 }
	}
