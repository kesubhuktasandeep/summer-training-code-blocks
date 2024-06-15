public class Animals {
    int[] stack = new int[5];
    int index = -1;


    void insert(int data) {
        if (index < stack.length - 1) { 
            stack[++index] = data; 
        } else {
            System.out.println("Stack Overflow");
        }
    }

    void remove() {
        if (index >= 0) { 
            index--;
        } else {
            System.out.println("Stack is Empty");
        }
    }
}

