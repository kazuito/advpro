// 第2講 練習問題2-5 台形公式による積分計算を利用したπの計算
// https://ksuap.github.io/2022autumn/lesson02/assignments/#5-台形公式による積分計算を利用したpiの計算

public class TrapezoidalRulePi {
  void run(String[] args) {
    Double w = 0.0001;

    if (args.length > 0) {
      w = Double.parseDouble(args[0]);
    }

    Double sum = 0.0;

    for (Double x = 0.0; x < 1.0; x += w) {
      sum += w * (getHeight(x) + getHeight(x + w)) / 2;
    }

    Double pi = 4 * sum;

    System.out.printf("pi = %.16f\n", pi);
  }

  Double getHeight(Double x) {
    return Math.sqrt(Math.max(0, 1 - x * x));
  }

  public static void main(String[] args) {
    TrapezoidalRulePi pi = new TrapezoidalRulePi();
    pi.run(args);
  }
}
