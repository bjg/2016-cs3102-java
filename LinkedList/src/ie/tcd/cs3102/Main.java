package ie.tcd.cs3102;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList<String>();

        list.push("a");
        list.push("b");
        list.push("c");
        System.out.println(list);

        System.out.println(list.isPresent("b"));
        System.out.println(list.isPresent("z"));

        list.delete("c");
        System.out.println(list.isPresent("c"));
        list.delete("a");
        System.out.println(list.isPresent("a"));
        System.out.println(list);
    }
}
