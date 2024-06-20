// 第2講 練習問題2-1 与えられた文字列のソート 
// https://ksuap.github.io/2022autumn/lesson02/assignments/#1-与えられた文字列のソート

import java.util.Arrays;

public class ArgsSorter {
  void run(String[] args) {
    // ここで，printArray を呼び出し，"before"の一行を出力する．
    System.out.print("before: ");
    printArray(args);

    // argsの内容をソートするため，Arrays.sortメソッドを呼び出す．
    Arrays.sort(args); // <= args がソート済みになる．

    // ここで，printArray を呼び出し，"after"の一行を出力する．
    System.out.print("after: ");
    printArray(args);

  }

  // printArrayメソッドをここに書く．
  void printArray(String[] arr) {
    for (String s : arr) {
      System.out.print(s + ", ");
    }
    System.out.println();
  }

  // mainメソッド
  public static void main(String[] args) {
    ArgsSorter sorter = new ArgsSorter();
    sorter.run(args);
  }
}
