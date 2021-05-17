package demojava;

import java.util.Scanner;

public class sapxeptangdan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = Integer.parseInt(sc.nextLine());

        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        for (int i = 0; i < (n - 1); i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tg = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tg;
                }
            }
        }
        System.out.println("Ket qua : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

}
