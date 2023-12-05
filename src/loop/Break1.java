package loop;

public class Break1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (true){
            sum = sum + i;

            if (sum > 10) {
                System.out.println(i);
                System.out.println("10보다 크면 종료");
                break;
            }
            i++;
        }

        while (i <= 5){
            if (i == 3) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
