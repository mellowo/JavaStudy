package chap12.collection.hashset;

import chap12.Member;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member memberLee = new Member(1001,"이지원");
        Member memberKim = new Member(1002,"김지원");
        Member memberSeok = new Member(1003,"석지원");
        Member memberJong = new Member(1004,"종지원");
        Member memberJong2 = new Member(1004,"종지원2");

        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberKim);
        memberHashSet.addMember(memberSeok);
        memberHashSet.addMember(memberJong);
        memberHashSet.addMember(memberJong2); //중복 허용됨 중복방지목적의 hashCode, equal메소드 재정의 필요

        memberHashSet.showAllMember();


    }

}
