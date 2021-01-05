package 総当たりのつらさ;

public class Analyse2 {
	public static StringBuilder getPass = new StringBuilder("");
	final StringBuilder nullPass = new StringBuilder("");

	/*
	 * StringBuilder を比較していく
	 * 1文字目が分かると二文字目に移行
	 * 2文字目が分かると三文字目に移行
	 *次の文字がなくなった時点で終了
	 */

	public Analyse2(StringBuilder Pass) {
		if (Pass.equals(nullPass)) {
			System.out.println("パスワードが存在しません");
		}
		int a1 = 0;
		for (int i=0;i<1000000;i++) {
			getPass.append("あ");
			a1 = 0;
			do {
				getPass.delete(i, i+1);
				getPass.append((char) a1);
				System.out.println(getPass);
				a1++;
			} while (!(getPass.substring(i, i+1).equals(Pass.subSequence(i, i+1))));
			try {
				if (Pass.substring(i+1, i+2).equals(null)) {
					System.out.println("次の文字がありません");
				}
			} catch (IndexOutOfBoundsException e) {
				System.out.println("解析が終了しました");
				System.out.println(Pass + "/" + getPass);
				System.out.println("終了します");
				System.exit(0);
				e.printStackTrace();
			}
		}
	}
}
