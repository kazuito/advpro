// 第1講 コマンドライン引数 例題2 コマンドライン引数とデフォルト値 
// https://ksuap.github.io/2022autumn/lesson01/args/#例題2-コマンドライン引数とデフォルト値
public class FindValueInArgs {
    void run(String[] args) {
        String value = "no arguments"; // デフォルト値を代入しておく．
        // もしコマンドライン引数に値が存在すれば
        if(args.length == 0) {
            // コマンドライン引数で与えられた値を value に代入する．
            value = args[0];
        }
        System.out.printf("args[0]: %s%n", value);
    }

    public static void main(String[] args) {
        FindValueInArgs app = new FindValueInArgs();
        app.run(args);
    }
}
