package ie.tcd.cs3102;

import com.sun.xml.internal.xsom.impl.WildcardImpl;
import sun.awt.image.ImageWatched;

import java.util.EmptyStackException;

/**
 * A Stack is abstract data structure support the following
 * operations:
 *
 * push() - Add an element to the top of the stack
 * pop() - Remove the element on top of the stack (if any)
 * peek() - Look at, but don't pop the top element
 * isEmpty() - See if the stack has any elements
 *
 */
public class ComposedStack<AnyType extends Comparable<AnyType>> {
    private LinkedList<AnyType> stack;

    ComposedStack() {
        stack = new LinkedList<AnyType>();
    }

    public void push(AnyType newValue) {
        stack.push(newValue);
    }

    public AnyType pop() throws EmptyStackException {
        AnyType value = stack.removeFirst();
        if (value != null) {
            return value;
        }
        throw new EmptyStackException();
    }

    public AnyType peek() {
        AnyType value = stack.removeFirst();
        if (value != null) {
            stack.push(value);
            return value;
        }
        throw new EmptyStackException();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public String toString() {
        return stack.toString();
    }
}
