/*
北京大学对本科生的成绩施行平均学分绩点制（GPA）。既将学生的实际考分根据不同的学科的
不同学分按一定的公式进行计算。 公式如下： 实际成绩 绩点 90——100 4.0 85——89 3.7
82——84 3.3 78——81 3.0 75——77 2.7 72——74 2.3 68——71 2.0 64——67 1.5
60——63 1.0 60以下 0 1．一门课程的学分绩点=该课绩点*该课学分
2．总评绩点=所有学科绩点之和/所有课程学分之和 现要求你编写程序求出某人A的总评绩点（GPA）。
输入描述:
第一行 总的课程数n（n<10）；
第二行 相应课程的学分（两个学分间用空格隔开）；
第三行 对应课程的实际得分；
此处输入的所有数字均为整数。

输出描述:
输出有一行，总评绩点，精确到小数点后2位小数。（printf("%.2f",GPA);）
示例1
输入
5
4 3 4 2 3
91 88 72 69 56
输出
2.52
*/
package written_test0701;

//学分绩点
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int[] point = new int[n];
            int[] score = new int[n];
            for(int i = 0;i< n;i++){
                point[i] = in.nextInt();
            }
            for(int i = 0;i< n;i++){
                score[i] = in.nextInt();
            }

            double count = 0;
            int aScore = 0;
            for(int i =0;i<n;i++){
                if(score[i]>=90){
                    count += (4.0 * point[i]);
                }else if(score[i]>=85){
                    count += (3.7 * point[i]);
                }else if(score[i]>=82){
                    count += (3.3 * point[i]);
                }else if(score[i]>=78){
                    count += (3.0 * point[i]);
                }else if(score[i]>=75){
                    count += (2.7 * point[i]);
                }else if(score[i]>=72){
                    count += (2.3 * point[i]);
                }else if(score[i]>=68){
                    count += (2.0 * point[i]);
                }else if(score[i]>=64){
                    count += (1.5 * point[i]);
                }else if(score[i]>=60){
                    count += (1.0 * point[i]);
                }else {
                    count += (0.0 * point[i]);

                }
                aScore += point[i];
            }
            System.out.printf(String.format("%.2f", count/aScore));
        }
    }
}
