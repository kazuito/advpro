// 第９講 練習問題9-2 電話帳の作成
// https://ksuap.github.io/2022autumn/lesson09/assignments/#2-電話帳の作成

import java.util.HashMap;

public class PhoneBook {

  HashMap<String, String> phoneBook = new HashMap<>();

  void run(String[] args) {
    SimpleConsole console = new SimpleConsole();

    while (true) {
      String line = console.readLine();
      String items[] = line.split(" ");

      String cmd = items[0];

      if (cmd.equals("exit")) {
        break;
      } else if (cmd.equals("add")) {
        String name = items[1];
        String tel = items[2];

        this.phoneBook.put(name, tel);
      } else if (cmd.equals("list")) {
        for (String name : this.phoneBook.keySet()) {
          System.out.println(name + " " + this.phoneBook.get(name));
        }
      } else if (cmd.equals("find")) {
        String name = items[1];

        if (this.phoneBook.containsKey(name)) {
          System.out.println(name + " " + this.phoneBook.get(name));
        }
      } else if (cmd.equals("remove")) {
        String name = items[1];

        if (this.phoneBook.containsKey(name)) {
          this.phoneBook.remove(name);
        }
      }
    }
  }

  public static void main(String[] args) {
    PhoneBook pb = new PhoneBook();
    pb.run(args);
  }
}
