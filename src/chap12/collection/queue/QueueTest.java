package chap12.collection.queue;

import java.util.ArrayList;
import java.util.Queue;

class MyQueue {
    //FIFO
    ArrayList<String> myQueue = new ArrayList<>();
    
    public void enqueue(String data){
        myQueue.add(data);
    }
    public String dequeue(){
        int len = myQueue.size();
        if( len == 0 ){
            System.out.println("큐가 비어있습니다.");
            return null;
        }
        return myQueue.remove(0);
    }
}
public class QueueTest {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue("A");
        myQueue.enqueue("B");
        myQueue.enqueue("C");
        System.out.println(myQueue.dequeue()); //가장 먼저 들어간것이 가장 먼저 나옴 (FIFO)
    }
}
