import java.util.ArrayList;

public class LinearCongruentialGenerator {
  public static void main(String[] args) {
    Integer n = 10;

    if (args.length > 0) {
      n = Integer.parseInt(args[0]);
    }

    ArrayList<Double> randomNumbers = generateRandomNumbers(n);

    System.out.println(randomNumbers);
  }

  public static ArrayList<Double> generateRandomNumbers(Integer n) {
    ArrayList<Double> results = new ArrayList<>();
    Integer A = 130;
    Integer B = 1;
    Integer M = 65535;
    Integer X0 = 19;

    Integer Xn = X0;

    for (Integer i = 0; i < n; i++) {
      Xn = (A * Xn + B) % M;
      results.add(1.0 * Xn / M);
    }

    return results;
  }
}
