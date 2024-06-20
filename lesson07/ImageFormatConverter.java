// 第07講 画像操作 練習問題7-2 ファイルフォーマット変換
// https://ksuap.github.io/2022autumn/lesson07/assignments/#2-ファイルフォーマット変換

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageFormatConverter {

  void run(String[] args) throws IOException {

    if (args.length != 2) {
      System.out.println("input two arguments.");
      return;
    }

    File originalFile = new File(args[0]);
    File newFile = new File(args[1]);

    Integer dotIndex = newFile.getName().lastIndexOf(".");
    String newFileEx = newFile.getName().substring(dotIndex + 1).toLowerCase();

    ImageIO.write(ImageIO.read(originalFile), newFileEx, new File(args[1]));
  }

  public static void main(String[] args) throws IOException {
    ImageFormatConverter ifc = new ImageFormatConverter();
    ifc.run(args);
  }
}
