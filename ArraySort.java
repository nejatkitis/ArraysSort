import java.util.Scanner;
import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.print("Dizi eleman sayısı giriniz : ");
        int l = input.nextInt();
        int[] list = new int[l];

        for (int i=0;i<list.length;i++){
            System.out.print((i+1)+" numaralı elemanı giriniz : ");
            int a = input.nextInt();
            list[i] = a;
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
