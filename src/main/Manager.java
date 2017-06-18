//------------------------------------------------------------------------------------------------//
// チェック動作の総合管轄
//
//------------------------------------------------------------------------------------------------//
package main;

import java.util.ArrayList;

import checker.AdressChecker;
import checker.PassChecker;
import checker.UserChecker;
import difine.DifineI;

/**
 * チェック動作の総合管轄
 * @author m4usta13ng
 *
 */
public class Manager implements DifineI {

	private String message = ""; // チェック結果

	// ゲッターとセッター
	public String getMessage() { return message; }
	public void setMessage(String message) { this.message = message; }
	// デフォルトコンストラクタ
	public Manager() {}

	/**
	 * 実行
	 */
	public String execute(ArrayList<String> list) {

		// 各判定結果を格納するString型変数を用意
		String resultUserName = "";
		String resultPassword = "";
		String resultAdress   = "";

		// ユーザー名の判定
		UserChecker uc = new UserChecker();
		resultUserName = uc.check((String)list.get(0));

		// パスワードの判定
		PassChecker pc = new PassChecker();
		resultPassword = pc.check((String)list.get(1));

		// 住所の判定
		AdressChecker ac = new AdressChecker();
		resultAdress = ac.check((String)list.get(2));

		// チェック結果の文章を作成する
		setMessage(
				  "===判定結果======================================================="
				+ "\r\n"
				+ "ユーザー名: " + resultUserName
				+ "\r\n"
				+ "パスワード: " + resultPassword
				+ "\r\n"
				+ "住所      : " + resultAdress
				+ "\r\n"
				+ "==================================================================");

		// 結果をMainに返す
		return this.getMessage();
	}


}
