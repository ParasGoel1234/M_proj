package com.Paras;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class serviceTest {

	@Test
	void test() {
		
		service sv = new service();
		float ex = 20;
		float act = sv.add(10, 10);
		assertEquals(ex, act);
		
		float e = 0;
		float a = sv.multi(54, 0);
		assertEquals(e, a);
		
		float expect = 10;
		float actual = sv.sub(17, 7);
		assertEquals(expect, actual);
	}
	
}
