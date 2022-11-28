package permutation;

public class CombinationOfAlphabet {

    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        CombinationOfAlphabet combination = new CombinationOfAlphabet();
        combination.printAlpabet();
        combination.printTwoAlpabet();
    }

    public void printAlpabet(){
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
}
