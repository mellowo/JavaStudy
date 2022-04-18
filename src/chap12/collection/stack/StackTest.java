package chap12.collection.stack;

import java.util.ArrayList;

class MyStack{
    private ArrayList<String> arrayStack = new ArrayList<>();

    public void push(String data){
        arrayStack.add(data);
    }
    public String pop(){
        int len = arrayStack.size();
        if(len == 0){
            System.out.println("스택이 비었습니다.");
            return null;
        }
        return arrayStack.remove(len -1 );
    }
}
public class StackTest {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack.pop()); //가장 마지막에 넣으순으로 갚을 반환함
    }
}
