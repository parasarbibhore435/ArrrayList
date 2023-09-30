import java.util.ArrayList;

public class ClassRoom{
    public static void main(String args[]){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // size
        System.out.println(list.size());
        // print the arraylist
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i)+" ");
        }
        System.out.println();
        list.add(1,9);
        System.out.println(list);
        // get operation - o(n)
        int element = list.get(2);
        System.out.println(element);
        // delete
        list.remove(3);
        System.out.println(list);
        // set 
        list.set(4, 11);
        System.out.println(list);

        // contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(12));

    }
}