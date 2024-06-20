// 第06講 ファイル 練習問題6-3 ディレクトリを作成するコマンド mkdir の改良
// https://ksuap.github.io/2022autumn/lesson06/assignments/#3-ディレクトリを作成するコマンド-mkdir-の改良

import java.io.File;

public class MakeDirectories {

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

    // mkdirs()メソッドでディレクトリを作成
    if (!dir.mkdirs()) {
      System.out.println(dirName + ": could not make directory.");
    }
  }

  public static void main(String[] args) {
    MakeDirectories mkdir = new MakeDirectories();
    mkdir.run(args);
  }
}
