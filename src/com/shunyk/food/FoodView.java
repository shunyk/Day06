package com.shunyk.food;

public class FoodView {
	public void view(Food [] foods) {
		FoodMenu fm = new FoodMenu();
		int mc1 = fm.mc1;
	int sum = (mc1*foods[0].price) + (mc2*foods[1].price) + (mc3*foods[2].price);
	System.out.println("하루 판매량");
	System.out.println("라면 : " + mc1*foods[0].price);
	System.out.println("김밥 : " + mc2*foods[1].price);
	System.out.println("떡볶이 : " + mc3*foods[2].price);
	System.out.println("총 합계 : " + sum);
	}
}
