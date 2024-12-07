class MyHashMap {
    class Node{
        int key;
        int value;
        Node next;
        Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }
    static final int SIZE = 10000;
    Node[] buckets;
    public MyHashMap() {
        buckets = new Node[SIZE];
    }
    int hash(int key){
        return key % SIZE;
    }
    public void put(int key, int value) {
        int index = hash(key);
        if(buckets[index]==null){
            buckets[index] = new Node(key,value);
            return;
        }
        Node curr = buckets[index];
        Node prev = null;
        while(curr!=null && curr.key != key){
            prev = curr;
            curr = curr.next;
        }
        if(curr != null){
            curr.value = value;
        }else{
            prev.next = new Node(key,value);
        }
    }
    
    public int get(int key) {
        int index = hash(key);
        Node curr = buckets[index];
        while(curr!=null){
            if(curr.key==key){
                return curr.value;
            }
            curr = curr.next;
        }
        return -1;
    }
    
    public void remove(int key) {
        int index = hash(key);
        if(buckets[index]==null){
            return;
        }
        if(buckets[index].key == key){
            buckets[index]= buckets[index].next;
            return;
        }
        Node curr=buckets[index];
        while(curr.next !=null){
            if(curr.next.key==key){
                curr.next=curr.next.next;
                return;
            }
            curr=curr.next;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */