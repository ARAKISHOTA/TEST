package Object_oriented;

public class Object_A extends Object{
	String string[] = {"パンテラ レオ","ロキソドンタ・サイクロティス","アイルロポダ・メラノレウカ","パン・トゥログロディテス","チャップマンシマウマ","不明"};
	int count = 0;
	
	public void print() {
		String state[] = getState().split(":");
		
		System.out.println("動物名：" + state[0]);
		System.out.println("体長：" + state[1] + "m");
		System.out.println("速度：" + state[2] + "km/h");
		System.out.println("学名：" + string[count++]);
	}
}
