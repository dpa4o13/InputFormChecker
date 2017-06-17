//---------------------------------------------------------------------//
/**パスワードをチェックする
 *
 *
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

	public String check(String string) {

		String result = "";


		if (result.equals("OK!")) {
			return RESULT_GOOD;
		} else {

		}
		return RESULT_BAD;
	}

}
