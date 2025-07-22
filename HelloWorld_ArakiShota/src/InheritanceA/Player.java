package InheritanceA;
import java.util.Random;

public class Player extends InheritanceA{
	
	public Player(String name) {
		super(name);
	}
	
	public void print() {
		System.out.println("ステータス");
		String State[] = {"HP","MP","攻撃力","素早さ","防御力"};
		for(int i = 0;i < State.length;i++) {
			Random rand = new Random();
			setState(rand.nextInt(1000));
		
			System.out.println(State[i] + "：" + getState());
		}
		System.out.println("\nさあ冒険に出かけよう！");
	}
}
