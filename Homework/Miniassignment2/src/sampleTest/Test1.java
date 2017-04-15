package sampleTest;

import mini2.GridUtil;

public class Test1 {
	public static void main(String[] argc) {
		// SpecCheck TEST3
		int[][] TEST3 = new int[6][7];
		int count = 1;
		for(int i=0; i<6; i++) {
			for(int j=0; j<7; j++) {
				TEST3[i][j] = count;
				count++;
			}
		}
		// SpecCheck TEST4
		int[][] TEST4 = new int[8][8];
		count = 1;
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				TEST4[i][j] = count;
				count++;
			}
		}
		
		// Tests
		int[][] subArr1 = new int[3][3];
		subArr1 = GridUtil.getSubArray(TEST3, 3, 2, 3, false);
		System.out.println("Expect 23");
		for(int i=0; i<3; i++) {
			System.out.println();
			for(int j=0; j<3; j++) {
				System.out.print(subArr1[i][j] + " ");
			}
		}
		
		
	}
}
