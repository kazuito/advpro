// 第2講 メソッド（関数） 例題2-2
// https://ksuap.github.io/2022autumn/lesson02/method/#例題２
public class HelloWorld2r{
    void run(String[] args){
        if(args.length == 0){
            this.greet("World");
        }
        else{
            this.greet(args[0]);
        }
    }
    void greet(String name){
        System.out.printf("Hello, %s%n", name);
    }
    public static void main(String[] args){
        HelloWorld2r hello = new HelloWorld2r();
        hello.run(args);
    }
}
