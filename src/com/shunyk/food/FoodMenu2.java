package com.shunyk.food;

import java.util.Scanner;

public class FoodMenu2 {

	public void input(Food [] foods) {
		Scanner sc = new Scanner(System.in);
		boolean check = true;

		int count = 0;
		while(check) {	
			System.out.println("메뉴\t가격\t재고");
			for(int i=0; i<foods.length; i++) {
				System.out.println(foods[i].name + "\t" + foods[i].price + "\t" + foods[i].stock);
			}
			System.out.println("========================");
			for(int i=0; i<foods.length; i++) {
				System.out.println(i+1 + "번 " + foods[i].name);
			}
			System.out.println(foods.length+1 + "번 결제");
			System.out.println("=======================");
			int select = sc.nextInt();
			if(select<=foods.length) {
				System.out.println("주문 수량");
				count = sc.nextInt();
				for(int i=0; i<foods.length; i++) {
					if(select-1 == i) {
						foods[i].stock -= count;
						foods[i].hap += count;
						foods[i].count = count;
						break;
					}
				}
			}else {
				for(int i=0; i<foods.length; i++) {
					if(foods[i].count != 0) {
						System.out.println(foods[i].name + " " + foods[i].count + "인분" + "\t" +foods[i].count*foods[i].price + "원");
					}
				}
				check = !check;
				break;
			}
		}

	}
}
