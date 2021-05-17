package demojava;

import java.util.Arrays;

public class sapxepC3 {
    
    public static final int number[] = {3, 7, 2, 1, 4, 6};
    
    public static void main(String[] args) {
        int[] arr = Arrays.copyOf(number, number.length);
        Arrays.sort(arr);
        System.out.println("Ket qua: ");
        System.out.println(Arrays.toString(arr));
    }
    
}
