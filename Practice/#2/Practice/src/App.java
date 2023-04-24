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
    
    /**
     * 与えられた月に対応する季節を判定する
     *
     * @param month 月（1~12）
     * @return 季節の文字列
     **/
    String checkSeason(int month){
        switch (month) {
            case 12:
            case 1:
            case 2:
                return "冬";
            case 3:
            case 4:
            case 5:
                return "春";
            case 6:
            case 7:
            case 8:
                return "夏";
            case 9:
            case 10:
            case 11:
                return "秋";
            default:
                return null;
        }
    }
}
