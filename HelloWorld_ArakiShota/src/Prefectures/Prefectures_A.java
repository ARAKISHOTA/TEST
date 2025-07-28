package Prefectures;

public class Prefectures_A extends Prefectures{
	String[] list;
	
	public Prefectures_A(String string) {
		String[] prefectures = string.split(",");
		list = new String[prefectures.length];
		for (int i = 0;i < prefectures.length;i++) {
			list[i] = getString(Integer.parseInt(prefectures[i]));
		}
	}
	
	public void sort(String s) {
		String[][] prefectures = new String[list.length][3];
		for (int i = 0;i < list.length;i++) {
			prefectures[i] = list[i].split(":");
		}
		switch(s) {
		case "昇順":
			for (int i = 0;i < list.length;i++) {
				for (int j = 0;j < list.length - i - 1;j++) {
					if(Integer.parseInt(prefectures[j][2]) 
							> Integer.parseInt(prefectures[j + 1][2])) {
						for(int a = 0;a < 3;a++) {
							String st =  prefectures[j][a];
							prefectures[j][a] = prefectures[j + 1][a];
							prefectures[j + 1][a] = st;
						}
					}
				}
			}
			break;
		case "降順":
			for (int i = 0;i < list.length;i++) {
				for (int j = 0;j < list.length - i - 1;j++) {
					if(Integer.parseInt(prefectures[j][2]) 
							< Integer.parseInt(prefectures[j + 1][2])) {
						for(int a = 0;a < 3;a++) {
							String st =  prefectures[j][a];
							prefectures[j][a] = prefectures[j + 1][a];
							prefectures[j + 1][a] = st;
						}
					}
				}
			}
			break;
		}
		for (int i = 0;i < list.length;i++) {
			list[i] = prefectures[i][0] + ":" + prefectures[i][1] + ":" + prefectures[i][2];
		}
	}
	
	public void print() {
		String[][] prefectures = new String[list.length][3];
		for (int i = 0;i < list.length;i++) {
			prefectures[i] = list[i].split(":");
		}
		for (int i = 0;i < list.length;i++) {
			System.out.println("都道府県名名：" + prefectures[i][0]);
			System.out.println("県庁所在地：" + prefectures[i][1]);
			System.out.println("面積：" + prefectures[i][2] + ".0km2");
			System.out.println("");
		}
	}
}
