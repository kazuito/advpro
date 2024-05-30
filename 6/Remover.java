// 第06講 ファイル 練習問題6-4 ファイル，ディレクトリを削除するコマンド remove 
// https://ksuap.github.io/2022autumn/lesson06/assignments/#4-ファイルディレクトリを削除するコマンド-remove

import java.io.File;

public class Remover {
  void run(String[] args) {
    if (args.length == 0) {
      System.out.println("enter file or directory name.");
      return;
    }

    for (String arg : args) {
      File f = new File(arg);

      if (f.exists()) {
        if (f.isDirectory()) {
          rmDir(f);
        } else {
          f.delete();
        }
      } else {
        System.out.println(arg + ": No such file or directory.");
      }
    }
  }

  void rmDir(File dir) {
    for (File file : dir.listFiles()) {
      if (file.isDirectory()) {
        // ディレクトリ内のファイルを再帰的に削除
        rmDir(file);
      } else {
        // ファイルを削除
        file.delete();
      }
    }

    // ディレクトリを削除
    dir.delete();
  }

  public static void main(String[] args) {
    Remover rm = new Remover();
    rm.run(args);
  }
}
