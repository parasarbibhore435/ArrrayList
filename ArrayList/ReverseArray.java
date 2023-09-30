import java.util.*;
public class ReverseArray {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(9);
        list.add(7);
        // reverse Array
        for(int i=list.size()-1; i>=0; i--){
            System.out.println(list.get(i) + " ");
        }
        System.out.println();
    }
}
