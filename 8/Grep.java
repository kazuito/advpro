// 第８講 練習問題8-2 Grepコマンドの作成
// https://ksuap.github.io/2022autumn/lesson08/assignments/#2-grep-コマンドの作成

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Grep {
  void run(String[] args) throws IOException {
    String targetStr = args[0];

    for (int i = 1; i < args.length; i++) {
      grep(new File(args[i]), targetStr);
    }
  }

  void grep(File file, String targetStr) throws IOException {
    BufferedReader in = new BufferedReader(new FileReader(file));
    String line;

    while ((line = in.readLine()) != null) {
      if (line.contains(targetStr)) {
        System.out.printf("%s: %s\n", file.getName(), line);
      }
    }

    in.close();
  }

  public static void main(String[] args) throws IOException {
    Grep grep = new Grep();
    grep.run(args);
  }
}
