// 第2講 メソッド（関数） 例題2-3
// https://ksuap.github.io/2022autumn/lesson02/method/#例題３
public class Factorial2{
    void run(String[] args){
        Integer number = Integer.valueOf(args[0]);
        Integer factorial = this.factorial(number);
        // number の階乗を計算する．
        System.out.printf("%d! = %d%n", number, factorial);
    }
    Integer factorial(Integer max){
        Integer factorial = 1;
        for(Integer i = 1; i <= max; i++){
            factorial = factorial * i;
        }
        return factorial;
    }
    public static void main(String[] args){
        Factorial2 factorial = new Factorial2();
        factorial.run(args);
    }
}
