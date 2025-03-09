package menuSystem.member;

import java.util.Scanner;

public class MemberView {

	Scanner sc = new Scanner(System.in);

	public int loginMenuView() {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("============== 로그인 메뉴 ==============");
		System.out.println();
		System.out.println("[1]회원가입       [2]로그인        [3]종료");
		System.out.println();
		System.out.print(">> ");
		int input = sc.nextInt();
		sc.nextLine();
		return input;
	}

	public MemberInfoDTO joinView() {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("=============== 회원 가입 ===============");
		System.out.println();

		System.out.print(" ID  입력 : ");
		String id = sc.next();
		System.out.print(" PW  입력 : ");
		String pw = sc.next();
		System.out.print(" 이름 입력 : ");
		String name = sc.next();
		sc.nextLine();
		return new MemberInfoDTO(id, pw, name);
	}

	public MemberInfoDTO loginView() {

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("================ 로그인 ================");
		System.out.println();
		System.out.print("ID 입력 : ");
		String id = sc.next();
		System.out.print("PW 입력 : ");
		String pw = sc.next();
		sc.nextLine();
		MemberInfoDTO dto = new MemberInfoDTO();
		dto.setId(id);
		dto.setPw(pw);
		return dto;
	}

	
}
