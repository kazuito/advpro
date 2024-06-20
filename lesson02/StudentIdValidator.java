// 第2講 練習問題2-2 学生証番号の正当性を検証するプログラム
// https://ksuap.github.io/2022autumn/lesson02/assignments/#2-学生証番号の正当性を検証するプログラム

public class StudentIdValidator {
  void run(String[] args) {
    for (String arg : args) {
      Boolean isValid = validateId(validate(arg));

      if (isValid) {
        System.out.println("  valid: " + arg);
      } else {
        System.out.println("invalid: " + arg);
      }
    }
  }

  // 長さが6であることを確認し、数字に変換する
  Integer validate(String str) {
    if (str.length() != 6) {
      return -1;
    }

    return Integer.parseInt(str);
  }

  // 各桁の和が10の倍数であることを確認する
  Boolean validateId(Integer num) {
    if (num == -1) {
      return false;
    }

    Integer sum = 0;

    while (num > 0) {
      sum += num % 10;
      num /= 10;
    }

    if (sum % 10 == 0) {
      return true;
    }

    return false;
  }

  // mainメソッド
  public static void main(String[] args) {
    StudentIdValidator validator = new StudentIdValidator();
    validator.run(args);
  }
}
