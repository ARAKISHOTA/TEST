package example;

public class ExampleA{
	
	private String formattedDateTime;
	
	public ExampleA(String st) {
		this.formattedDateTime = st;
	}
	
	public void print() {
		System.out.println("こんにちは！ここは日本です！");
		System.out.println("この寿司はうまい");
		System.out.println("寿司は和食です");
		System.out.println("今の現在日時は" + this.formattedDateTime + "です");
	}
}