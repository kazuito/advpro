import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Cropping {
  void run(String[] args) throws IOException {
    BufferedImage source = ImageIO.read(new File(args[0]));
    Integer width = Integer.parseInt(args[1]);
    Integer height = Integer.parseInt(args[2]);

    BufferedImage croppedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

    Double x = (width - source.getWidth()) / 2.0;
    Double y = (height - source.getHeight()) / 2.0;

    Graphics2D g2 = croppedImage.createGraphics();

    g2.drawImage(source, x.intValue(), y.intValue(), null);

    ImageIO.write(croppedImage, "png", new File("crop_result.png"));
  }

  public static void main(String[] args) throws IOException {

    if (args.length != 3) {
      System.out.println("enter three arguments.");
      return;
    }

    Cropping cp = new Cropping();
    cp.run(args);
  }

}
