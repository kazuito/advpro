// 第2講 練習問題2-3 二次方程式の解
// https://ksuap.github.io/2022autumn/lesson02/assignments/#3-二次方程式の解

public class QuadraticEquation {
  void run(String[] args) {
    Double a = Double.parseDouble(args[0]);
    Double b = Double.parseDouble(args[1]);
    Double c = Double.parseDouble(args[2]);
    Double d = discriminant(a, b, c);
    solve(a, b, c, d);
  }

  Double discriminant(Double a, Double b, Double c) {
    return b * b - 4 * a * c;
  }

  void solve(Double a, Double b, Double c, Double d) {
    if (d > 0) {
      Double x1 = (-b + Math.sqrt(d)) / (2 * a);
      Double x2 = (-b - Math.sqrt(d)) / (2 * a);
      System.out.printf("answer = %f, %f\n", x1, x2);
    } else if (d == 0) {
      Double x = -b / (2 * a);
      System.out.printf("x = %f\n", x);
    } else {
      Double real = -b / (2 * a);
      Double imaginary = Math.sqrt(-d) / (2 * a);
      System.out.printf("answer = %f + %f i, %f - %f i\n", real, imaginary, real, imaginary);
    }
  }

  public static void main(String[] args) {
    QuadraticEquation solver = new QuadraticEquation();
    solver.run(args);
  }
}
