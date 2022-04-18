package chap12.collection.hashmap;

import chap12.Member;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();

        Member memberLee = new Member(1001,"이지원");
        Member memberKim = new Member(1002,"김지원");
        Member memberSeok = new Member(1003,"석지원");
        Member memberJong = new Member(1004,"종지원");
        Member memberJong2 = new Member(1004,"종지원2");

        memberHashMap.addMember(memberLee);
        memberHashMap.addMember(memberKim);
        memberHashMap.addMember(memberSeok);
        memberHashMap.addMember(memberJong); //다음줄의 memberHashMap.addMember(memberJong2)에의하여 덮어써짐
        memberHashMap.addMember(memberJong2);

        memberHashMap.showAllMember();
    }
}
