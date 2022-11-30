package programers;

public class Numpy {
    static boolean solution(String str) {
        str = str.toLowerCase();
        int pNum = 0;
        int yNum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'p') pNum++;
            if (str.charAt(i) == 'y') yNum++;
        }
        return pNum == yNum;
    }

    public static void main(String[] args) {
        String str = "PPPP";
        System.out.println(solution(str));
    }
}
