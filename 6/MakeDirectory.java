// 第06講 ファイル 練習問題6-2 ディレクトリを作成するコマンド mkdir
// https://ksuap.github.io/2022autumn/lesson06/assignments/#2-ディレクトリを作成するコマンド-mkdir

import java.io.File;

public class MakeDirectory {

  void run(String[] args) {

    if (args.length == 0) {
      System.out.println("enter dir name.");
      return;
    }

    for (String arg : args) {
      makeDirectory(arg);
    }

  }

  void makeDirectory(String dirName) {
    File dir = new File(dirName);
    if (!dir.mkdir()) {
      System.out.println(dirName + ": could not make directory.");
    }
  }

  public static void main(String[] args) {
    MakeDirectory mkdir = new MakeDirectory();
    mkdir.run(args);
  }
}
