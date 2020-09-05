package com.app.test;

import com.app.one.ExamResult;
import static com.app.one.ExamResult.PASS;

public class Test {

	public static void main(String[] args) {
		System.out.println(ExamResult.FAIL);
		System.out.println(PASS);
		
		System.out.println("-----------------------------");
		ExamResult[] val = ExamResult.values();
		
		for (ExamResult examResult : val) {
			System.out.println(examResult+"----"+examResult.ordinal());
			
		}
	}

}
