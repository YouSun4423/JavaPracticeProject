import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        final double PI = 3.1416;
        Scanner stdln = new Scanner(System.in);
        System.out.println("半径:");
        double r = stdln.nextDouble();
        System.out.println("円周の長さは"+2*PI*r+"です!");
        System.out.println("円の面積は"+PI*r*r+"です!");
    }
}

class Sum{
    public static void main(String[] args) throws Exception {
        int x = 63;
        int y = 37;
        System.out.println("63+37="+(x+y));
    }
}

class inputKey{
    public static void main(String[] arg){
        Scanner stdln = new Scanner(System.in);
        System.out.println("xの値:");
        int x = stdln.nextInt();
    }
}

class inputName{
    public static void main(String[] arg){
        Scanner stdln = new Scanner(System.in);
        System.out.println("あなたの名前は");
        String name = stdln.next();
        System.out.println("こんにちは"+name+"さん");
    }
}

class generateRandNum{
    public static void main(String[] arg){
        Random rand = new Random();
        int randomNumber = rand.nextInt(10);
        System.out.println("生成した乱数は"+randomNumber+"です");
    }
}