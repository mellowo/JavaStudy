package chap12.collection.arraylist;
import chap12.Member;
import java.util.ArrayList;

public class ArrayListForMember {

    private ArrayList<Member> memberArrayList;

    public ArrayListForMember() {
        memberArrayList = new ArrayList<Member>();
    }

    public boolean removeMemeber(int memberID){
        for (Member mem : memberArrayList){
            if(mem.getMemberID() == memberID) {
                memberArrayList.remove(mem);
                System.out.println(mem.getMemberID() + "번 " + mem.getMemberName() +"님 을 회원에서 삭제합니다.");
                return true;
            }
        }
        System.out.println("해당하는 ID의 회원이 없습니다.");
        return false;
    }

    public void addMemeber(Member mem){
        memberArrayList.add(mem);
    }

    public void showAll(){
        for(Member mem : memberArrayList){
            System.out.println(mem);
        }
    }
}