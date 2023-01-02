package SilSup;

interface IStack<T> {
  T pop();
  boolean push(T ob);
}

class MyStack<T> implements IStack {

  int count;
  T result;
  Object[] stack;

  public MyStack() {
    count = 0;
    stack = new Object[10];
  }

  public boolean push(Object ob) {
    if (count > 9) return false;
    stack[count] = ob;
    count++;
    return true;
  }

  public T pop() {
    if (count == 0) {
      return null;
    }
    count--;
    return (T) stack[count];
  }
}

public class StackManager {

  public static void main(String[] args) {
    IStack<Integer> stack = new MyStack<Integer>();
    for (int i = 0; i < 10; i++) stack.push(i);
    while (true) {
      Integer n = stack.pop();
      if (n == null) break;
      System.out.print(n + " ");
    }
  }
}
