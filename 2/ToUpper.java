// 第2講 メソッド（関数） 例題2-1
// https://ksuap.github.io/2022autumn/lesson02/method/#例題１定義済みメソッドの呼び出し
public class ToUpper{
    void run(String[] args){
        for(Integer i = 0; i < args.length; i++){
            String value = args[i].toUpperCase();
            System.out.printf("%s -> %s%n", args[i], value);
        }
    }
    public static void main(String[] args){
        ToUpper upper = new ToUpper();
        upper.run(args);
    }
}
