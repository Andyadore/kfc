package com.kfc;

import org.junit.Test;

public class KFCorder implements IKFCorder {
	
	@Test
	public void welcome() {
		System.out.println("*************************************");
		System.out.println("**            ��ӭ����KFC           **");
		System.out.println("**       -----------------         **");
		System.out.println("**      |    1.ʵ�ݲ�Ʒ        |    		   **");
		System.out.println("**      |    2.��Լ�ײ�        |  	       **");
		System.out.println("**       -----------------         **");
		System.out.println("*************************************");
	}

	@Test
	public void benefitfood() {
		System.out.println("*************************************");
		System.out.println("<<      1.�������ȱ�                6.5Ԫ         >>");
		System.out.println("<<      2.��ζ�����                 6Ԫ            >>");
		System.out.println("<<      3.��֭�ְǼ�+С��        17Ԫ          >>");
		System.out.println("<<      4.����                            5Ԫ            >>");
		System.out.println("*************************************");
	}

	@Test
	public void simplefood() {
		System.out.println("*************************************");
		System.out.println("<<   1.�������ȱ� +���ּ���      10Ԫ          >>");
		System.out.println("<<   2.�����+�Ϲϱ�                  10Ԫ          >>");
		System.out.println("<<   3.���ռ��ȱ�+�����          10Ԫ           >>");
		System.out.println("<<   4.�����+����+С��            13Ԫ           >>");
		System.out.println("<<   5.���ռ��ȱ�+����+С��     13Ԫ           >>");
		System.out.println("<<   6.�����ȱ�+����+С��         13Ԫ          >>");
		System.out.println("*************************************");
	}


}
