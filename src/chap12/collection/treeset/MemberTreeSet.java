package chap12.collection.treeset;

import chap12.Member;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
    private TreeSet<Member> treeSet;

    public MemberTreeSet() {
        treeSet = new TreeSet<>();
    }
    public void addMember(Member member){
        treeSet.add(member);
    }
    public boolean removeMember(int memberID){
        Iterator<Member> ir = treeSet.iterator(); //Iterator객체 생성

        while(ir.hasNext()){
            Member member = ir.next();
            int tempID = member.getMemberID();
            if(tempID == memberID){
                treeSet.remove(member);
                return true;
            }
        }
        System.out.println(memberID + "가 존재하지 않습니다.");
        return false;
    }



    public void showAllMember(){
        for (Member mem : treeSet){
            System.out.println(mem);
        }
    }
}
