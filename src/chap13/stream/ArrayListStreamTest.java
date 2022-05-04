package chap13.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayListStreamTest {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		
		//ArrayList stream instance 생성
		al.stream().forEach(s -> System.out.println(s));
		al.stream().filter(s -> s > 2).forEach(s -> System.out.println(s));
		
		
		Stream<Integer> stream = al.stream();
		stream.forEach(s -> System.out.println(s));
		
		
		
		//filter 반환값을 ArrayList에 저장
		ArrayList<Integer> intArrayList = (ArrayList<Integer>) al.stream().filter(s -> s > 2).collect(Collectors.toList());
		
		for ( int i : intArrayList) {
			System.out.println(i);
		}
		
		
		int[] alist = {1,2,3,4};
		
		
		
		//Array stream instance 생성
		Arrays.stream(alist).forEach( print1 -> System.out.println(print1));
		
		//Array stream reduce 사용
		
		int s = Arrays.stream(alist).reduce(0,(a,b) -> {
			int sum = a+b;
			return sum;
		});
		
		System.out.println(s);
		
		
		
		
	}
}
