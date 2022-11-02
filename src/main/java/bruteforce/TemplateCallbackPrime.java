package bruteforce;


interface Range{
    boolean range(int a, int b);
}
public class TemplateCallbackPrime { // 함수안에서 함수(인터페이스로 선언)호출하는 형태



    boolean isPrime(int num, Range range){
        for (int i = 2; range.range(i,num); i++) {
            if(num % i == 0)return false;
            System.out.println(i);
        }
        return true;
    }

    private boolean someOperation(int i, int num) {
        return i < num;
    }

    public static void main(String[] args) {
        TemplateCallbackPrime templateCallbackPrime = new TemplateCallbackPrime();

        System.out.println(templateCallbackPrime.isPrime(17, (a,b)-> a*a<=b));
        System.out.println(templateCallbackPrime.isPrime(17, (a,b)-> a <= b/2));
        System.out.println(templateCallbackPrime.isPrime(17, (a,b)-> a < b));
    }
}
