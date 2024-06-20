// 第07講 小テスト7-2 FileCounter
// https://cclms.kyoto-su.ac.jp/mod/assign/view.php?id=152788

// コマンドライン引数で指定されたディレクトリに格納されているファイル，
// ディレクトリ一覧を表示してください（１階層のみ）．
// その後，出力したもののうち，ファイルの数，ディレクトリの数を出力してください．
// クラス名はFileCounterとしてください．

import java.io.File;

public class FileCounter {
  public static void main(String[] args) {
    if (args.length != 1) {
      System.out.println("no argument");
      return;
    }

    String path = args[0];
    File directory = new File(path);

    // 存在するかの判定
    if (!directory.exists()) {
      System.out.printf("%s: not found\n", directory.getName());
      return;
    }

    // ディレクトリかどうかの判定
    if (!directory.isDirectory()) {
      System.out.printf("%s: not directory\n", directory.getName());
      return;
    }

    File[] files = directory.listFiles();

    Integer fileCount = 0, dirCount = 0;

    for (File file : files) {
      if (file.isFile()) {
        fileCount++;
      } else if (file.isDirectory()) {
        dirCount++;
      }
      System.out.println(file.getName());
    }

    System.out.printf("file: %d, dir: %d\n", fileCount, dirCount);
  }
}
