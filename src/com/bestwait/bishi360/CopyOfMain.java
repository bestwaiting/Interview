package com.bestwait.bishi360;

import java.util.Scanner;

public class CopyOfMain
{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			String colorSeq = scanner.next();
			String once = scanner.next();
			String twice = scanner.next();
			
			System.out.println(judgeDirection(colorSeq, once, twice));
		}

		scanner.close();

	}

	public static String judgeDirection(String colorSeq, String once, String twice) {
		boolean isForward = isForward(colorSeq, once, twice);
		boolean isBackward = isBackward(colorSeq, once, twice);

		if (isForward && isBackward) {
			return "both";
		}

		if (isForward) {
			return "forward";
		}

		if (isBackward) {
			return "backward";
		}

		return "invalid";

	}

	public static boolean isForward(String colorSeq, String once, String twice) {
		int onceStartIndex = colorSeq.indexOf(once);
		int twiceStartIndex = colorSeq.lastIndexOf(twice);
		boolean result = onceStartIndex + once.length() <= twiceStartIndex;
		return result;
	}

	public static boolean isBackward(String colorSeq, String once, String twice) {
		String reversedColorSeq = reverse(colorSeq); 
		return isForward(reversedColorSeq, once, twice);
	}

	public static String reverse(String colorSeq) {
		StringBuilder sb = new StringBuilder(colorSeq.length());
		return sb.reverse().toString();
	}
}
