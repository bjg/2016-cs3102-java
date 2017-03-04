package ie.tcd.cs3102;

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
public class InheritedStack<AnyType> extends LinkedList {
    public AnyType pop() throws EmptyStackException {
        if (!isEmpty()) {
            return (AnyType) removeFirst();
        }
        throw new EmptyStackException();
    }

    public AnyType peek() throws EmptyStackException {
        if (!isEmpty()) {
            return (AnyType) lookFirst();
        }
        throw new EmptyStackException();
    }
}
