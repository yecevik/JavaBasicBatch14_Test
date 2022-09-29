package HW;

import java.util.Scanner;

public class Clock2Digits {

	public static void main(String[] args) {

		for (int z = 0; z <= 2; z++) {
			for (int x = 0; x <= 9; x++) { if (z==2 && x>3) {break;}
				for (int c = 0; c <= 5; c++) {
					for (int v = 0; v <= 9; v++) {

						System.out.println("it's " + z + x + ":" + c + v + " o'clock");
					}
				}
			}
		}
		
		

        for (int h = 0; h < 24; h++) {

            for (int m1 = 0; m1 <= 5; m1++) {

                for (int m2 = 0; m2 <= 9; m2++) {

                    if (h < 10) {
                        System.out.println("0" + h + ":" + m1 + m2);
                    } else {
                        System.out.println(h + ":" + m1 + m2);
                    }
                }
            }}}}