//---------------------------------------------------------------------//
/**文字の内容をチェックする
 * メインクラス
 * 期待される入力内容
 * ・ユーザー名…英大文字・英小文字・数字（いずれも半角）
 * ・パスワード…英大文字・英小文字・数字・特定の記号がすべて含まれている
 *   （かついずれも半角）
 * ・住所…すべて全角で、漢字・かな・カナ、数字、ハイフン（ー）のみ
 *   （空白は許可する）
 */
//---------------------------------------------------------------------//
package main;

import java.util.ArrayList;

import difine.DifineI;

/**
 *
 * @author m4usta13ng
 *
 */
public class Main implements DifineI{

	/**
	 * メインメソッド
	 * チェック動作を管轄するManagerを呼ぶだけ
	 * @param args
	 */
	public static void main(String[] args) {

		// 入力される文字を記載する
		final String USER_NAME 	= "dpa4o13";	// ユーザー名
		final String PASS 		= "Kaname011$";	// パスワード
		final String ADRESS 	=
				"東京都千代田区１－２－３ レジデンスホゲホゲ"; // 住所

		System.out.println("あなたが入力したのは・・・");
		System.out.println("ユーザー名: " + USER_NAME);
		System.out.println("パスワード: " + PASS);
		System.out.println("住      所: " + ADRESS);

		// それぞれの文字をリストに格納する
		ArrayList<String> list = new ArrayList<String>();
		list.add(0, USER_NAME);
		list.add(1, PASS);
		list.add(2, ADRESS);

		// リストをマネジャーに渡し、その結果を表示する
		Manager manager = new Manager();
		System.out.println(manager.execute(list));
	}

}
