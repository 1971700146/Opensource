package chapter7;
import java.util.Vector;
public class ex1 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(7); // ���� 7�� capacity
		v.add(5);
		v.add(4);
		v.add(-1);
		
		v.add(2,100); // ��ġ ���� 0, 1, 2��°�� 100����
		System.out.println("�迭 ���� : "+v.size());//size �� �迭�� �� �ִ� ��
		System.out.println("�� �迭 ũ�� : " + v.capacity());//capacity �� �迭�� �� ũ��
		for(int i=0; i<v.size(); i++) {
			int n= v.get(i);  //�� ��ġ�� ����
			System.out.println(n);
			
		}
		v.remove(1);
		int sum =0;
		for(int i=0; i<v.size(); i++) {
			int n = v.elementAt(i); //�ݴ�� �ϳ��� ��������
			sum +=n;
			
		}
		System.out.println("���� ��"+ sum);
		
	}
}
