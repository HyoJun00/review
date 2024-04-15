package ex02;

public class UserVO {
	// 필드
	private String id;
	private String pw;
	private String name;
	private int age;
	
	// 생성자
	public UserVO(String id, String pw, String name, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}

	// toString() 재정의
	@Override
	public String toString() {
		return "아이디 : " + this.id + "\n비밀번호 : " + this.pw + "\n이름 : " + this.name + "\n나이 : " + this.age;
	}


	// getter
	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
