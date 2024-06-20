// 第03講 配列とLIST 例題3-1 argsをArrayListに変換する
// https://ksuap.github.io/2022autumn/lesson03/list/#例題1-argsをarraylistに変換する

import java.util.ArrayList;

public class ArgsPrinter2 {
    void run(String[] args) {
        ArrayList<String> list = this.buildList(args);
        this.printList(list);
    }

    ArrayList<String> buildList(String[] array) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (Integer i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }
        return arrayList;
    }

    void printList(ArrayList<String> arrayList) {
        for (String item : arrayList) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        ArgsPrinter2 printer = new ArgsPrinter2();
        printer.run(args);
    }
}
