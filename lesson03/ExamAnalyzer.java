// 第03講 練習問題3-4 試験成績の分析
// https://ksuap.github.io/2022autumn/lesson03/assignments/#4-試験成績の分析

import java.util.Random;

public class ExamAnalyzer {
    ExamScore createRandomScore(String name) {
        Random random = new Random();
        Integer math = random.nextInt(101);
        Integer physics = random.nextInt(101);
        Integer english = random.nextInt(101);
        return this.createExamScore(math, physics, english, name);
    }
}
