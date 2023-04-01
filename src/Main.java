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
    }
    public static int findMinFromArr(int[]arr,int n){
        if(n==1)
            return arr[0];
        else{
            int min=findMinFromArr(arr, n-1);
            return Math.min(min, arr[n-1]);

        }
    }

}

