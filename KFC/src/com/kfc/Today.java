package com.kfc;

public class Today{

	private int today;
	private int count;
	private double money;
	
	public Today() {
		super();
	}

	public Today(int today, int count, double money) {
		super();
		this.today = today;
		this.count = count;
		this.money = money;
	}

	public int getToday() {
		return today;
	}

	public void setToday(int today) {
		this.today = today;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "Today [today=" + today + ", count=" + count + ", money=" + money + "]";
	}
	
	
	
	
}
