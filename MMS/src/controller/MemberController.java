package controller;

import java.util.Scanner;
import action.Action;

public class MemberController {
	public void processRequest(Scanner scan, Action action) {
		try {
			action.execute(scan);
		} catch (NullPointerException e) {
			System.out.println("없는 정보입니다.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("잘못 입력하셨습니다.");
		}
	}
}
