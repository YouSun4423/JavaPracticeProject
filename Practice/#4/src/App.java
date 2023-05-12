public class App {
    public static void main(String[] args) {
        float x = 0.12345678901234567890f;
        double y = 0.12345678901234567890;
        System.out.println(x);
        System.out.println(y);

        System.out.println("float\t\tint");
        System.out.println("--------------------------------");
        for (int i = 0; i <= 1000; i++) {
            float f = i * 0.001f;
            float g = i / 1000.0f;
            System.out.printf("%.7f\t%.7f\n", f, g);
        }
    }
}
