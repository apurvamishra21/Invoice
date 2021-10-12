package com.vtiger.genericLib;

import java.util.Random;

public class JavaCommonUtils {
	
	public int generateRandomData() {
		
		Random r = new Random();
		int num = r.nextInt();
		
		return num;
	}

}
