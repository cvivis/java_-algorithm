package permutation;

public class CombinationOfAlphabet {

    static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        CombinationOfAlphabet combination = new CombinationOfAlphabet();
        combination.printAlphabet();
        combination.printTwoAlpabet();
        combination.alphabetRecur(0);
        printAllAlphabet("",3);

    }

    public void printAlphabet(){
        for (int i = 0; i < alphabet.length(); i++) {
            System.out.println(alphabet.charAt(i));
        }
    }
    public void printTwoAlpabet(){
        for (int i = 0; i < alphabet.length(); i++) {
            for (int j = 0; j < alphabet.length(); j++) {
                System.out.println(alphabet.charAt(i)+ " "+alphabet.charAt(j));
            }
        }
    }

    public int alphabetRecur(int num){
        if(num == alphabet.length()-1)return 0;
        System.out.println(alphabet.charAt(num));
        return alphabetRecur(num+1);
    }

    public void alphabetTwoRecur(char c,String prefix){
        if(c > 'Z')return ;
        System.out.println(prefix + c);
        alphabetTwoRecur((char)(c+1),prefix);
    }
    public static void printAllAlphabet(String prefix,int num) {
        if (prefix.length() == num) {
            System.out.println(prefix);
            return;
        }
        for (char c = 'A'; c <= 'Z' ; c++) {
            printAllAlphabet(prefix + c,num);
        }
    }
}
