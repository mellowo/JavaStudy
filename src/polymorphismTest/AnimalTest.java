package polymorphismTest;

class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}


class Human extends Animal {
    public void move(){
        System.out.println("사람이 두발로 걷습니다.");
    }
    public void readBook(){
        System.out.println("사람이 책을 읽습니다.");
    }

}


class Tiger extends Animal {
    public void move(){
        System.out.println("호랑이가 네발로 뜁니다.");
    }
    public void hunting(){
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest ani = new AnimalTest();
        ani.animalMove(new Human());
        ani.animalMove(new Tiger());
        ani.animalMove(new Animal());

        Animal human = new Human();
        human.move();
    }

    public void animalMove(Animal animal){

        animal.move();

        if( animal instanceof Human){
            System.out.println(animal instanceof Human);
            Human human = (Human) animal;
            human.readBook();
        }else if ( animal instanceof Tiger){
            Tiger tiger = (Tiger) animal;
            tiger.hunting();
        }

    }
}
