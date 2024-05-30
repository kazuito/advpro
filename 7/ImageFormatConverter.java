// 第07講 画像操作 練習問題7-2 ファイルフォーマット変換
// https://ksuap.github.io/2022autumn/lesson07/assignments/#2-ファイルフォーマット変換

import java.io.File;

public class ImageFormatConverter {


  void run(String[] args) {

    if (args.length != 2) {
      System.out.println("specify two arguments.");
      return;
    }

    File originalFile = new File(args[0]);
    File newFile = new File(args[1]);

    

  }

  public void main(String[] args) {
    ImageFormatConverter ifc = new ImageFormatConverter();
    ifc.run(args);
  }
}
