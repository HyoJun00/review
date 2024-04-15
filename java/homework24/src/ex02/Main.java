package ex02;

public class Main {
	public static void main(String[] args) {
		UserService service = new UserService(); // UserService 객체 생성
		UserVO user = new UserVO("abc111", "111", "홍길동", 22); // UserVO 객체 생성
		
		if (service.checkId(user.getId())) { // 아이디 중복검사 실행
			service.join(user); // 중복이 아닐 시 회원가입 실행
			System.out.println(user.toString()); // 사용자 정보 출력
			System.out.println("가입이 완료되었습니다."); // 가입 완료 메시지 출력
		} else {
			System.out.println("중복된 아이디가 존재합니다."); // 중복된 아이디가 있다면 아이디가 존재한다는 메시지 출력
		}
		
		user = service.login("abc111", "111") ; // 로그인 메소드 실행
		
		if(user != null) { 
			System.out.println(user.getName() + "님 환영합니다."); // 로그인 성공 시 환영 메시지 출력
		}else {
			System.out.println("로그인에 실패하였습니다."); // 로그인 실패 시 실패 메시지 출력
		}
	}
}
