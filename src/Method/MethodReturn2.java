package Method;

public class MethodReturn2 {
    public static void main(String[] args) {
        age(18);
//        System.out.println(result);
    }

    public static void age(int i){
        if(18 > i){
            System.out.println("미성년자는 출입이 금지");;
        }
        System.out.println("입장하세요");
    }
}
