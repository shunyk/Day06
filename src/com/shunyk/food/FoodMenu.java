package com.shunyk.food;

import java.util.Scanner;

public class FoodMenu {
	int mc1=0;
	int mc2=0;
	int mc3=0;
	public void input(Food [] foods) {
		Scanner sc = new Scanner(System.in);
		FoodInput menu = new FoodInput();
		Noodle noodle = new Noodle();
		Kimbob kimbob = new Kimbob();
		Tok tok = new Tok();
		boolean check = true;

		int count = 0;
		while(check) {	
			System.out.println("메뉴\t가격\t재고");
			for(int i=0; i<foods.length; i++) {
				System.out.println(foods[i].name + "\t" + foods[i].price + "\t" + foods[i].stock);
			}
			System.out.println("1.라면 2.김밥 3.떡볶이 4.결제");
			int a = sc.nextInt();
			switch(a) {
			case 1:
				System.out.println("수량 선택");
				count = sc.nextInt();
				foods[0].stock -= count;
				mc1 = count;
				break;
			case 2:
				System.out.println("수량 선택");
				count = sc.nextInt();
				foods[1].stock -= count;
				mc2 = count;
				break;
			case 3:
				System.out.println("수량 선택");
				count = sc.nextInt();
				foods[2].stock -= count;
				mc3 = count;
				break;
			default:
				if(mc1 != 0) {
					System.out.println("라면 " + mc1 + "인분" + "\t" + mc1*foods[0].price + "원");
				}
				if(mc2 != 0) {
					System.out.println("김밥 " + mc2 + "인분" + "\t" + mc2*foods[1].price + "원");
				}
				if(mc3 != 0) {
					System.out.println("떡볶이 " + mc3 + "인분" + "\t" + mc3*foods[2].price + "원");
				}
				check = !check;
				break;
			}

		}

	}
}
