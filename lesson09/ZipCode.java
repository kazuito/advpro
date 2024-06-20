// 第９講 練習問題9-1 CSVデータの格納
// https://ksuap.github.io/2022autumn/lesson09/assignments/#1-csv-データの格納

// import 文をここに書く．

public class ZipCode {
    // runメソッドをここに書く．

    // https://ksuap.github.io/2022autumn/lesson09/assignments/#ダブルクォートの削除
    String stripQuote(String item){
        if(item.matches("\".*\"")){
            return item.substring(1, item.length() - 1);
        }
        return item;
    }
    // mainメソッドを書く．
}
