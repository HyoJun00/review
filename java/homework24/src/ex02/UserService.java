package ex02;

import java.util.ArrayList;
import java.util.List;

public class UserService {
	// 필드
	private List<UserVO> list = new ArrayList<>();
	
	// 메소드
	// 아이디 중복검사 메소드
	boolean checkId(String id) {
		for(UserVO user : list) {
			if(user.getId().equals(id)) {
				return false;
			}
		}
		return true;
	}

	// 회원가입 메소드
	void join(UserVO user) {
		list.add(user);
	}
	
	// 로그인 메소드
	UserVO login(String id, String pw) {
		for(UserVO user : list) {
			if(user.getId().equals(id) && user.getPw().equals(pw)) {
				return user;
			}
		}
		return null;
	}
}
