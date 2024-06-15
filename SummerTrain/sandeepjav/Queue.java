class Queue {
    private int arr[];
    private int start, end, currSize, maxSize;

    public Queue() {
        arr = new int[5];
        start = -1;
        end = -1;
        currSize = 0;
        maxSize = 5;
    }

    public void push(int newElement) {
        if (currSize == maxSize) {
            System.out.println("Queue is full");
            System.exit(1);
        }
        end = (end + 1) % maxSize;
        arr[end] = newElement;
        currSize++;
    }

    public int pop() {
        if (start == -1) {
            System.out.println("Queue Empty");
            System.exit(1);
        }
        int popped = arr[start];
        start = (start + 1) % maxSize;
        currSize--;
        return popped;
    }

    public int top() {
        if (start == -1) {
            System.out.println("Queue Empty");
            System.exit(1);
        }
        return arr[start];
    }

    public int size() {
        return currSize;
    }

    public boolean isEmpty() {
        return start == -1;
    }
}