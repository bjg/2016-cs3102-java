package ie.tcd.cs3102;

public class Main {

    public static void main(String[] args) {
        InheritedStack<String> inheritedStack = new InheritedStack();

        inheritedStack.push("A");
        inheritedStack.push("B");

        System.out.println(inheritedStack.peek());

        inheritedStack.pop();

        System.out.println(inheritedStack);

        ComposedStack<String> composedStack = new ComposedStack<>();

        composedStack.push("A");
        composedStack.push("B");
        composedStack.pop();


        System.out.println(composedStack);
    }
}
