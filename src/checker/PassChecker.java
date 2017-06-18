//---------------------------------------------------------------------//
/**
 * パスワードをチェックする
 * 半角英数字・一部記号のみ有効
 * 有効な記号…"!,#,$,%"
 * 大文字・小文字・数字・記号のすべてが含まれていなければいけない
 */
//---------------------------------------------------------------------//
package checker;

import difine.DifineI;

/**
 * パスワードをチェックする
 * 大文字、小文字、記号がそれぞれ入っていればOK
 * @author m4usta13ng
 *
 */
public class PassChecker implements DifineI {

	/**
	 *
	 * @param string
	 * @return
	 */
	public String check(String string) {

		// 各文字が見つかったときに立てるフラグ
		boolean isThereUpper = false;	// 大文字はあるか？
		boolean isThereLower = false;	// 小文字はあるか？
		boolean isThereNumber = false;	// 数字はあるか？
		boolean isThereSymbol = false;	// 記号はあるか？
		boolean isPassCollect = false;	// パスワードとして適切か？

		// 文字数のチェック（8文字以上）
		if (string.length() < 8) {
			return RESULT_BAD;
		}

		// 文字列の内容チェック
		for (int i = 0; i < string.length(); i++) {
			if (i == 0) {				// 1文字目、半角英数字のみ有効
				String s = string.substring(0, 1);
				if (s.matches(RE_PASS_UPPER)) {
					isThereUpper = true;
				} else if (s.matches(RE_PASS_LOWER)) {
					isThereLower = true;
				} else if (s.matches(RE_PASS_NUMBER)) {
					isThereNumber = true;
				} else {
					return RESULT_BAD;
				}
			} else {					// 2文字目以降の処理
				String s = string.substring(i, i + 1);
				if (s.matches(RE_PASS_UPPER)) {
					isThereUpper = true;
				} else if (s.matches(RE_PASS_LOWER)) {
					isThereLower = true;
				} else if (s.matches(RE_PASS_NUMBER)) {
					isThereNumber = true;
				} else if (s.matches(RE_PASS_SYMBOL)) {
					isThereSymbol = true;
				} else {
					return RESULT_BAD;
				}
			}
		}
		if (isThereUpper && isThereLower && isThereNumber && isThereSymbol) {
			isPassCollect = true;
		} else {
			return RESULT_BAD;
		}

		if (isPassCollect) {
			return RESULT_GOOD;
		}

		return RESULT_BAD;
	}
}
