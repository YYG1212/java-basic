package Method;

public class method1Ref {
    public static void main(String[] args) {
        int sum = add(1, 2);
        int sum2 = add(10, 20);

        System.out.println(sum);
        System.out.println(sum2);
    }
    public static int add(int a, int b){
        int sum = a + b;
        return sum;
    }
}
