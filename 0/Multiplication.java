// 練習問題0-4
// https://ksuap.github.io/2022autumn/lesson00/assignments/#4-九九を表示する

public class Multiplication {
  public static void main(String[] args) {

    System.out.printf("   ");

    for (Integer i = 1; i <= 9; i++) {
      // x軸の数字を表示
      System.out.printf("%2d ", i);
    }

    System.out.println();

    for (Integer i = 1; i <= 9; i++) {
      // y軸の数字を表示
      System.out.printf("%2d ", i);

      for (Integer j = 1; j <= 9; j++) {
        // 掛け算の結果を表示
        System.out.printf("%2d ", i * j);
      }
      System.out.println();
    }
  }
}
