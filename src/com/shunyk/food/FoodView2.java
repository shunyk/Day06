package com.shunyk.food;

public class FoodView2 {
	public void view(Food[] foods, int mc[]) {
		FoodMenu2 fm2 = new FoodMenu2();
		int sum=0;
		System.out.println("하루 판매량");
		for(int i=0; i<foods.length; i++) {
			System.out.println(foods[i].name + " : " + mc[i]*foods[i].price);
			sum+=mc[i]*foods[i].price;
		}
		System.out.println("총 합계 : " + sum);
	}
}
