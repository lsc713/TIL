class MyCircularQueue {
     int[] q;
     int head=0;
     int tail=-1;
     int size=0;
    public MyCircularQueue(int k) {
        q = new int[k];
    }
    
    public boolean enQueue(int value) {
        if(isFull()) return false;
        tail = (tail+1)%q.length;
        q[tail]=value;
        size++;
        return true;
        
    }
    
    public boolean deQueue() {
        if(isEmpty())return false;
        head = (head+1)%q.length;
        size--;
        return true;
    }
    
    public int Front() {
        return isEmpty()?-1:q[head];
    }
    
    public int Rear() {
        return isEmpty()?-1:q[tail];
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return size == q.length;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */