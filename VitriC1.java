package demojava;

import java.util.ArrayList;
import java.util.List;

public class VitriC1 {

    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<Integer>();
        lst.add(2);
        lst.add(5);
        lst.add(9);
        lst.add(8);
        lst.add(6);
        int index = lst.indexOf(8);
        if (index == -1) {
            System.out.println("Gia tri khong ton tai!");
        } else {
            System.out.println("Gia tri nam vi tri thu : " + (index + 1));
        }
    }

}
