// 第1講 コマンドライン引数 例題1 ArgsPrinter
// https://ksuap.github.io/2022autumn/lesson01/args/#例題1-argsprinter
public class ArgsPrinter{
    void run(String[] args){
        // args のインデックスの0番目から最後までを繰り返して，
        // args の各要素を出力してみましょう．
        for(Integer i = 0; i < args.length; i++){
            // 何番目の要素として，何が配列の要素として格納されているかを確認しましょう．
            System.out.printf("%d: %s%n", i, args[i]);
        }
    }
    public static void main(String[] args){
        ArgsPrinter printer = new ArgsPrinter();
        printer.run(args);
    }
}
