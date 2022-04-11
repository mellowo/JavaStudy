package chap05.reference;

public class Student {

    int studentID;
    String studentName;

    //클래스를 선언한다고 생기지 않음 ,보통 생성자안에 객체를 생성함
    Subject korea;
    Subject math;

    public Student() {
        this.korea = new Subject();
        this.math = new Subject();
    }


    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.korea = new Subject();
        this.math = new Subject();
    }

    public Subject getKorea() {
        return korea;
    }

    public void setKorea(String name, int score) {
        korea.setSubjectName(name);
        korea.setScore(score);
    }

    public Subject getMath() {
        return math;
    }

    public void setMath(String name, int score) {
        math.setSubjectName(name);
        math.setScore(score);
    }

    public void printTotal(){
        int total = this.korea.getScore() + this.math.getScore();
        System.out.println("총점은 " + total + "점 입니다.");
    }

}
