package com.shunyk.food;

public class FoodView {
	public void view(Food [] foods, int mc1, int mc2, int mc3) {
	int sum = (mc1*foods[0].price) + (mc2*foods[1].price) + (mc3*foods[2].price);
	System.out.println("하루 판매량");
	System.out.println("라면 : " + mc1*foods[0].price);
	System.out.println("김밥 : " + mc2*foods[1].price);
	System.out.println("떡볶이 : " + mc3*foods[2].price);
	System.out.println("총 합계 : " + sum);
	}
	public void view2(Food[] foods) {
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
