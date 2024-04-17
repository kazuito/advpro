// 練習問題0-1
// https://ksuap.github.io/2022autumn/lesson00/assignments/#1-big--small
public class BigAndSmall {
    public static void main(String[] args) {
        Double value = Math.random();
        // valueには0から1の乱数が代入されている．
        System.out.printf("value: %f: ", value);

        // ここに判定のプログラムを書いていく．
        if (value < 0.5) {
            System.out.println("Small");
        } else {
            System.out.println("Big");
        }
    }
}
