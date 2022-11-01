package bruteforce;


interface Range{
    double range(double range);
}
public class TemplateCallbackPrime {

    boolean isPrime(int num){
        for (int i = 2; someOperation(i,num); i++) {
            if(num % i == 0)return false;
        }
        return true;
    }

    private boolean someOperation(int i, int num) {
        return i < num;
    }

    public static void main(String[] args) {
        TemplateCallbackPrime templateCallbackPrime = new TemplateCallbackPrime();
        boolean r = templateCallbackPrime.isPrime(17);
        System.out.println(r);
    }
}
