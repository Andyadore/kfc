package com.kfc;

import org.junit.Test;

public class KFCorder implements IKFCorder {
	
	@Test
	public void welcome() {
		System.out.println("*************************************");
		System.out.println("**            »¶Ó­¹âÁÙKFC           **");
		System.out.println("**       -----------------         **");
		System.out.println("**      |    1.Êµ»Ý²úÆ·        |    		   **");
		System.out.println("**      |    2.¼òÔ¼Ì×²Í        |  	       **");
		System.out.println("**       -----------------         **");
		System.out.println("*************************************");
	}

	@Test
	public void benefitfood() {
		System.out.println("*************************************");
		System.out.println("<<      1.ÏãÀ±¼¦ÍÈ±¤                6.5Ôª         >>");
		System.out.println("<<      2.À±Î¶¼¦Èâ¾í                 6Ôª            >>");
		System.out.println("<<      3.ÃÛÖ­ÊÖ°Ç¼¦+Ð¡¿É        17Ôª          >>");
		System.out.println("<<      4.À±³á                            5Ôª            >>");
		System.out.println("*************************************");
	}

	@Test
	public void simplefood() {
		System.out.println("*************************************");
		System.out.println("<<   1.ÏãÀ±¼¦ÍÈ±¤ +ÂóÀÖ¼¦¿é      10Ôª          >>");
		System.out.println("<<   2.¼¦Èâ¾í+ÄÏ¹Ï±ý                  10Ôª          >>");
		System.out.println("<<   3.°åÉÕ¼¦ÍÈ±¤+¼¦Èâ¾í          10Ôª           >>");
		System.out.println("<<   4.¼¦Èâ¾í+¿¾³á+Ð¡¿É            13Ôª           >>");
		System.out.println("<<   5.°åÉÕ¼¦ÍÈ±¤+¿¾³á+Ð¡¿É     13Ôª           >>");
		System.out.println("<<   6.ÏãÀ±ÍÈ±¤+¿¾³á+Ð¡¿É         13Ôª          >>");
		System.out.println("*************************************");
	}


}
