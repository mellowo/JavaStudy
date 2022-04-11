package chap11.object;

class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    //Book클래스에서 toString메소드 오버라이딩
    @Override
    public String toString() {
        return "title : " + title + ", author : " + author;
    }
}
public class ToStringEx {
    public static void main(String[] args) {
        Book book = new Book("토끼와 거북이", "이건형");
        System.out.println(book);
        System.out.println(book.toString());
    }
}
