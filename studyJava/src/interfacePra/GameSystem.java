package interfacePra;

/**
 * author {yhh1056}
 * Create by {2020/11/24}
 */
public interface GameSystem {
	String LOGIN_MESSAGE = "게임 시작";
	String LOGOUT_MESSAGE = "게임 종료";
	String START = "캐릭터를 선택해주세요. 초보자, 전사, 법사만 입력 가능";
	String BEGINNER = "초보자";
	String WARRIOR = "전사";
	String WIZARD = "법사";

	void login();

	void logOut();

	void playing();
}
