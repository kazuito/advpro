import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Copier {

  void run(String args[]) throws IOException {

    BufferedReader reader = new BufferedReader(new FileReader(args[0]));
    PrintWriter writer = new PrintWriter(new FileWriter(new File(args[1])));

    String line;

    while ((line = reader.readLine()) != null) {
      writer.print(line + "\n");
    }

    writer.close();
  }

  public static void main(String[] args) throws IOException {
    Copier c = new Copier();
    c.run(args);
  }

}
