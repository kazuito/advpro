// 練習問題0-5
// https://ksuap.github.io/2022autumn/lesson00/assignments/#5-xの描画

public class XPrinter {
  public static void main(String[] args) {
    Integer size = 10;

    for (Integer i = 0; i < size; i++) {
      for (Integer j = 0; j < size; j++) {
        if (i == j || i + j == size - 1) {
          System.out.print("X");
        } else {
          System.out.print(".");
        }
      }
      System.out.println();
    }
  }
}
