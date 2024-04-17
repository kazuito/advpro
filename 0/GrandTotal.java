// 練習問題0-3
// https://ksuap.github.io/2022autumn/lesson00/assignments/#3-総和を求める

public class GrandTotal {
  public static void main(String[] args) {
    Integer result = 0;

    Integer i = 0;

    while (i <= 100) {
      result += i;
      i++;
    }

    System.out.printf("1から10までの総和は%dです．%n", result);
  }
}
