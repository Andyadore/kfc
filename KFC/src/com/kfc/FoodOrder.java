package com.kfc;


public class FoodOrder {

	public String getbenefitfoodorder(int num) {
		switch(num) {
		case 1:return  "�������ȱ�";
		case 2:return "��ζ�����" ;
		case 3:return "��֭�ְǼ�+С��";
		case 4:return "����";
		default:
			System.out.println("������˵��������� 1-4");
			break;
		}
		return null;	
	}
	
	public String getsimplefoodorder(int num) {
		
		switch(num) {
		case 1:return "�������ȱ� +���ּ���";
		case 2:return "�����+�Ϲϱ� ";
		case 3:return "���ռ��ȱ�+�����";
		case 4:return "�����+����+С�� ";
		case 5:return "���ռ��ȱ�+����+С��";
		case 6:return "�����ȱ�+����+С�� ";
		default:
			System.out.println("������˵��������� 1-6");
			break;
		}	
		return null;
	}
}
