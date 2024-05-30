public class Echo {

  void run(String[] args) {
    boolean newLine = true;

    for (int i = 0; i < args.length; i++) {
      if (args[i].equals("-n")) {
        newLine = false;
      } else if (args[i].equals("-h")) {
        printHelp();
        return;

      } else {
        System.out.print(args[i]);
        if (i < args.length - 1) {
          System.out.print(" ");
        }
      }
    }
    if (newLine) {
      System.out.println();
    }
  }

  private void printHelp() {
    System.out.println("java Echo [OPTIONS] <string...>");
    System.out.println("OPTIONS");
    System.out.println("    -h: このメセージを表示して終了する.");
    System.out.println("    -n: 開業せずに出力する.");
  }

  public static void main(String[] args) {
    Echo echo = new Echo();
    echo.run(args);
  }
}
