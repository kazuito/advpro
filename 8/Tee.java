// 第８講 練習問題8-4 Teeコマンドの作成
// https://ksuap.github.io/2022autumn/lesson08/assignments/#4-tee-コマンドの作成

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Tee {
  void run(String[] args) throws IOException {

    String fileName = args[0];

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter writer = new PrintWriter(new FileWriter(fileName));

    String line;

    while ((line = in.readLine()) != null) {
      System.out.println(line);
      writer.println(line);
    }

    writer.close();
  }

  public static void main(String[] args) throws IOException {
    Tee tee = new Tee();
    tee.run(args);
  }
}
