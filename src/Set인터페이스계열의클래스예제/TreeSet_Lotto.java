package Set�������̽��迭��Ŭ��������;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/*
 *  HashSet ��ü�� �����ϸ� ��ü ������ ���� ���� ! !
 */
public class TreeSet_Lotto {

	public static void main(String[] args) {
		Set set = new TreeSet();
		
		for(int i=0; set.size() <6; i++) {
			Random rnd = new Random();    		// ���� �߻��ϴ� Ŭ����
			int number = rnd.nextInt(45)+1; 		// 1~45 ������ ���� �߻�
			set.add(new Integer(number));
		}
		System.out.println("<< �ζǹ�ȣ �����ֱ� >>");
		System.out.println(set);
	}

}
