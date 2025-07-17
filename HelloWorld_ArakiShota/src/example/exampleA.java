package example;

public class exampleA{
	
	String formattedDateTime;
	
	public exampleA(String st) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.formattedDateTime = st;
	}
	
	public void print(String formattedDateTime) {
		System.out.println("こんにちは！ここは日本です！");
		System.out.println("この寿司はうまい");
		System.out.println("寿司は和食です");
		System.out.println("今の現在日時は" + formattedDateTime + "です");
	}
}