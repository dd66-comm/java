package week8;

import java.util.Scanner;

public class checkpassword {
	public static void main(String args[]) {

		boolean lengthOk = false;
		boolean hasSpace = false;
		boolean hasUpper = false;
		boolean hasLower = false;
		boolean hasDigit = false;

		// 1.显示输入提示信息
		System.out.println("Enter password:");

		// 2.输入字符串作为密码
		Scanner scan = new Scanner(System.in);
		String password = scan.next();

		// 3.检查密码的长度
		int len = password.length();
		// 长度判断
		if (len < 6 || len > 10) {
			System.out.println("输入错误，密码长度必须在6-10之间");
		} else {
			lengthOk = true;
		}
		for (int i = 0; i < len; i++) {
			char c = password.charAt(i);

			if (c == ' ') {
				hasSpace = true;
			}
			if (c >= 'A' && c <= 'Z') {
				hasUpper = true;

			}
			if (c >= 'a' && c <= 'z') {
				hasLower = true;
			}
			if (c >= '0' && c <= '9') {
				hasDigit = true;
			}
		}
		if (!hasSpace && hasUpper && hasLower && hasDigit) {
			System.out.println("恭喜你，你输入的密码符合要求！");
		} else {
			System.out.println("很遗憾，您输入的密码" + password + "错误，原因如下：");
			String errorInfo = " ";
			if (hasSpace) {
				errorInfo = "不能包含空格";
			}
			if (!hasUpper) {
				errorInfo += "没有大写字母";
			}
			if (!hasLower) {
				errorInfo += "没有小写字母";
			}
			if (!hasDigit) {
				errorInfo += "没有数字";
			}
			System.out.println(errorInfo);
		}

		// 4.如果长度有效
		// 5.从字符串中逐一取出每一字符，进行相应的判断，将检查结果保存起来

	}
}
