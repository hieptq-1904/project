package demojava;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class sapxepC2 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(1);
        list.add(8);
        list.add(5);
        Collections.sort(list);
        System.out.print("Ket qua: ");
        for (Integer x : list) {
            System.out.print(x + "\t");
        }
    }

}
