// 第0講 基礎文法 繰り返し
// https://ksuap.github.io/2022autumn/lesson00/grammar/#例題-1
public class OddPrinter{
    public static void main(String[] args){
        // 正攻法
        for(Integer i = 1; i < 100; i++){
            // iを割った余りが1であれば，奇数．
            if(i % 2 == 1){ // i % 2 != 0 の条件でも可．
                System.out.print(i);
                System.out.print(" ");
            }
        }
        System.out.println();

        // 解２: 2づつ増加させる方法．
        for(Integer i = 1; i < 100; i += 2){
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
    }
}
