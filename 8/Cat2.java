// 第８講 練習問題8-1 行番号付きのCatコマンドの作成
// https://ksuap.github.io/2022autumn/lesson08/assignments/#1-行番号付きの-cat-コマンドの作成

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Cat2 {
  void run(String[] args) throws IOException {
    cat(new File(args[0]));
  }

  void cat(File file) throws IOException {
    BufferedReader in = new BufferedReader(new FileReader(file));
    String line;
    Integer lineNumber = 1;
    while ((line = in.readLine()) != null) {
      System.out.printf("%4s  %s\n", lineNumber, line);
      lineNumber++;
    }
    in.close();
  }

  public static void main(String[] args) throws IOException {
    Cat2 cat = new Cat2();
    cat.run(args);
  }
}
