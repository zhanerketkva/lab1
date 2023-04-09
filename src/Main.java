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
        int findGCD=findGCD(a,n);
        System.out.println(findGCD);


    }
    public static int findMinFromArr(int[]arr,int n){
        if(n==1)
            return arr[0];
        else{
            int min=findMinFromArr(arr, n-1);
            return Math.min(min, arr[n-1]);

        }
    }
    /**
     Finds the minimum value in the given integer array.
     arr=The integer array to find the minimum value of.
     n=The number of elements in the array.
     return=The minimum value in the array.
     */
    public static float findSum(int n, int[]arr) {
        int a = arr[n - 1];
        if (n == 1) return a;
        return a + findSum(n - 1, arr);
    }
    /**
     Finds the sum of the elements in the given integer array.
     n=The number of elements in the array.
     arr=The integer array to find the sum of.
     return=The sum of the elements in the array.
     */
    public static float findAverage(int n, int[] arr) {
        float avr = findSum(Integer.valueOf(n), arr);
        return avr / n;
    }
    /**
     Finds the average value of the elements in the given integer array.
     n=The number of elements in the array.
     arr=The integer array to find the average of.
     return=The average value of the elements in the array.
     */
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
    /**
     Checks whether the given integer is a prime number.
     n=The integer to check.
     return=true if the integer is prime, false otherwise.
     */
    public static int findFactorial(int n){
        if(n==1){
            return 1;
        } else{
            return n*findFactorial(n-1);
        }
    }
    /**
     Calculates the factorial of the given integer.
     n=The integer to calculate the factorial of.
     return=The factorial of the integer.
     */
    public static int findFibonacci(int n) {
        return switch(n){
            case 0->0;
            case 1->1;
            default-> findFibonacci(n-1)+findFibonacci(n-2);
        };
    }
    /**
     Calculates the nth Fibonacci number recursively using a switch statement.
     n=The index of the desired Fibonacci number.
     return=The nth Fibonacci number.
     */
    public static int findPower(int a, int n) {
        int pow=1;
        for (int i = 0; i < n; i++) {
            pow *= a ;
        }
        return pow;
    }
    /**
     Calculates the power of a number a to the exponent n.
     a=The base number.
     n=The exponent.
     return=The result of a raised to the power of n.
     */
    public static boolean checkIsDigit(String s){
        for(int i=0; i<s.length(); i++){
        if(Character.isDigit(s.charAt(i))){
            return false;
        }
        }
        return true;
    }
    /**
     checks whether a given string consists only of digits or not.
     s=the string to be checked
     return=true if the string consists only of digits, false otherwise
     */
    public static int findBinomCoeff(int a, int n) {
        if (n == 0 || n == a) {
        return 1;
        }
        else {
        int binomial = findBinomCoeff(a - 1, n - 1) + findBinomCoeff(a - 1, n);
        return binomial;
    }
    }
    /**
     Calculates the binomial coefficient
     a=the total number of elements to choose from
     n=the number of elements to choose
     return=the binomial coefficient of (a choose n)
     */
    public static int findGCD(int a, int n){
        if (n==0){
        return a;    }
    else{
        int gcd= findGCD(n, a%n);
        return gcd;
    }
    }
    /**
     This method calculates the greatest common divisor (GCD) of two given integers "a" and "n"
     a=the first integer
     n=the second integer
     return the GCD of "a" and "n"
     */

}














