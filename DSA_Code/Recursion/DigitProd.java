package Recursion;

public class DigitProd {
    public static void main(String[] args) {
        System.out.println(sum(134));
    }
    public static int sum(int n){
        if(n%10==n){
            return n;
        }
        return (n%10)*sum(n/10);
    }
}
