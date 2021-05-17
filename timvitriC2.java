package demojava;

import java.util.Scanner;

public class timvitriC2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5, 3, 1, 2, 6, 9};
        System.out.print("Moi nhap so can tim: ");
        int input_number = Integer.parseInt(sc.nextLine());
        boolean check_number = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == input_number) {
                System.out.println("vi tri cua " + input_number + " = " + (i + 1));
                check_number = true;
                break;
            }
        }
        if (check_number == false) {
            System.out.println("Gia tri " + input_number + " khong ton tai");
        }
    }

}
