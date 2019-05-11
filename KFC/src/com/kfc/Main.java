package com.kfc;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

	static boolean flag = true;
	public static int countmain = 0;// 今日营业额
	static int num = 0;
	static double gmoney = 0;// 客人支付的钱
	static double zmoney = 0;// 找零
	public static double moneymain = 0;// 今日总共赚钱数
	static double ordermoney = 0;

	public static void main(String[] args) throws IOException {

		new Picture();

		// 获取当前时间
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日hh时mm分ss秒");
		String date = sdf.format(new Date());

		File file = new File("./List.txt");
		try {
			if (!file.exists()) {
				file.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		KFCorder ko = new KFCorder();
		FoodMoney foodmoney = new FoodMoney();
		FoodOrder foodorder = new FoodOrder();
		ko.welcome(); // 欢迎界面

		while (flag) {
			FileWriter fw = new FileWriter(file, true);
			Scanner sc = new Scanner(System.in);
			System.out.println("选择实惠产品还是简约套餐?");
			int ch = sc.nextInt(); // 输入选择实惠产品还是简约套餐,在所选菜单下，选择食物
			if (ch == 1) { // 选择实惠产品
				ko.benefitfood();
				System.out.println("请输入要选择的食物编号:");
				num = sc.nextInt();
				String string = foodorder.getbenefitfoodorder(num);// 所选食物
				double ordermoney = foodmoney.getbenefitfood(num);// 食物定价
				System.out.println("您选择的食物为：" + string);
				System.out.println("您所选择的食物定价为:" + ordermoney + "元");
				System.out.println("您是否有优惠券?——1有/2没有");
				int coupon = sc.nextInt();

				if (coupon == 1) {
					System.out.println("您优惠券的折扣为(请输入小数):");
					double discount = sc.nextDouble();
					ordermoney = ordermoney * discount;
					System.out.println("您所选择的食物价格为:" + ordermoney + "元");
					System.out.println("支付中......");
					gmoney = sc.nextDouble();// 客人支付的钱
					System.out.println("您实付：" + gmoney + "元");
					zmoney = gmoney - ordermoney;// 找零
					System.out.println("找零为：" + zmoney + "元");
					moneymain += ordermoney;
				} else {
					System.out.println("支付中......");
					gmoney = sc.nextDouble();// 客人支付的钱
					System.out.println("您实付：" + gmoney + "元");
					zmoney = gmoney - ordermoney;// 找零
					System.out.println("找零为：" + zmoney + "元");
					moneymain += ordermoney;
				}

				try {
					fw.write("-----------欢迎光临KFC-----------\n\n");
					fw.write("\n    食物：" + string + "\n");
					fw.write("    食物价格：" + ordermoney + "元" + "\n");
					fw.write("    实付：" + gmoney + "元" + "\n");
					fw.write("    找零：" + zmoney + "元" + "\n");
					fw.write("    日期(12小时制)：" + date + "\n");
					fw.write("\n---------------------------------\n\n");
					fw.close();

				} catch (IOException e) {
					e.printStackTrace();
				}

			} else if (ch == 2) { // 选择简约套餐
				ko.simplefood();
				System.out.println("请输入要选择的食物编号:");
				num = sc.nextInt();
				String string = foodorder.getsimplefoodorder(num);// 所选食物
				double ordermoney = foodmoney.getsimplefood(num);// 食物定价
				System.out.println("您选择的食物为：" + string);
				System.out.println("您所选择的食物定价为:" + ordermoney);
				System.out.println("您所选择的食物定价为:" + ordermoney + "元");
				System.out.println("您是否有优惠券?——1有/2没有");
				int coupon = sc.nextInt();

				if (coupon == 1) {
					System.out.println("您优惠券的折扣为(请输入小数):");
					double discount = sc.nextDouble();
					ordermoney = ordermoney * discount;
					System.out.println("您所选择的食物价格为:" + ordermoney + "元");
					System.out.println("支付中......");
					gmoney = sc.nextDouble();// 客人支付的钱
					System.out.println("您实付：" + gmoney + "元");
					zmoney = gmoney - ordermoney;// 找零
					System.out.println("找零为：" + zmoney + "元");
					moneymain += ordermoney;
				} else {
					System.out.println("支付中......");
					gmoney = sc.nextDouble();// 客人支付的钱
					System.out.println("您实付：" + gmoney + "元");
					zmoney = gmoney - ordermoney;// 找零
					System.out.println("找零为：" + zmoney + "元");
					moneymain += ordermoney;
				}

				try {
					fw.write("-----------欢迎光临KFC-----------\n\n");
					fw.write("\n    食物：" + string + "\n");
					fw.write("    食物价格：" + ordermoney + "元" + "\n");
					fw.write("    实付：" + gmoney + "元" + "\n");
					fw.write("    找零：" + zmoney + "元" + "\n");
					fw.write("    日期(12小时制)" + date + "\n");
					fw.write("\n---------------------------------\n\n");
					fw.close();

				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			++countmain;

			System.out.println("是否还有下一单?——1有/2没有");
			int order = sc.nextInt();// 是否有下一个订单
			if (order == 2) {
				flag = false;
			}
		}

		System.out.println("今日订单数：" + countmain);
		System.out.println("今日营业额：" + moneymain);

		System.exit(0);

	}

}
