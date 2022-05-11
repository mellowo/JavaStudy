package chap15.stream.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5572124013773586333L;
	String name;
	String job;
	public Person() {
	}
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + "," + job;
	}
}

public class SerializationTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Person personAhn = new Person("안재용","대표이사");
		Person personKim = new Person("김철수","상무이사");
		
		try (FileOutputStream fos = new FileOutputStream("serial.out"); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			 oos.writeObject(personAhn);
			 oos.writeObject(personKim);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try (FileInputStream fis = new FileInputStream("serial.out");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			Person p1 = (Person)ois.readObject();
			Person p2 = (Person)ois.readObject();
			
			
			System.out.println(p1);
			System.out.println(p2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
