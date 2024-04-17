public class NameReverser {
  public static void main(String[] args) {
    String name = "Ito Kazuma";

    System.out.println(name);

    for (Integer i = name.length() - 1; i >= 0; i--) {
      System.out.print(name.charAt(i));
    }

    System.out.println();
  }
}
