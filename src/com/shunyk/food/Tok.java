package com.shunyk.food;

public class Tok {
	int mc3 = 0;
	public int tok(Food[] foods, int count) {
		int menu3 = 0;

		menu3 += foods[2].price*count;
		foods[2].stock -= count;
		mc3 += count;
		
		return mc3;
	}
}
