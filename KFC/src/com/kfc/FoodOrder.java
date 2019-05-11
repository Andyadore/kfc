package com.kfc;


public class FoodOrder {

	public String getbenefitfoodorder(int num) {
		switch(num) {
		case 1:return  "ÏãÀ±¼¦ÍÈ±¤";
		case 2:return "À±Î¶¼¦Èâ¾í" ;
		case 3:return "ÃÛÖ­ÊÖ°Ç¼¦+Ğ¡¿É";
		case 4:return "À±³á";
		default:
			System.out.println("ÇëÊäÈë²Ëµ¥ÉÏÃæµÄĞòºÅ 1-4");
			break;
		}
		return null;	
	}
	
	public String getsimplefoodorder(int num) {
		
		switch(num) {
		case 1:return "ÏãÀ±¼¦ÍÈ±¤ +ÂóÀÖ¼¦¿é";
		case 2:return "¼¦Èâ¾í+ÄÏ¹Ï±ı ";
		case 3:return "°åÉÕ¼¦ÍÈ±¤+¼¦Èâ¾í";
		case 4:return "¼¦Èâ¾í+¿¾³á+Ğ¡¿É ";
		case 5:return "°åÉÕ¼¦ÍÈ±¤+¿¾³á+Ğ¡¿É";
		case 6:return "ÏãÀ±ÍÈ±¤+¿¾³á+Ğ¡¿É ";
		default:
			System.out.println("ÇëÊäÈë²Ëµ¥ÉÏÃæµÄĞòºÅ 1-6");
			break;
		}	
		return null;
	}
}
