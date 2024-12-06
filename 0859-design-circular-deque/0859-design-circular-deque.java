class MyCircularDeque {
    private int[] deque;
    private int front;
    private int rear;
    private int size;

    public MyCircularDeque(int k) {
        deque = new int[k];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }
        front = (front - 1 + deque.length) % deque.length; // 원형 큐 계산
        deque[front] = value;
        if(size==0)rear=front;
        size++;
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }
        
        rear = (rear + 1) % deque.length; // 원형 큐 계산
        deque[rear] = value;
        if(size==0)front=rear;
        size++;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        front = (front + 1) % deque.length; // 원형 큐 계산
        size--;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        rear = (rear - 1 + deque.length) % deque.length; // 원형 큐 계산
        size--;
        return true;
    }

    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return deque[front];
    }

    public int getRear() {
        return isEmpty() ? -1 : deque[rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == deque.length;
    }
}
