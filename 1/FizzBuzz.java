// 練習問題1-4
// https://ksuap.github.io/2022autumn/lesson01/assignments/#4-fizzbuzz

public class FizzBuzz {
  public static void main(String[] args) {

    Integer n = 15;

    if (args.length > 0) {
      Integer.valueOf(args[0]);
    }

    for (int i = 1; i <= n; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("FizzBuzz");
      } else if (i % 3 == 0) {
        System.out.println("Fizz");
      } else if (i % 5 == 0) {
        System.out.println("Buzz");
      } else {
        System.out.println(i);
      }
    }
  }
}
