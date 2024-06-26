// 第2講 メソッド（関数） メソッド内での値の更新
// https://ksuap.github.io/2022autumn/lesson02/method/#メソッド内での値の更新
import java.util.Date;

public class DateConfusion{
    void run(){
        Date date;
        date = new Date();
        this.updateDate1(date);
        System.out.println(date);

        date = new Date();
        this.updateDate2(date);
        System.out.println(date);

        date = new Date();
        Date date2 = this.updateDate3(date);
        System.out.println(date);
        System.out.println(date2);
    }
    void updateDate1(Date d){
        d.setYear(d.getYear() + 1);
    }
    void updateDate2(Date d){
        d = new Date(d.getYear() + 1, d.getMonth(),
                     d.getDate());
    }
    Date updateDate3(Date d){
        // dの時刻と同じ時刻の Date 型の実体が作成される．
        Date d2 = new Date(d.getYear() + 1, d.getMonth(),
                           d.getDate());
        return d2;
    }

    public static void main(String[] args) {
        DateConfusion app = new DateConfusion();
        app.run();
    }
}
