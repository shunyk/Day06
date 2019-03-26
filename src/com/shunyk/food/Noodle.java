package com.shunyk.food;

import java.util.Scanner;

public class Noodle {
	int mc1 = 0;
	public int noodle(Food[] foods, int count) {
		int menu1 = 0;

		menu1 += foods[0].price*count;
		foods[0].stock -= count;
		mc1 += count;
		
		return mc1;
	}
}
