package bruteforce;


interface Range{
    boolean range(int a, int b);
}
public class TemplateCallbackPrime {



    boolean isPrime(int num, Range range){
        for (int i = 2; range.range(i,num); i++) {
            if(num % i == 0)return false;
        }
        return true;
    }

    private boolean someOperation(int i, int num) {
        return i < num;
    }

    public static void main(String[] args) {
        TemplateCallbackPrime templateCallbackPrime = new TemplateCallbackPrime();
        boolean r = templateCallbackPrime.isPrime(17, new Range() {
            @Override
            public boolean range(int a, int b) {
                return a * a <= b;
            }
        });
        System.out.println(r);
    }
}
