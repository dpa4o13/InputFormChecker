//---------------------------------------------------------------------//
/**ベタ打ちするならここに書いてね
 * インタフェース
 *
 */
//---------------------------------------------------------------------//
package difine;

/**
 * 定義インタフェース
 * @author m4usta13ng
 * @ver 1.00
 */
public interface DifineI {

	// リザルトメッセージ
	final String RESULT_GOOD 	= "good!";	// 問題なし
	final String RESULT_BAD  	= "f**k";	// 問題あり

	// 許可される文字を種類別に提示
	//	final String UPPER_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";	// 英大文字
	//	final String LOWER_STRING = "abcdefghijklmnopqrstuvwxyz";	// 英小文字
	//	final String NUMBER_STRING = "0123456789";					// 数字

	// ユーザー名判定用
	final String RE_USER = "^[0-9a-zA-Z_]+$";	// 半角英数字、アンダーバー

	// パスワード判定用
	final String RE_PASS_UPPER = "[A-Z]";		// 半角英字・大文字
	final String RE_PASS_LOWER = "[a-z]";		// 半角英字・小文字
	final String RE_PASS_NUMBER = "[0-9]";		// 半角数字
	final String RE_PASS_SYMBOL = "[!#$%&'()*+,-./:;<=>?@^_`{|}~]";		// 特定の記号

	// 住所判定用
	final String RE_ADRESS_ZENKAKU = "[^ -~｡-ﾟ]";		// 全角文字
	final String RE_ADRESS_HAN_SPACE = "[ ]";			// 半角文字
	}
