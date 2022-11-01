package bruteforce;

public class PrimeFind {
    public int solution(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            boolean prime = true;
            for(int j = 2;j<=Math.sqrt(i);j++){
                if(i%j==0) {
                    prime = false;
                    break;
                }

            }
            if(prime == true){
                System.out.println("prime : "+i);
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        PrimeFind primeFind = new PrimeFind();
        System.out.println(primeFind.solution(13));
    }
}
