package org.eclipse.emf.henshin.interpreter.util;

import java.util.Random;

public class videoUtils {
	public static Random rn = new Random((int) System.currentTimeMillis());

	public static int getRandomValue(int min, int max) {
		int diff = max - min;
		if (diff <= 1) {
			return 0;
		}
		int value = rn.nextInt() % diff;
		if (value < 0) {
			value = value * (-1);
		}
		return value;
	}

	public static String getRandomString(String... array) {
		int min = 0;
		int max = array.length;
		int diff = max - min;
		if (diff <= 1) {
			return array[0];
		}
		int value = rn.nextInt() % diff;
		if (value < 0) {
			value = value * (-1);
		}
		return array[value];
	}
}
