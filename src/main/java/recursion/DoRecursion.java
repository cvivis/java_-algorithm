package recursion;

public class DoRecursion {
    public static void main(String[] args) {
        DoRecursion doRecursion = new DoRecursion();
        doRecursion.doRecursion(0);
    }

    private void doRecursion(int num) {
        if(num == 100)return;
        System.out.println(num);
        doRecursion(num+1);
    }
}
