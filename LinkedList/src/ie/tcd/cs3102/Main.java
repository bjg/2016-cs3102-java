package ie.tcd.cs3102;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList<Integer>();

        for (int n : new int[]{4,3,6,1,8,3,2,8,9,0,1,2,3,4,9}) {
            list.insert(n);
        }
        System.out.println(list);
    }
}
