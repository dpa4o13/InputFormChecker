//---------------------------------------------------------------------//
/**ユーザー名をチェックする
 * 半角の英大文字・小文字・数字・アンダーバー（_）のみ有効
 */
//---------------------------------------------------------------------//
package checker;

import difine.DifineI;

public class UserChecker implements DifineI {

	/**
	 * チェックの実行
	 * @param string チェックされる文字列
	 * @return
	 */
	public String check(String string) {

		// 文字列から1文字ずつ取り出し、いずれかのリストに当てはまればOK
		// なお、1文字目だけはアルファベットのみ有効とする

		// 1文字目の処理
		char c = string.charAt(0);
		if (!(Character.isUpperCase(c) || Character.isLowerCase(c))) {
			return RESULT_BAD + " : 1文字目は半角英字を入力してください";
		}
		// 2文字目以降の処理
		String s = string.substring(1);
		if (!s.matches(RE_USER)) {
			return RESULT_BAD + " : ユーザー名は半角英数字とアンダーバーのみ許可されています";
		}
		return RESULT_GOOD;
	}
}
