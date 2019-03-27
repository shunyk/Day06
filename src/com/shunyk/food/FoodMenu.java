package com.shunyk.food;

import java.util.Scanner;

public class FoodMenu {	
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
				foods[0].hap += count;
				foods[0].count = count;
				break;
			case 2:
				if(foods[0].stock == 0) {
					System.out.println("재고가 없습니다.");
					break;
				}
				System.out.println("수량 선택");
				count = sc.nextInt();
				foods[1].stock -= count;
				foods[1].hap += count;
				foods[1].count = count;
				break;
			case 3:
				if(foods[0].stock == 0) {
					System.out.println("재고가 없습니다.");
					break;
				}
				System.out.println("수량 선택");
				count = sc.nextInt();
				foods[2].stock -= count;
				foods[2].hap += count;
				foods[2].count = count;
				break;
			default:
				if(foods[0].count != 0) {
					System.out.println("라면 " + foods[0].count + "인분" + "\t" + foods[0].count*foods[0].price + "원");
				}
				if(foods[1].count != 0) {
					System.out.println("김밥 " + foods[1].count + "인분" + "\t" + foods[1].count*foods[1].price + "원");
				}
				if(foods[2].count != 0) {
					System.out.println("떡볶이 " + foods[2].count + "인분" + "\t" + foods[2].count*foods[2].price + "원");
				}
				check = !check;
				break;
			}

		}

	}
	public void input2(Food [] foods) {
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
			System.out.println("========================");
			int select = sc.nextInt();
			if(select<=foods.length) {
				System.out.println("주문 수량");
				count = sc.nextInt();
				for(int i=0; i<foods.length; i++) {
					if(select-1 == i) {
						if(foods[i].stock == 0) {
							System.out.println("재고 없음");
							System.out.println("========================");
							break;
						}
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
				System.out.println("========================");
				check = !check;

				break;
			}
		}

	}
}
