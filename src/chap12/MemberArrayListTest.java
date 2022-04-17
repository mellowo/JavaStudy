package chap12;

import chap12.collection.arraylist.ArrayListForMember;

public class MemberArrayListTest {
    public static void main(String[] args) {
        ArrayListForMember memberAL = new ArrayListForMember();

        Member memberLee = new Member(100, "이건형");
        Member memberJung = new Member(101,"정소영");
        Member memberMin = new Member(102,"정민지");
        memberAL.addMemeber(memberLee);
        memberAL.addMemeber(memberJung);
        memberAL.addMemeber(memberMin);

        memberAL.showAll();

        memberAL.removeMemeber(102);

        memberAL.showAll();
    }



}
