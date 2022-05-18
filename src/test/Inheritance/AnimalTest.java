package test.Inheritance;

import chap15.stream.inputstream.SystemOutInTest;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("사람이 두발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다");
	}
}

public class AnimalTest {

	public void moveExec(Animal animal) {
		animal.move();
		
		if(animal instanceof Human) {
			Human hu = (Human)animal;
			hu.readBook();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalTest at = new AnimalTest();
		//at.moveExec(new Animal());
		//at.moveExec(new Human());
		
		
		Animal hu1 = new Human();
		at.moveExec(hu1);
	}

}
