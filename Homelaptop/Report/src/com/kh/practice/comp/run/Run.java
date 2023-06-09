package com.kh.practice.comp.run;

import com.kh.practice.comp.func.CompExample;
import com.kh.practice.comp.func.RockPaperScissors;
import com.kh.practice.comp.func.UpAndDown;

public class Run {

	public static void main(String[] args) {
		CompExample compExample = new CompExample();
		compExample.practice1();
		compExample.practice2();
		compExample.practice3();
		compExample.practice4();
		compExample.practice4_1();
		
		UpAndDown upAndDown = new UpAndDown();
		upAndDown.upDown();

		RockPaperScissors RockPaperScissors = new RockPaperScissors();
		RockPaperScissors.rps();
	}

}
