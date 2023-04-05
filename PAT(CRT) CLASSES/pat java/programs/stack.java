import java.util.ArrayList;

class Stk1 {
    ArrayList<Integer> stk = new ArrayList<Integer>();
    int size;

    public Stk1(int size) {
        this.size = size;
    }

    public void enqueue(int element) {
        if (stk.size() == size) {
            System.out.println("queue is full");
        } else {
            stk.add(element);
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("queue is empty");
        } else {
            stk.remove(stk.size() - 1);
        }
    }

    /*public void printStack() {
        System.out.println(stk);
    }*/

    public boolean isEmpty() {
        if(stk.size()==0){
            
        }
    }
}

public class stack {
    public static void main(String[] args) {
        Stk1 ob = new Stk1();
        ob.push(10);
        ob.push(20);
        ob.printStack();
    }
}
