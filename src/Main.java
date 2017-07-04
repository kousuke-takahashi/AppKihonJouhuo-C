import java.util.Scanner;

public class Main {

	private static Scanner scan;

	/**
	 * メイン処理
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		// スキャナーの初期化
		scan = new Scanner(System.in);

		// 回答結果
		int[] ansers = new int[6];
		ansers[0] = toi1();// 問1の回答結果
		ansers[1] = toi2();// 問2の回答結果
		ansers[2] = toi3();// 問3の回答結果
		ansers[3] = toi4();// 問4の回答結果
		ansers[4] = toi5();// 問5の回答結果
		ansers[5] = toi6();// 問6の回答結果

		// それぞれの回答結果のまとめ処理

	}

	/**
	 * 問1
	 *
	 * @return
	 */
	public static int toi1() {
		// 回答番号
		int answer = 0;
		// 解答欄
		String[] kaitouList = new String[] { "犬派", "猫派", "サーバルキャット派" };

		// 質問内容を表示
		System.out.println("問1");
		System.out.println("あなたは犬派ですか？それとも猫派ですか？");

		// 解答欄を表示
		for (int i = 0; i < kaitouList.length; i++) {
			System.out.println("" + i + ":" + kaitouList[i]);
		}

		// ユーザーが答えを入力
		System.out.println("回答：");
		answer = Integer.valueOf(scan.next());

		// 回答結果を出力
		System.out.println("「" + kaitouList[answer] + "」が選択されました。");
		return answer;
	}

	/**
	 * 問2
	 *
	 * @return
	 */
	public static int toi2() {
		// 回答番号
		int answer = 0;

		return answer;
	}

	/**
	 * 問3
	 *
	 * @return
	 */
	public static int toi3() {
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		String[] s = {"排他的論理和(XOR)" , "否定論理積(NAND)" , "論理積(AND)" , "論理和(OR)"};
		System.out.println("問1");
		System.out.println("次に示す手順は，列中の少なくとも一つは1であるビット列が与えられたとき，最も右にある1を残し，");
		System.out.println("ほかのビットをすべて0にするアルゴリズムである。例えば，00101000が与えられたとき，00001000が求まる。aに入る論理演算はどれか。");
		System.out.println("手順1  与えられたビット列Aを符号なしの2進数と見なし，Aから1を引き，結果をBとする。");
		System.out.println("手順2  AとBの排他的論理和(XOR)を求め，結果をCとする。");
		System.out.println("手順3  AとCのaを求め，結果をAとする。");

		for(int i = 0; i < s.length; i++){
			System.out.println((i+1) + "." + s[i]);
		}

		System.out.print("解答欄 :");
		int n = sc.nextInt();


		if(n == 1 || n == 2 || n == 4){
			ans = 0;
			System.out.println("不正解！ 正解は3の「" + s[2] + "」");
		}

		else if(n == 3){
			ans = 20;
			System.out.println("正解！ 正解は3の「" + s[2] + "」");
		}

		return ans;
	}

	/**
	 * 問4
	 *
	 * @return
	 */
	public static int toi4() {
		// 回答番号
		int answer = 0;

		return answer;
	}

	/**
	 * 問5
	 *
	 * @return
	 */
	public static int toi5() {
		// 回答番号
		int answer = 0;

		return answer;
	}

	/**
	 * 問6
	 *
	 * @return
	 */
	public static int toi6() {
		// 回答番号
		int answer = 0;

		return answer;
	}
}
