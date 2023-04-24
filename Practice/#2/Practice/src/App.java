import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Calculate cal = new Calculate();

        System.out.print("整数値1を入力してください: ");
        int num1 = scanner.nextInt();
        System.out.print("整数値2を入力してください: ");
        int num2 = scanner.nextInt();
        cal.sort(num1, num2);

        SeasonChecker sc = new SeasonChecker();
        System.out.print("月を入力してください（1~12）: ");
        String season = sc.checkSeason(scanner.nextInt());
        if (season == null) {
            throw new NullPointerException("季節が特定できません。");
        } else {
            System.out.println(season + "です。");
        }
    }
}

class Calculate {
    void sort(int num1, int num2){
        int temp;
        if (num1 < num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println("降順にソートした結果は " + num1 + ", " + num2 + " です。");
    }
}

class SeasonChecker {
    String checkSeason(int month){
        String season =  switch (month) {
            case 12, 1, 2 -> {yield "冬";}
            case 3, 4, 5 -> {yield "春";}
            case 6, 7, 8 -> {yield "夏";}
            case 9, 10, 11 -> {yield "秋";}
            default -> {yield null;}
        };
        return season;
    }
}
