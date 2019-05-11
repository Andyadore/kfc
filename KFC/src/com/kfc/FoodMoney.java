package com.kfc;

public class FoodMoney {

	
	public double getbenefitfood(int num) {
		
		switch(num) {
		case 1:return  6.5;
		case 2:return 6;
		case 3:return 17;
		case 4:return 5;
		default:
			System.out.println("请输入菜单上面的序号 1-4");
			break;
		}	
		return 0;
	}
	
	public double getsimplefood(int num) {
		
		switch(num) {
		case 1:return 10;
		case 2:return 10;
		case 3:return 10;
		case 4:return 13;
		case 5:return 13;
		case 6:return 13;
		default:
			System.out.println("请输入菜单上面的序号 1-6");
			break;
		}	
		return 0;
	}
	
}
