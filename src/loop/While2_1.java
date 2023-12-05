package loop;

public class While2_1 {
    public static void main(String[] args) {
        int count = 0;
        int i = 1;
        int endNum = 10;
        while (i <= endNum ){
            count = count + i;
            System.out.println("count = "+count);
            System.out.println("i = "+i);
            i++;
        }
    }
}
