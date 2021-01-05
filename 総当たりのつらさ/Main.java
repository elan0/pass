package 総当たりのつらさ;

import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static StringBuilder Password = new StringBuilder("");

	//ループ用
	public static int b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;

	//文字用int
	public static int a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;

	public static void main(String[] args) {
		//メニュー画面
		for (;;) {
			// *解読用見本集
			// 3.14159254358979
			// this video has been deleted
			//あなたとコンビニファミリーマート
			//㚿㍽糯繄䣵辷㾩㸟㲵废糬⿲楉鮲箚
			//������
			System.out.println("パスワード:"+Password+":");
			System.out.println("1,パスワードを作る（自動）");
			System.out.println("2,パスわーをを作る（手動）");
			System.out.println("3,パスワードを解読する");
			System.out.println("4,パスワードを解析する2");
			String startA = sc.nextLine();
			if (startA.equals("1") || startA.equals("2")
					|| startA.equals("3") || startA.equals("4")
					|| startA.equals("5") || startA.equals("6")
					|| startA.equals("7") || startA.equals("8")
					|| startA.equals("9") || startA.equals("0")) {
			} else {
				startA = "0";
			}
			int start =0;
			try {
				start = Integer.parseInt(startA);
			} catch (NumberFormatException e) {

				System.err.println("エラー");
			}
			switch (start) {
			case 1:
				makePass();
				break;
			case 2:
				makePass2();
				break;
			case 3:
				analysPass();
				break;
			case 4:
				analysePass2();
				break;
			default:
				break;
			}
		}

	}

	public static void makePass() {
		Password.delete(0, Password.length());
		System.out.println("桁数を入力して下さい");
		int mozi = sc.nextInt();
		int b = 0;

		for (int b1 = 0; b1 < mozi; b1++) {
			b = new java.util.Random().nextInt(58) + 65;
			Password.append((char) b);
		}
		System.out.println(Password);
	}

	public static void makePass2() {
		System.out.println("パスワードを入力してください");
		String a ="";
		a =sc.nextLine();
		StringBuilder Pass =new StringBuilder();
		Pass.append(a);
		Password =Pass;
	}

	public static void analysPass() {
		int check =Password.length();

		Analyse a =new Analyse(check,Password);
		a.checkAccess();
	}
	public static void analysePass2() {
		Analyse2 b =new Analyse2(Password);
		b.hashCode();
	}
}