// 第06講 ファイル 練習問題6-1 FileFinder
// https://ksuap.github.io/2022autumn/lesson06/assignments/#1-ファイルを探すコマンド-filefinder

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileFinder {

    public static void main(String[] args) {
        String targetName = args[0];
        File dir = new File(args[1]);

        List<File> foundFiles = new ArrayList<>();
        search(targetName, dir, foundFiles);

        if (foundFiles.size() > 0) {
            for (File file : foundFiles) {
                System.out.println(file.getPath());
            }
        } else {
            System.out.println(targetName + ": Not found.");
        }
    }

    private static void search(String targetName, File dir, List<File> foundFiles) {
        // ディレクトリが存在しない場合やアクセスできない場合のチェック
        if (!dir.exists() || !dir.isDirectory()) {
            return;
        }

        for (File file : dir.listFiles()) {
            if (file.isDirectory()) {
                // ディレクトリの場合は再帰的に検索
                search(targetName, file, foundFiles);
            } else if (file.isFile() && file.getName().equals(targetName)) {
                // ファイルが見つかった場合はリストに追加
                foundFiles.add(file);
            }
        }
    }
}
