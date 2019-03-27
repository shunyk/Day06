package com.shunyk.food;

import java.util.Scanner;

public class FoodMenu {
	int mc1=0;
	int mc2=0;
	int mc3=0;
	int m1=0;
	int m2=0;
	int m3=0;
	
	public void input(Food [] foods) {
		Scanner sc = new Scanner(System.in);
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
				if(foods[0].stock == 0) {
					System.out.println("재고가 없습니다.");
					break;
				}
				System.out.println("수량 선택");
				count = sc.nextInt();
				foods[0].stock -= count;
				mc1 += count;
				m1 = count;
				break;
			case 2:
				if(foods[0].stock == 0) {
					System.out.println("재고가 없습니다.");
					break;
				}
				System.out.println("수량 선택");
				count = sc.nextInt();
				foods[1].stock -= count;
				mc2 += count;
				m2 = count;
				break;
			case 3:
				if(foods[0].stock == 0) {
					System.out.println("재고가 없습니다.");
					break;
				}
				System.out.println("수량 선택");
				count = sc.nextInt();
				foods[2].stock -= count;
				mc3 += count;
				m3 = count;
				break;
			default:
				if(m1 != 0) {
					System.out.println("라면 " + m1 + "인분" + "\t" + m1*foods[0].price + "원");
				}
				if(m2 != 0) {
					System.out.println("김밥 " + m2 + "인분" + "\t" + m2*foods[1].price + "원");
				}
				if(m3 != 0) {
					System.out.println("떡볶이 " + m3 + "인분" + "\t" + m3*foods[2].price + "원");
				}
				check = !check;
				break;
			}

		}

	}
}
