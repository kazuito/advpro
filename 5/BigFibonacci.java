import java.math.BigInteger;
import java.util.ArrayList;

public class BigFibonacci {
  public static void main(String[] args) {
    BigFibonacci bf = new BigFibonacci();
    bf.run(args);
  }

  void run(String[] args) {
    ArrayList<Integer> targets = findTargets(args);

    for (Integer i = 0; i < targets.size(); i++) {
      BigInteger result = calculate(targets.get(i));
      System.out.printf("fibonacci(%d) = %d%n", targets.get(i), result);
    }
  }

  ArrayList<Integer> findTargets(String[] args) {
    ArrayList<Integer> targets = new ArrayList<>();

    if (args.length == 0) {
      targets.add(10);
    } else {
      for (Integer i = 0; i < args.length; i++) {
        targets.add(Integer.valueOf(args[i]));
      }
    }

    return targets;
  }

  BigInteger calculate(int n) {
    if (n == 0) {
      return BigInteger.ZERO;
    }
    if (n == 1) {
      return BigInteger.ONE;
    }

    BigInteger a = BigInteger.ZERO;
    BigInteger b = BigInteger.ONE;
    BigInteger c = BigInteger.ZERO;

    for (int i = 2; i <= n; i++) {
      c = a.add(b);
      a = b;
      b = c;
    }

    return c;
  }
}
