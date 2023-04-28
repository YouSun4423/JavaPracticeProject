public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("15からカウントダウンします。");
            for(int x=15; x>=0; x--){
                System.out.println(x);
            }

        System.out.println("15からカウントダウンします。");
        int y = 15;
        do{
            System.out.println(y);
            y--;
        } while(y >= 0);
    }
}
