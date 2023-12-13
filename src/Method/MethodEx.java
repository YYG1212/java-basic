package Method;

public class MethodEx {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        double average = add(a,b,c);
        System.out.println(average);
    }

    public static double add(int a, int b, int c){
        int sum = a + b + c;
        return sum / 3.0;
    }
}
