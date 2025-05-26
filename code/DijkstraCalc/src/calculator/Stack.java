package calculator;

import java.util.ArrayList;

public class Stack<T>
{
    private ArrayList<T> elements;

    public Stack()
    {
        elements = new ArrayList<>();
    }

    public void push(T value)
    {
        elements.add(value);
    }

    public T pop()
    {
        if (isEmpty())
        {
            throw new RuntimeException("Stack underflow");
        }
        return elements.remove(elements.size() - 1);
    }

    public T peek()
    {
        if (isEmpty())
        {
            throw new RuntimeException("Stack underflow");
        }
        return elements.get(elements.size() - 1);
    }

    public boolean isEmpty()
    {
        return elements.isEmpty();
    }

    public int size()
    {
        return elements.size();
    }
}
