import java.util.Deque;
import java.util.LinkedList;

public class MinStack155
{
    Deque<Integer> xStack;
    Deque<Integer> minStack;

    public MinStack155()
    {
        xStack = new LinkedList<>();
        minStack = new LinkedList<>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int x)
    {
        xStack.push(x);
        minStack.push(Math.min(minStack.peek(), x));
    }

    public void pop()
    {
        xStack.pop();
        minStack.pop();
    }

    public int top()
    {
        return xStack.peek();
    }

    public int getMin()
    {
        return minStack.peek();
    }
}

