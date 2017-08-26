
import java.util.*;
import java.util.concurrent.SynchronousQueue;

public class bubble {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int numberOfswaps = 0;
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            //numberOfswaps = 0;
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    numberOfswaps++;
                }
            }
             if (numberOfswaps == 0) {
                break;
            }
        }
		System.out.println("Array is sorted in" +" " +numberOfswaps +" "+"swaps.");
		System.out.println("First Element:"+" "+a[0]+"");
		System.out.println("Last Element:"+" "+a[n-1]+"");
		
    }
}
