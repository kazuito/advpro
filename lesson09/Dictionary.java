import java.util.HashMap;

public class Dictionary {

  HashMap<String, String> dict = new HashMap<>();

  void init() {
    this.dict.put("apple", "りんご");
    this.dict.put("orange", "オレンジ");
    this.dict.put("banana", "バナナ");
    this.dict.put("grape", "ぶどう");
    this.dict.put("peach", "もも");
    this.dict.put("strawberry", "いちご");
    this.dict.put("melon", "メロン");
    this.dict.put("watermelon", "すいか");
    this.dict.put("pineapple", "パイナップル");
    this.dict.put("kiwi", "キウイ");
  }

  void run(String[] args) {
    for (String wordEn : args) {
      if (this.dict.containsKey(wordEn)) {
        String wordJa = this.dict.get(wordEn);
        System.out.println(wordEn + ": " + wordJa);
      } else {
        System.out.println(wordEn + ": 見つかりませんでした.");
      }
    }
  }

  public static void main(String[] args) {
    Dictionary dict = new Dictionary();
    dict.init();
    dict.run(args);
  }
}
