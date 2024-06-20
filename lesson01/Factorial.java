// 練習問題1-3
// https://ksuap.github.io/2022autumn/lesson01/assignments/#3-階乗
public class Factorial {
    void run(String[] args) {
        Integer number = Integer.valueOf(args[0]);
        Integer factorial = 1;
        // number の階乗を計算する．

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.printf("%d! = %d%n", number, factorial);
    }
    // mainメソッドは省略

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        factorial.run(args);
    }
}
