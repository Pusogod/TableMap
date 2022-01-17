package Map인터페이스계열의클래스예제;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

/*
 *  로그인 인증처리 => ID와 Password 일치 여부 판단하는 프로그램
 */
public class HashtableClassEx {
	public static void main(String[] args) {
		String[] userID = { "Lee", "Kim", "Jang", "Wang", "Ha" }; // 키
		String[] passWord = { "L123", "K456", "J234", "W879", "H23" }; // 값

		// Hashtable 객체 생성
		Map<String, String> ht = new Hashtable<String, String>(userID.length);

		// Hashtable 객체 저장
		for (int i = 0; i < userID.length; i++) {
			ht.put(userID[i], passWord[i]);
		}
		System.out.println(ht);
		// {Jang=J234, Ha=H23, Lee=L123, Wang=W879, Kim=K456} // [중요] 키와 값이 한쌍으로 저장

		// 로그인 인증처리
		boolean FLAG = true;

		while (FLAG) { // 무한 Loop
			System.out.print("유저 ID : ");
			Scanner scan = new Scanner(System.in);
			String user_key = scan.nextLine(); // Lee라고 가정하자
			String pw_value = ht.get(user_key); // L123 라고 가정

			if (pw_value != null) {
				System.out.print("유저 Password : ");
				String passwordInput = scan.nextLine();

				if (pw_value.equals(passwordInput)) {
					System.out.println("인증되었습니다.");
				} else {
					System.out.println("인증실패");
				}
			} else {
				System.out.println(user_key + " 은(는) 등록되지 않은 ID 입니다.");

			}
		}

	}

}
