// 練習問題1-2
// https://ksuap.github.io/2022autumn/lesson01/assignments/#2-helloworld-改2

public class HelloWorld3 {
  public static void main(String[] args) {
    String name = args[0];

    if (name.equals("World")) {
      System.out.println("Hi, World");
      return;
    }

    System.out.println("Hello, " + name);
  }
}
