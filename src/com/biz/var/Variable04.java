package com.biz.var;

public class Variable04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char charAlpha = 'A';
		char charNum = '0';
		char charSpec = '%';
		char charSpace = ' ';

		System.out.println(charAlpha);
		System.out.println(charNum);
		System.out.println(charSpec);
		System.out.println(charSpace);
		
		// char ������ ��������
		// int �� ������ �����ϸ�
		// �ش� ������ ASCII�ڵ尡 ���� �ȴ�.
		int intAlpha = charAlpha; // 'A' �� 65�� �ٲ�� ����
		int intNum = charNum; //'0'�� 48�� �ٲ�� ����
		int intSpec = charSpec; // '%' �� 37�� �ٲ�� ����
		int intSpace = charSpace; // ' '�� 32�� �ٲ�� ����
		
		System.out.println("=== int char ===");
		System.out.println(intAlpha);
		System.out.println(intNum);
		System.out.println(intSpec);
		System.out.println(intSpace);

		
		
		System.out.println(charAlpha + charNum);
		System.out.println(charAlpha + charSpec);
		System.out.println(charAlpha + charSpace);
		
		int intSQ = charAlpha + 20;
		System.out.println(intSQ);
		System.out.println((char)intSQ);
		
		System.out.println((char)intAlpha++);
		System.out.println((char)intAlpha++);
		System.out.println((char)intAlpha++);
		System.out.println((char)intAlpha++);
		System.out.println((char)intAlpha++);
		System.out.println((char)intAlpha++);
		
		System.out.println("================");
		intAlpha = charAlpha;
		System.out.println((char)intAlpha);
		System.out.println((char)++intAlpha);
		System.out.println((char)++intAlpha);
		System.out.println((char)++intAlpha);
		System.out.println((char)++intAlpha);
		System.out.println((char)++intAlpha);
		System.out.println((char)++intAlpha);
		System.out.println((char)++intAlpha);
		System.out.println((char)++intAlpha);
		
		
		
		
	}

}