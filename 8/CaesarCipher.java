// 第８講 練習問題8-5 カエサル暗号
// https://ksuap.github.io/2022autumn/lesson08/assignments/#5-カエサル暗号

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CaesarCipher {

  void run(String[] args) throws IOException {
    Integer n = Integer.parseInt(args[0]);
    InputStream in = new FileInputStream(args[1]);
    OutputStream out = new FileOutputStream(args[2]);

    Integer val = 0;

    while ((val = in.read()) != -1) {
      val = val + n;

      if (val < 0)
        val += 256;
      else if (val > 255)
        val -= 256;

      out.write(val);
    }

    in.close();
    out.close();
  }

  public static void main(String[] args) throws IOException {
    CaesarCipher caesarCipher = new CaesarCipher();
    caesarCipher.run(args);
  }
}
