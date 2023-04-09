import java.util.Scanner;
import java.lang.Math;
public class Main{

    public static void main(String[] args){
        int n;
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        System.out.println("Enter the a:");
        int a=scanner.nextInt();
        System.out.println("Enter the n:");
        int[]arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        int min=findMinFromArr(arr,n);
        System.out.println(min);
        float avr=findAverage(n,arr);
        System.out.println(avr);
        boolean prime = checkPrime(n);
        System.out.println(prime);
        int factorial=findFactorial(n);
        System.out.println(factorial);
        int fib=findFibonacci(n);
        System.out.println(fib);
        int pow=findPower(a,n);
        System.out.println(pow);
        Scanner sca = new Scanner(System.in);
        System.out.print("\n"+"Enter a string to check is all consists of digits: ");
        String s = sca.nextLine();
        boolean checkIsDigit=checkIsDigit(s);
        if (checkIsDigit){
            System.out.println(("yes"));}
        else {
            System.out.println(("no"));
        }
        int bin=findBinomCoeff(a,n);
        System.out.println(bin);


    }
    public static int findMinFromArr(int[]arr,int n){
        if(n==1)
            return arr[0];
        else{
            int min=findMinFromArr(arr, n-1);
            return Math.min(min, arr[n-1]);

        }
    }

    public static float findSum(int n, int[]arr) {
        int a = arr[n - 1];
        if (n == 1) return a;
        return a + findSum(n - 1, arr);
    }
    public static float findAverage(int n, int[] arr) {
        float avr = findSum(Integer.valueOf(n), arr);
        return avr / n;
    }

    public static boolean checkPrime(int n) {
        boolean isprime=true;
        if (n < 2)
            System.out.println("Number needs to be more than 1");
        else if (n == 2)
            System.out.println("2 is a Prime number");
        else {
            for (int divisor = 2; divisor <= (n / 2); divisor++) {
                if ((n % divisor) == 0) {
                    isprime=false;
                    break;
                }
            }
            if (isprime)
                System.out.printf("Prime", n);
            else System.out.printf("Composite", n);
        }
        return isprime;}
    public static int findFactorial(int n){
        if(n==1){
            return 1;
        } else{
            return n*findFactorial(n-1);
        }
    }
    public static int findFibonacci(int n) {
        return switch(n){
            case 0->0;
            case 1->1;
            default-> findFibonacci(n-1)+findFibonacci(n-2);
        };
    }

    public static int findPower(int a, int n) {
        int pow=1;
        for (int i = 0; i < n; i++) {
            pow *= a ;
        }
        return pow;
    }
    public static boolean checkIsDigit(String s){
        for(int i=0; i<s.length(); i++){
        if(Character.isDigit(s.charAt(i))){
            return false;
        }
        }
        return true;
    }
    public static int findBinomCoeff(int a, int n) {
        if (n == 0 || n == a) {
        return 1;
        }
        else {
        int binomial = findBinomCoeff(a - 1, n - 1) + findBinomCoeff(a - 1, n);
        return binomial;
    }
    }

}














