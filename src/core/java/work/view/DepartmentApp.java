package core.java.work.view;

import java.util.Scanner;

import core.java.work.constant.Department;

public class DepartmentApp {

	Department name;

	public void getDept(int val) {

		for (Department dept : Department.values()) {
			if (dept.getVal() == val) {
				System.out.println(dept);
				return;
			}
		}
		System.out.println("No Department exist");
	}

	public static void main(String[] arg) {

		DepartmentApp da = new DepartmentApp();
		Scanner scanner = new Scanner(System.in);
		int val = scanner.nextInt();
		da.getDept(val);
	}
}
