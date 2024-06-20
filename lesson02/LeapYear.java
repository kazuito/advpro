// 第2講 メソッド（関数） メソッドの仮引数と実引数
// https://ksuap.github.io/2022autumn/lesson02/method/#メソッドの仮引数と実引数
public class LeapYear{
    void run(String[] argsForRun){
      for(Integer i = 0; i < argsForRun.length; i++){
        Integer year = Integer.valueOf(argsForRun[i]);
        Boolean leapYearFlag = this.isLeapYear(year);
        this.printLeapYear(year, leapYearFlag);
      }
    }
    Boolean isLeapYear(Integer y){
      return y % 400 == 0 && (y % 100 != 0 || y % 400 == 0);
    }
    void printLeapYear(Integer y2, Boolean lyf){
      if(lyf)
        System.out.printf("%d年はうるう年です．%n", y2);
      else
        System.out.printf("%d年はうるう年ではありません．%n", y2);
    }
  }
  