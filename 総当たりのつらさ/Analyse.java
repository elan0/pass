package 総当たりのつらさ;

public class Analyse extends Thread {

	//ループ用
	public static int b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;

	//文字用int
	public static int a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;

	//パスワード総当たり
	public static StringBuilder getPass = new StringBuilder();

	public static long startTime = System.currentTimeMillis();

	public Analyse(int check, StringBuilder Pass) {
		startTime = System.currentTimeMillis();
		switch (check) {
		case 0:
			System.out.println("パスワードが存在しません");
			break;
		case 1:
			analyse1(Pass);
			break;
		case 2:
			analyse2(Pass);
			break;
		case 3:
			analyse3(Pass);
			break;
		case 4:
			analyse4(Pass);
			break;
		case 5:
			analyse5(Pass);
			break;
		case 6:
			analyse6(Pass);
			break;
		case 7:
			analyse7(Pass);
			break;
		case 8:
			analyse8(Pass);
			break;
		case 9:
			break;
		case 10:
			break;
		default:
			System.out.println("無理です");
			break;
		}
	}

	public static void analyse1(StringBuilder Password) {
		//1文字
		for (b1 = 0; b1 < 58; b1++) {
			a1 = b1 + 65;
			getPass.append((char) a1);
			System.out.println(getPass);

			if (getPass.toString().contentEquals(Password)) {
				System.out.println("パスワードが解析されました");
				long endTime = System.currentTimeMillis();
				System.out.println((endTime - startTime) + "/秒");
				System.exit(0);
			}
			getPass.delete(0, 1);
		}
	}

	public static void analyse2(StringBuilder Password) {
		//二文字
		for (b1 = 0; b1 < 58; b1++) {
			a1 = b1 + 65;
			getPass.append((char) a1);
			for (b2 = 0; b2 < 58; b2++) {
				a2 = b2 + 65;
				getPass.append((char) a2);
				System.out.println(getPass);

				if (getPass.toString().contentEquals(Password)) {
					System.out.println("パスワードが解析されました");
					long endTime = System.currentTimeMillis();
					System.out.println((endTime - startTime) + "/秒");
					System.exit(0);
				}
				getPass.delete(1, 2);
			}
			getPass.delete(0, 1);
		}
	}

	public static void analyse3(StringBuilder Password) {
		//三文字
		for (b1 = 0; b1 < 58; b1++) {
			a1 = b1 + 65;
			getPass.append((char) a1);
			for (b2 = 0; b2 < 58; b2++) {
				a2 = b2 + 65;
				getPass.append((char) a2);
				for (b3 = 0; b3 < 58; b3++) {
					a3 = b3 + 65;
					getPass.append((char) a3);
					System.out.println(getPass);

					if (getPass.toString().contentEquals(Password)) {
						System.out.println("パスワードが解析されました");
						long endTime = System.currentTimeMillis();
						System.out.println((endTime - startTime) + "/秒");
						System.exit(0);
					}
					getPass.delete(2, 3);
				}
				getPass.delete(1, 2);
			}
			getPass.delete(0, 1);
		}
	}

	public static void analyse4(StringBuilder Password) {
		//四文字
		for (b1 = 0; b1 < 58; b1++) {
			a1 = b1 + 65;
			getPass.append((char) a1);
			for (b2 = 0; b2 < 58; b2++) {
				a2 = b2 + 65;
				getPass.append((char) a2);
				for (b3 = 0; b3 < 58; b3++) {
					a3 = b3 + 65;
					getPass.append((char) a3);
					for (b4 = 0; b4 < 58; b4++) {
						a4 = b4 + 65;
						getPass.append((char) a4);
						System.out.println(getPass);
						if (getPass.toString().contentEquals(Password)) {
							System.out.println("パスワードが解析されました");
							long endTime = System.currentTimeMillis();
							System.out.println((endTime - startTime) + "/秒");
							System.exit(0);
						}
						getPass.delete(3, 4);
					}
					getPass.delete(2, 3);
				}
				getPass.delete(1, 2);
			}
			getPass.delete(0, 1);
		}
	}

	public static void analyse5(StringBuilder Password) {
		//五文字
		for (b1 = 0; b1 < 58; b1++) {
			a1 = b1 + 65;
			getPass.append((char) a1);
			for (b2 = 0; b2 < 58; b2++) {
				a2 = b2 + 65;
				getPass.append((char) a2);
				for (b3 = 0; b3 < 58; b3++) {
					a3 = b3 + 65;
					getPass.append((char) a3);
					for (b4 = 0; b4 < 58; b4++) {
						a4 = b4 + 65;
						getPass.append((char) a4);
						for (b5 = 0; b5 < 58; b5++) {
							a5 = b5 + 65;
							getPass.append((char) a5);
							System.out.println(getPass);
							if (getPass.toString().contentEquals(Password)) {
								System.out.println("パスワードが解析されました");
								long endTime = System.currentTimeMillis();
								System.out.println((endTime - startTime) + "/秒");
								System.exit(0);
							}
							getPass.delete(4, 5);

						}
						getPass.delete(3, 4);
					}
					getPass.delete(2, 3);
				}
				getPass.delete(1, 2);
			}
			getPass.delete(0, 1);
		}
	}

