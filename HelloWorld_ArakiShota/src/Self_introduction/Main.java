package Self_introduction;

class Main {
	  public static void main(String[] args) {
		  Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
	   
		  person1.print();
		  person1.printCount();
		  
		  Person person2 = new Person("山田花子", 22, 1.5, 40);
		   
		  person2.print();
		  person2.printCount();
	  }
}