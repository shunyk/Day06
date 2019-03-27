package com.shunyk.food;

public class FoodView2 {
	public void view(Food[] foods) {
		int sum=0;
		System.out.println("========================");
		System.out.println("하루 판매량");
		for(int i=0; i<foods.length; i++) {
			System.out.println(foods[i].name + " : " + foods[i].hap*foods[i].price);
			sum+=foods[i].hap*foods[i].price;
		}
		System.out.println("총 합계 : " + sum);
		System.out.println("========================");
	}
}
