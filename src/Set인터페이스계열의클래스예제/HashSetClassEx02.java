package Set인터페이스계열의클래스예제;

/*
 *  Set 이라는 인터페이스를 구현받은 클래스들 (HashSet, TreeSet)로 생성한 객체는
 *  
 *  첫째;  순서를 유지하지 않고 저장되며
 *  둘째; 중복저장 허용안함
 */

import java.util.HashSet;
import java.util.Set;

public class HashSetClassEx02 {

	public static void main(String[] args) {
			Set<String> hashSet = new HashSet<String>();
			
			hashSet.add(new String("박태호"));
			hashSet.add(new String("김윤성"));
			hashSet.add(new String("오수철"));
			hashSet.add(new String("손유일"));
			hashSet.add(new String("홍지수"));
			hashSet.add(new String("오수철"));
			
			System.out.println(hashSet);
	}

}
