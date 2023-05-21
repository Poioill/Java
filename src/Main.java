import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double score1 = read.nextDouble(), score2 = read.nextDouble(), score3 = read.nextDouble(), score4 = read.nextDouble();
        double avgScore = getAverageScore(score1, score2, score3, score4);
        System.out.println(avgScore);

    }
    public static double getAverageScore(double a, double b, double c, double d){
        return ((a + b + c + d)/4);
    }
}