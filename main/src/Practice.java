import java.util.Scanner;

public class Practice {
    public static void main(String[] args){

        String str = "矢口悠月";
        String[] strArray = str.split("");
        for(String s : strArray) {
            System.out.println(s);
        }

        Cal cal = new Cal();
        int sum = cal.Sum(10, 8, 4);
        float average = cal.Average(10, 8, 4);
        System.out.println("合計値 : "+sum);
        System.out.println("平均値 : "+average);

        Scanner stdln = new Scanner(System.in);
        System.out.println("姓:");
        String firstName = stdln.next();
        System.out.println("名:");
        String lastName = stdln.next();
        System.out.println("こんにちは"+firstName+lastName+"さん");
    }
}

class Cal{

    int Sum(int a, int b, int c){
        return (a+b+c);
    }

    float Average(int a, int b, int c){
        return (a+b+c)/3;
    }

}
