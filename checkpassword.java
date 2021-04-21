package week8;

import java.util.Scanner;

public class checkpassword {
	public static void main(String args[]) {

		boolean lengthOk = false;
		boolean hasSpace = false;
		boolean hasUpper = false;
		boolean hasLower = false;
		boolean hasDigit = false;

		// 1.��ʾ������ʾ��Ϣ
		System.out.println("Enter password:");

		// 2.�����ַ�����Ϊ����
		Scanner scan = new Scanner(System.in);
		String password = scan.next();

		// 3.�������ĳ���
		int len = password.length();
		// �����ж�
		if (len < 6 || len > 10) {
			System.out.println("����������볤�ȱ�����6-10֮��");
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
			System.out.println("��ϲ�㣬��������������Ҫ��");
		} else {
			System.out.println("���ź��������������" + password + "����ԭ�����£�");
			String errorInfo = " ";
			if (hasSpace) {
				errorInfo = "���ܰ����ո�";
			}
			if (!hasUpper) {
				errorInfo += "û�д�д��ĸ";
			}
			if (!hasLower) {
				errorInfo += "û��Сд��ĸ";
			}
			if (!hasDigit) {
				errorInfo += "û������";
			}
			System.out.println(errorInfo);
		}

		// 4.���������Ч
		// 5.���ַ�������һȡ��ÿһ�ַ���������Ӧ���жϣ����������������

	}
}
