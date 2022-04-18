package chap12.collection.hashmap;


import chap12.Member;

import java.util.HashMap;

public class MemberHashMap {

    private HashMap<Integer, Member> hashMap;

    public MemberHashMap() {
        hashMap = new HashMap<>();
    }

    public void addMember(Member member){
        hashMap.put(member.getMemberID(), member);
    }

    public boolean removeMember(int memberID){
        if(hashMap.containsKey(memberID)){
            hashMap.remove(memberID);
            return true;
        }
        System.out.println(memberID + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember(){
        for (int i : hashMap.keySet()){
            Member key = hashMap.get(i);
            System.out.println(key);
        }
    }
}
