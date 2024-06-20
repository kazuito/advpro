// 第07講 画像操作 練習問題7-3 グレースケール画像への変換
// https://ksuap.github.io/2022autumn/lesson07/assignments/#3-グレースケール画像への変換

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class GrayScaleFilter {

  void run(String[] args) throws IOException {
    if (args.length != 1) {
      System.out.println("enter an argument.");
      return;
    }

    File originalFile = new File(args[0]);
    BufferedImage source = ImageIO.read(originalFile);
    BufferedImage grayImage = new BufferedImage(source.getWidth(), source.getHeight(), BufferedImage.TYPE_BYTE_GRAY);
    Graphics2D g2 = grayImage.createGraphics();
    g2.drawImage(source, 0, 0, null);
    ImageIO.write(grayImage, "png", new File("gray.png"));
  }

  public static void main(String[] args) throws IOException {
    GrayScaleFilter gsf = new GrayScaleFilter();
    gsf.run(args);
  }
}
