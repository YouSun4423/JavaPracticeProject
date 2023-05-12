public class App {
    public class Main {
        public static void main(String[] args) {
            int[] Arr1 = new int[10];
            Arr1[0] = 1;
            int[] Arr2 = Arr1;
            Arr2[0] = 2;
            System.out.println(Arr1[0]);
        }
    }
}
