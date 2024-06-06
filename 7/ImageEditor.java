// 第07講 画像操作 練習問題7-5 自由課題
// https://ksuap.github.io/2022autumn/lesson07/assignments/#5-自由課題

// モザイク処理を行うプログラムです。
// 使い方: java ImageEditor <画像ファイルパス> <モザイクの粗さ>
// 例)    java ImageEditor sample1.png 20

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageEditor {
  void run(String[] args) throws IOException {
    BufferedImage image = ImageIO.read(new File(args[0]));
    Integer blockSize = Integer.parseInt(args[1]);

    Integer width = image.getWidth();
    Integer height = image.getHeight();

    BufferedImage mosaicImage = new BufferedImage(width, height, image.getType());

    for (Integer y = 0; y < height; y += blockSize) {
      for (Integer x = 0; x < width; x += blockSize) {
        Integer[] averageColor = getAverageColor(image, x, y, blockSize);
        fillBlock(mosaicImage, x, y, blockSize, averageColor);
      }
    }

    ImageIO.write(mosaicImage, "png", new File("mosaic.png"));
  }

  private static Integer[] getAverageColor(BufferedImage image, Integer x, Integer y, Integer blockSize) {
    Integer width = image.getWidth();
    Integer height = image.getHeight();
    Integer r = 0, g = 0, b = 0, count = 0;

    for (Integer i = x; i < x + blockSize && i < width; i++) {
      for (Integer j = y; j < y + blockSize && j < height; j++) {
        Integer rgb = image.getRGB(i, j);
        r += (rgb >> 16) & 0xFF;
        g += (rgb >> 8) & 0xFF;
        b += rgb & 0xFF;
        count++;
      }
    }

    Integer values[] = { r / count, g / count, b / count };

    return values;
  }

  private static void fillBlock(BufferedImage image, Integer x, Integer y, Integer blockSize, Integer[] color) {
    Integer width = image.getWidth();
    Integer height = image.getHeight();
    Integer rgb = (color[0] << 16) | (color[1] << 8) | color[2];

    for (Integer i = x; i < x + blockSize && i < width; i++) {
      for (Integer j = y; j < y + blockSize && j < height; j++) {
        image.setRGB(i, j, rgb);
      }
    }
  }

  public static void main(String[] args) throws IOException {

    if (args.length != 2) {
      System.out.println("Enter two argument.");
      return;
    }

    ImageEditor ie = new ImageEditor();
    ie.run(args);
  }
}
