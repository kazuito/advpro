// 第06講 ファイル 例題1 ls コマンドの作成
// https://ksuap.github.io/2022autumn/lesson06/file/#ls-コマンドの作成
// import文を書く．
import java.io.File;

public class ListFiles{
    void run(String[] args){
        for(String arg: args){
            File thisFile = new File(arg); // argを元に，File型の変数を作成する．
            this.listFile(thisFile);
        }
        if(args.length == 0){
            this.listFile(new File("."));
        }
    }
    void listFile(File target){
        if(this.isExist(target)){
            if(target.isDirectory()){ // 引数のファイルがディレクトリの場合
                this.listFilesInDirectory(target);
            }
            else{
                System.out.printf("%s%n", target.getName()); // 引数のファイルの名前を出力する．
            }
        }
    }
    void listFilesInDirectory(File dir){
        // 引数に受け取ったディレクトリが持つファイル，ディレクトリの一覧を取得する．
        File[] files = dir.listFiles();
        // for文で files を繰り返す．
        for(File file: files){
            System.out.printf("%s%n", file.getName());
            // 配列の各要素であるファイルの名前を出力する．
        }
    }
    Boolean isExist(File target){
        if(!target.exists()){ // ファイルが存在しない場合
            // 指定されたファイル名は存在しない旨を出力する．
            System.out.printf("ListFiles: %s: No such file or directory%n", target.getName());
        }
        return target.exists(); // ファイルが存在するかを返す（if文の条件の反転）．
    }
    public static void main(String[] args){
        ListFiles ls = new ListFiles();
        ls.run(args);
    }
}
