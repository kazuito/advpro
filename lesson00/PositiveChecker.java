// 第0講 基礎文法 条件分岐
// https://ksuap.github.io/2022autumn/lesson00/grammar/#例題
public class PositiveChecker {
    public static void main(String[] args) {
        Integer value = 5;
        if(value > 0) {
            System.out.printf("与えられた数値は正の値です: %d%n", value);
        }
        else if(value == 0) {
            System.out.printf("与えられた数値は0です: %d%n", value);
        }
        else {
            System.out.printf("与えられた数値は負の値です: %d%n", value);
        }
    }
}
