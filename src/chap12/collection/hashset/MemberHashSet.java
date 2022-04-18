package chap12.collection.hashset;
import chap12.Member;
import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
    private HashSet<Member> hashSet;

    public MemberHashSet() {
        hashSet = new HashSet<>();
    }
    public void addMember(Member member){
        hashSet.add(member);
    }
    public boolean removeMember(int memberID){
        Iterator<Member> ir = hashSet.iterator(); //Iterator객체 생성

        while(ir.hasNext()){
            Member member = ir.next();
            int tempID = member.getMemberID();
            if(tempID == memberID){
                hashSet.remove(member);
                return true;
            }
        }
        System.out.println(memberID + "가 존재하지 않습니다.");
        return false;
    }



    public void showAllMember(){
        for (Member mem : hashSet){
            System.out.println(mem);
        }
    }
}
