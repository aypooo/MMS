package controller;

import java.util.Scanner;
import action.Action;

public class MemberController {
	public void processRequest(Scanner scan, Action action) {
		try {
			action.execute(scan);
		} catch (NullPointerException e) {
			System.out.println("���� �����Դϴ�.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
}
