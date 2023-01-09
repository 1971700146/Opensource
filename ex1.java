package chapter7;
import java.util.Vector;
public class ex1 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(7); // 여기 7이 capacity
		v.add(5);
		v.add(4);
		v.add(-1);
		
		v.add(2,100); // 위치 삽입 0, 1, 2번째에 100삽입
		System.out.println("배열 개수 : "+v.size());//size 는 배열의 들어가 있는 량
		System.out.println("총 배열 크기 : " + v.capacity());//capacity 는 배열의 총 크기
		for(int i=0; i<v.size(); i++) {
			int n= v.get(i);  //그 위치의 숫자
			System.out.println(n);
			
		}
		v.remove(1);
		int sum =0;
		for(int i=0; i<v.size(); i++) {
			int n = v.elementAt(i); //반대로 하나씩 가져오기
			sum +=n;
			
		}
		System.out.println("정수 합"+ sum);
		
	}
}
