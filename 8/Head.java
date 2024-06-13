// 第８講 練習問題8-3 Headコマンドの作成
// https://ksuap.github.io/2022autumn/lesson08/assignments/#3-head-コマンドの作成

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Head {

  void run(String[] args) throws IOException {
    Integer maxLine = Integer.parseInt(args[0]);
    BufferedReader in;

    // コマンドライン引数が1つしか与えられなかった場合．
    if (args.length == 1) {
      in = new BufferedReader(new InputStreamReader(System.in));
    } else {
      in = new BufferedReader(new FileReader(args[1]));
    }

    String line;

    for (int i = 0; i < maxLine; i++) {
      line = in.readLine();
      System.out.println(line);
    }

    in.close();
  }

  public static void main(String[] args) throws IOException {
    Head head = new Head();
    head.run(args);
  }
}
