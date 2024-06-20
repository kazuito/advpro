// 第07講 画像操作 練習問題7-4 画像の回転
// https://ksuap.github.io/2022autumn/lesson07/assignments/#4-画像の回転

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageRotater {

  void run(String[] args) throws IOException {
    BufferedImage source = ImageIO.read(new File(args[0]));
    Integer angle = Integer.parseInt(args[1]);
    File newFile = new File(args[2]);

    Double width = (double) source.getWidth();
    Double height = (double) source.getHeight();
    Double angleRad = Math.toRadians(angle);
    AffineTransform affine = new AffineTransform();
    affine.translate(width * Math.sin(angleRad), 0d);
    affine.rotate(angleRad);

    Double newWidth = Math.abs(width * Math.sin(angleRad) + width * Math.cos(angleRad));
    Double newHeight = Math.abs(height * Math.sin(angleRad) + height * Math.cos(angleRad));

    BufferedImage rotatedImage = new BufferedImage(newWidth.intValue(), newHeight.intValue(),
        BufferedImage.TYPE_INT_RGB);

    Graphics2D g2 = rotatedImage.createGraphics();
    g2.drawImage(source, affine, null);
    ImageIO.write(rotatedImage, getFileExtension(newFile.getName()), newFile);
  }

  private String getFileExtension(String fileName) {
    Integer dotIndex = fileName.lastIndexOf(".");
    String ex = fileName.substring(dotIndex + 1).toLowerCase();
    return ex;
  }

  public static void main(String[] args) throws IOException {

    if (args.length != 3) {
      System.out.println("Enter three arguments.");
      return;
    }

    ImageRotater ir = new ImageRotater();
    ir.run(args);
  }
}
