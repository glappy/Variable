package com.biz.var;

public class Variable03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// boolean ���� ���� ����
		int intNum1 = 30;
		int intNum2 = 40;
		
		boolean bNum ;
		
		// boolean�� �� �����ڸ� ���� ���� ���
		bNum = intNum1 < intNum2;
		System.out.println(bNum);
		
		bNum = intNum1 > intNum2;
		System.out.println(bNum);
		
		bNum = intNum1 == intNum2;
		System.out.println(bNum);

		bNum = (intNum1 <= intNum2);
		System.out.println(bNum);

		bNum = (intNum1 >= intNum2);
		System.out.println(bNum);
	
	}
}