//---------------------------------------------------------------------//
/**
 * 住所をチェックする
 * すべて全角文字
 * （空白は半角全角ともに許可する）
 */
//---------------------------------------------------------------------//
package checker;

import difine.DifineI;

/**
 * 住所の入力内容をチェックする
 * @author m4usta13ng
 *
 */
public class AdressChecker implements DifineI {

	/**
	 * 判定する
	 * @param string 判定対象の文字列
	 * @return 判定結果の文章
	 */
	public String check(String string) {

		// 文字列の内容チェック
		for (int i = 0; i < string.length(); i++) {
			String s = string.substring(i, i + 1);
			if (s.matches(RE_ADRESS_ZENKAKU) | s.matches(RE_ADRESS_HAN_SPACE)) {
				/* DO NOTHING */
			} else {
				return RESULT_BAD;
			}
		}
		return RESULT_GOOD;
	}

}