	public static void analyse6(StringBuilder Password) {
		//六文字
		for (b1 = 0; b1 < 58; b1++) {
			a1 = b1 + 65;
			getPass.append((char) a1);
			for (b2 = 0; b2 < 58; b2++) {
				a2 = b2 + 65;
				getPass.append((char) a2);
				for (b3 = 0; b3 < 58; b3++) {
					a3 = b3 + 65;
					getPass.append((char) a3);
					for (b4 = 0; b4 < 58; b4++) {
						a4 = b4 + 65;
						getPass.append((char) a4);
						for (b5 = 0; b5 < 58; b5++) {
							a5 = b5 + 65;
							getPass.append((char) a5);
							for (b6 = 0; b6 < 58; b6++) {
								a6 = b6 + 65;
								getPass.append((char) a6);
								System.out.println(getPass);
								if (getPass.toString().contentEquals(Password)) {
									System.out.println("パスワードが解析されました");
									long endTime = System.currentTimeMillis();
									System.out.println((endTime - startTime) + "/秒");
									System.exit(0);
								}
								getPass.delete(5, 6);
							}
							getPass.delete(4, 5);
						}
						getPass.delete(3, 4);
					}
					getPass.delete(2, 3);
				}
				getPass.delete(1, 2);
			}
			getPass.delete(0, 1);
		}
	}

	public static void analyse7(StringBuilder Password) {
		//七文字
		for (b1 = 0; b1 < 58; b1++) {
			a1 = b1 + 65;
			getPass.append((char) a1);
			for (b2 = 0; b2 < 58; b2++) {
				a2 = b2 + 65;
				getPass.append((char) a2);
				for (b3 = 0; b3 < 58; b3++) {
					a3 = b3 + 65;
					getPass.append((char) a3);
					for (b4 = 0; b4 < 58; b4++) {
						a4 = b4 + 65;
						getPass.append((char) a4);
						for (b5 = 0; b5 < 58; b5++) {
							a5 = b5 + 65;
							getPass.append((char) a5);
							for (b6 = 0; b6 < 58; b6++) {
								a6 = b6 + 65;
								getPass.append((char) a6);
								for (b7 = 0; b7 < 58; b7++) {
									a7 = b7 + 65;
									getPass.append((char) a7);
									System.out.println(getPass);
									if (getPass.toString().contentEquals(Password)) {
										System.out.println("パスワードが解析されました");
										long endTime = System.currentTimeMillis();
										System.out.println((endTime - startTime) + "/秒");
										System.exit(0);
									}
									getPass.delete(6, 7);
								}
								getPass.delete(5, 6);
							}
							getPass.delete(4, 5);
						}
						getPass.delete(3, 4);
					}
					getPass.delete(2, 3);
				}
				getPass.delete(1, 2);
			}
			getPass.delete(0, 1);
		}

	}

	public static void analyse8(StringBuilder Password) {
		//八文字
		for (b1 = 0; b1 < 58; b1++) {
			a1 = b1 + 65;
			getPass.append((char) a1);
			for (b2 = 0; b2 < 58; b2++) {
				a2 = b2 + 65;
				getPass.append((char) a2);
				for (b3 = 0; b3 < 58; b3++) {
					a3 = b3 + 65;
					getPass.append((char) a3);
					for (b4 = 0; b4 < 58; b4++) {
						a4 = b4 + 65;
						getPass.append((char) a4);
						for (b5 = 0; b5 < 58; b5++) {
							a5 = b5 + 65;
							getPass.append((char) a5);
							for (b6 = 0; b6 < 58; b6++) {
								a6 = b6 + 65;
								getPass.append((char) a6);
								for (b7 = 0; b7 < 58; b7++) {
									a7 = b7 + 65;
									getPass.append((char) a7);
									for (b8 = 0; b8 < 58; b8++) {
										a8 = b8 + 65;
										getPass.append((char) a8);
									System.out.println(getPass);
									if (getPass.toString().contentEquals(Password)) {
										System.out.println("パスワードが解析されました");
										long endTime = System.currentTimeMillis();
										System.out.println((endTime - startTime) + "/秒");
										System.exit(0);
									}
									getPass.delete(7, 8);
									}
									getPass.delete(6, 7);
								}
								getPass.delete(5, 6);
							}
							getPass.delete(4, 5);
						}
						getPass.delete(3, 4);
					}
					getPass.delete(2, 3);
				}
				getPass.delete(1, 2);
			}
			getPass.delete(0, 1);
		}
	}
}
