
/**
 * クラス名:Javapractice2_1
 *  * 概要    :演習2-1
 * 作成者  :小玉有哉
 * 作成日  :2025.05.12
 */

public class Javapractice2_1 {
	
	 /**
     * 関数名           :main
     * メソッドの説明   :コンソールに改行文字を表示するメソッド
     * パラメータの説明 :なし
     * 返り値           :なし
     * 作成者           :小玉有哉
     * 作成日           :2025.05.12
     */
	public static void main(String[] args) {
		// 整数xの変数宣言
		int x;
		//整数yの変数宣言
		int y;
		
		//変数xに63を代入
		x = 63;
		//変数yに18を代入
		y = 18;
		
		//変数xの値を出力
		System.out.println("xの値は" + x + "です。");
		//変数yの値を出力
		System.out.println("yの値は" + y + "です。");
		//xとyの合計を出力
		System.out.println("合計は" + (x+y) + "です。");
		//xとyの合計を2で割った値を出力
		System.out.println("平均は" +(x+y) / 2 + "です。");
		

	}

}
