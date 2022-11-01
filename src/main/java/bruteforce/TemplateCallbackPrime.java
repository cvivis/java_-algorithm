package bruteforce;


interface Range{
    boolean range(int a, int b);
}
public class TemplateCallbackPrime {



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
