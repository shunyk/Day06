package com.shunyk.food;

import java.util.Scanner;

public class FoodMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Food food = new Food();
		FoodInput fi = new FoodInput();
		FoodMenu fm = new FoodMenu();
		FoodView fv = new FoodView();
		boolean check = true;
		
		Food[] foods = fi.menu();
		while(check){
		
		System.out.println("1. 주문");
		System.out.println("2. 결산");
		int select = sc.nextInt();
		if (select == 1) {
			fm.input(foods);
			
		}else {
			fv.view(foods, fm.mc1, fm.mc2, fm.mc3);
			check = !check;
			break;
		}
		}

	}

}
