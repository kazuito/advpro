// 練習問題1-5
// https://ksuap.github.io/2022autumn/lesson01/assignments/#5-fibonacci数列

public class Fibonacci {
  void run(String[] args) {

    Integer number = 20;

    if (args.length > 0) {
      number = Integer.valueOf(args[0]);
    }

    Integer prev = 0;
    Integer cur = 1;
    Integer next = 0;

    for (int i = 1; i <= number; i++) {
      if (i == 1) {
        System.out.print(cur);
      } else {
        next = prev + cur;
        prev = cur;
        cur = next;
        System.out.print(next);
      }
      System.out.print(' ');
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Fibonacci fibonacci = new Fibonacci();
    fibonacci.run(args);
  }
}
