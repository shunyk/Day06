package com.shunyk.food;

public class Kimbob {
		int mc2 = 0;
		public int kimbob(Food[] foods, int count) {
			int menu2 = 0;

			menu2 += foods[1].price*count;
			foods[1].stock -= count;
			mc2 += count;
			
			return mc2;
		}
}