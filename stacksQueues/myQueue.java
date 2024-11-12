package stacksQueues;

import java.util.Stack;

//queue using stack in which adding iss efficient O(1) and removing is O(n)

public class myQueue {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public void MyQueue() {
        first = new Stack<>();

        second = new Stack<>();
    }

    public void push(int x) {
        first.push(x);
    }

    public int pop() {
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int removed = second.pop();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return removed;
    }

    public int peek() {
         while(!first.isEmpty()){
            second.push(first.pop());
        }
        int peeked = second.peek();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return peeked;
    }

    public boolean empty() {
        return first.isEmpty();
    }
}
/*
 * private Stack<Integer> first;
  private Stack<Integer> second;

  public QueueUsingStackRemove() {
    first = new Stack<>();
    second = new Stack<>();
  }

  public void add(int item) throws Exception {
    while (!first.isEmpty()) {
      second.push(first.pop());
    }
    first.push(item);
    while (!second.isEmpty()) {
      first.push(second.pop());
    }
  }

  public int remove() throws Exception {
    return first.pop();
  }

  public int peek() throws Exception {
    return first.peek();
  }

  public boolean isEmpty() {
    return first.isEmpty();
  }
 */