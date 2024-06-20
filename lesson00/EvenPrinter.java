// 第0講 基礎文法 繰り返し
// https://ksuap.github.io/2022autumn/lesson00/grammar/#例題-改1
public class EvenPrinter{
    public static void main(String[] args){
        // 正攻法：出力した回数を数え，20個出力したら改行する．
        Integer printedCount = 0;
        for(Integer i = 1; i < 100; i++){
            // iを割った余りが1であれば，偶数．
            if(i % 2 == 0){
                System.out.printf("%2d ", i);
                printedCount++;
                if(printedCount == 20){
                    System.out.println();
                    printedCount = 0;
                }
            }
        }
        System.out.println();

        // 解２: 改行する位置は決まっているので，３つのループで実現する．
        for(Integer i = 2; i <= 40; i += 2){
            System.out.printf("%2d ", i);
        }
        System.out.println();
        for(Integer i = 42; i <= 80; i += 2){
            System.out.printf("%2d ", i);
        }
        System.out.println();
        for(Integer i = 82; i < 100; i += 2){
            System.out.printf("%2d ", i);
        }
        System.out.println();
    }
}
