package com.kfc;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

	static boolean flag = true;
	public static int countmain = 0;// ����Ӫҵ��
	static int num = 0;
	static double gmoney = 0;// ����֧����Ǯ
	static double zmoney = 0;// ����
	public static double moneymain = 0;// �����ܹ�׬Ǯ��
	static double ordermoney = 0;

	public static void main(String[] args) throws IOException {

		new Picture();

		// ��ȡ��ǰʱ��
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��hhʱmm��ss��");
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
		ko.welcome(); // ��ӭ����

		while (flag) {
			FileWriter fw = new FileWriter(file, true);
			Scanner sc = new Scanner(System.in);
			System.out.println("ѡ��ʵ�ݲ�Ʒ���Ǽ�Լ�ײ�?");
			int ch = sc.nextInt(); // ����ѡ��ʵ�ݲ�Ʒ���Ǽ�Լ�ײ�,����ѡ�˵��£�ѡ��ʳ��
			if (ch == 1) { // ѡ��ʵ�ݲ�Ʒ
				ko.benefitfood();
				System.out.println("������Ҫѡ���ʳ����:");
				num = sc.nextInt();
				String string = foodorder.getbenefitfoodorder(num);// ��ѡʳ��
				double ordermoney = foodmoney.getbenefitfood(num);// ʳ�ﶨ��
				System.out.println("��ѡ���ʳ��Ϊ��" + string);
				System.out.println("����ѡ���ʳ�ﶨ��Ϊ:" + ordermoney + "Ԫ");
				System.out.println("���Ƿ����Ż�ȯ?����1��/2û��");
				int coupon = sc.nextInt();

				if (coupon == 1) {
					System.out.println("���Ż�ȯ���ۿ�Ϊ(������С��):");
					double discount = sc.nextDouble();
					ordermoney = ordermoney * discount;
					System.out.println("����ѡ���ʳ��۸�Ϊ:" + ordermoney + "Ԫ");
					System.out.println("֧����......");
					gmoney = sc.nextDouble();// ����֧����Ǯ
					System.out.println("��ʵ����" + gmoney + "Ԫ");
					zmoney = gmoney - ordermoney;// ����
					System.out.println("����Ϊ��" + zmoney + "Ԫ");
					moneymain += ordermoney;
				} else {
					System.out.println("֧����......");
					gmoney = sc.nextDouble();// ����֧����Ǯ
					System.out.println("��ʵ����" + gmoney + "Ԫ");
					zmoney = gmoney - ordermoney;// ����
					System.out.println("����Ϊ��" + zmoney + "Ԫ");
					moneymain += ordermoney;
				}

				try {
					fw.write("-----------��ӭ����KFC-----------\n\n");
					fw.write("\n    ʳ�" + string + "\n");
					fw.write("    ʳ��۸�" + ordermoney + "Ԫ" + "\n");
					fw.write("    ʵ����" + gmoney + "Ԫ" + "\n");
					fw.write("    ���㣺" + zmoney + "Ԫ" + "\n");
					fw.write("    ����(12Сʱ��)��" + date + "\n");
					fw.write("\n---------------------------------\n\n");
					fw.close();

				} catch (IOException e) {
					e.printStackTrace();
				}

			} else if (ch == 2) { // ѡ���Լ�ײ�
				ko.simplefood();
				System.out.println("������Ҫѡ���ʳ����:");
				num = sc.nextInt();
				String string = foodorder.getsimplefoodorder(num);// ��ѡʳ��
				double ordermoney = foodmoney.getsimplefood(num);// ʳ�ﶨ��
				System.out.println("��ѡ���ʳ��Ϊ��" + string);
				System.out.println("����ѡ���ʳ�ﶨ��Ϊ:" + ordermoney);
				System.out.println("����ѡ���ʳ�ﶨ��Ϊ:" + ordermoney + "Ԫ");
				System.out.println("���Ƿ����Ż�ȯ?����1��/2û��");
				int coupon = sc.nextInt();

				if (coupon == 1) {
					System.out.println("���Ż�ȯ���ۿ�Ϊ(������С��):");
					double discount = sc.nextDouble();
					ordermoney = ordermoney * discount;
					System.out.println("����ѡ���ʳ��۸�Ϊ:" + ordermoney + "Ԫ");
					System.out.println("֧����......");
					gmoney = sc.nextDouble();// ����֧����Ǯ
					System.out.println("��ʵ����" + gmoney + "Ԫ");
					zmoney = gmoney - ordermoney;// ����
					System.out.println("����Ϊ��" + zmoney + "Ԫ");
					moneymain += ordermoney;
				} else {
					System.out.println("֧����......");
					gmoney = sc.nextDouble();// ����֧����Ǯ
					System.out.println("��ʵ����" + gmoney + "Ԫ");
					zmoney = gmoney - ordermoney;// ����
					System.out.println("����Ϊ��" + zmoney + "Ԫ");
					moneymain += ordermoney;
				}

				try {
					fw.write("-----------��ӭ����KFC-----------\n\n");
					fw.write("\n    ʳ�" + string + "\n");
					fw.write("    ʳ��۸�" + ordermoney + "Ԫ" + "\n");
					fw.write("    ʵ����" + gmoney + "Ԫ" + "\n");
					fw.write("    ���㣺" + zmoney + "Ԫ" + "\n");
					fw.write("    ����(12Сʱ��)" + date + "\n");
					fw.write("\n---------------------------------\n\n");
					fw.close();

				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			++countmain;

			System.out.println("�Ƿ�����һ��?����1��/2û��");
			int order = sc.nextInt();// �Ƿ�����һ������
			if (order == 2) {
				flag = false;
			}
		}

		System.out.println("���ն�������" + countmain);
		System.out.println("����Ӫҵ�" + moneymain);

		System.exit(0);

	}

}
