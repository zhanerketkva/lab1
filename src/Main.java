import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int n;
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        int[]arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        int min=findMinFromArr(arr,n);
        System.out.println(min);
        float avr=findAverage(n,arr);
        System.out.println(avr);
        int factorial=n*factorial(n-1);
        System.out.println(factorial);
        int fib=fib(n-1)+fib(n-2);
        System.out.println(fib);

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
    public static int factorial(int n){
        if(n==1){
            return 1;
        } else{
            return n*factorial(n-1);
        }
    }
    public static int fib(int n) {
        return switch(n){
            case 0->0;
            case 1->1;
            default-> fib(n-1)+fib(n-2);
        };
    }
}



