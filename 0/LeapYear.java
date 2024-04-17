// 練習問題0-2
// https://ksuap.github.io/2022autumn/lesson00/assignments/#2-うるう年の判定
public class LeapYear {
    public static void main(String[] args) {
        Integer year = 2024;
        Boolean leapYear = false;
        // ここに判定処理を書いていく．

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            leapYear = true;
        }

        if (leapYear) { // leapYearがtrueの場合．
            System.out.printf("%d年はうるう年です．%n", year);
        } else {
            System.out.printf("%d年はうるう年ではありません．%n", year);
        }
    }
}
