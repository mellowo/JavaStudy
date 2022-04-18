package chap12.collection.treeset;

import chap12.Member;
import chap12.collection.hashset.MemberHashSet;

import java.util.Comparator;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member memberLee = new Member(1001,"이지원");
        Member memberKim = new Member(1002,"김지원");
        Member memberSeok = new Member(1003,"석지원");
        Member memberJong = new Member(1004,"종지원");
        Member memberJong2 = new Member(1004,"종지원2");

        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberKim);
        memberTreeSet.addMember(memberSeok);
        memberTreeSet.addMember(memberJong);
        memberTreeSet.addMember(memberJong2); //중복 허용됨 중복방지목적의 hashCode, equal메소드 재정의 필요

        memberTreeSet.showAllMember();
    }
}
