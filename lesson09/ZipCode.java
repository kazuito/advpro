// 第９講 練習問題9-1 CSVデータの格納
// https://ksuap.github.io/2022autumn/lesson09/assignments/#1-csv-データの格納

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class ZipCode {

    HashMap<String, String> zipCodeMap = new HashMap<>();

    // ダブルクォートを除去
    String stripQuote(String item) {
        if (item.matches("\".*\"")) {
            return item.substring(1, item.length() - 1);
        }
        return item;
    }

    // HashMapに郵便番号と住所を格納
    void initialize() throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("zipcode.csv"));

        String line;

        while ((line = reader.readLine()) != null) {
            String[] items = line.split(",");

            String code = this.stripQuote(items[2]);
            String address = this.stripQuote(items[7]) + stripQuote(items[8]);

            zipCodeMap.put(code, address);
        }

        reader.close();
    }

    void run(String[] args) {

        if (args.length == 0) {
            System.out.println("郵便番号を入力してください");
            return;
        }

        for (String arg : args) {
            if (this.zipCodeMap.containsKey(arg)) {
                System.out.println(arg + ": " + this.zipCodeMap.get(arg));
            } else {
                System.out.println(arg + ": 見つかりませんでした");
            }
        }

    }

    public static void main(String[] args) throws IOException {
        ZipCode zipCode = new ZipCode();
        zipCode.initialize();
        zipCode.run(args);
    }
}
