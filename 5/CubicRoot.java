import java.util.ArrayList;

public class CubicRoot {
  public static void main(String[] args) {
    new CubicRoot().run(args);
  }

  void run(String[] args) {
    ArrayList<Double> targets = findTargets(args);

    for (int i = 0; i < targets.size(); i++) {
      Double result = calculate(targets.get(i));
      System.out.printf("cubic_root(%f) = %f %n",
          targets.get(i), result);
    }
  }

  ArrayList<Double> findTargets(String[] args) {
    ArrayList<Double> targets = new ArrayList<>();

    for (int i = 0; i < args.length; i++) {
      targets.add(Double.valueOf(args[i]));
    }

    return targets;
  }

  Double calculate(Double n) {
    Double threshold = 0.00001;
    Double xValue = 10.0;
    Double yValue = function(n, xValue);

    while (Math.abs(yValue) > threshold) {
      Double slant = 3 * xValue * xValue;
      Double x = yValue - (slant * xValue);
      xValue = -x / slant;
      yValue = function(n, xValue);
    }
    return xValue;
  }

  Double function(Double n, Double x) {
    return x * x * x - n;
  }
}
