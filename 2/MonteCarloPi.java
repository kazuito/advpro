// 第2講 練習問題2-4 モンテカルロ法によるπの計算
// https://ksuap.github.io/2022autumn/lesson02/assignments/#4-モンテカルロ法によるpiの計算

public class MonteCarloPi {
  void run(String[] args) {
    Integer n = 1000;

    if (args.length > 0) {
      n = Integer.parseInt(args[0]);
    }

    Integer hitCount = 0;

    for (int i = 0; i < n; i++) {
      if (hitOrNot()) {
        hitCount++;
      }
    }

    Double pi = 4.0 * hitCount / n;

    System.out.printf("pi = %f\n", pi);
  }

  Boolean hitOrNot() {
    Double x = Math.random();
    Double y = Math.random();

    Double distance = Math.sqrt(x * x + y * y);

    return distance <= 1;
  }

  public static void main(String[] args) {
    MonteCarloPi pi = new MonteCarloPi();
    pi.run(args);
  }
}
