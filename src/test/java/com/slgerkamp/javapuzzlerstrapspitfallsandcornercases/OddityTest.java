package com.slgerkamp.javapuzzlerstrapspitfallsandcornercases;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

@RunWith(Theories.class)
public class OddityTest {

	@DataPoints
	public static Fixture[] FIXTURES = {
		new Fixture(3, true),
		new Fixture(4, false),
		new Fixture(0, false),
		new Fixture(-2, false),
		new Fixture(-1, true)
	};
	
	@Theory
	public void 奇数であることを判定(Fixture f){
		assertThat(Oddity.isOdd(f.target), is(f.expected));
	}
	
	// パラメータをFixtureオブジェクトにまとめる
	static class Fixture {
		// テストデータ
		int target;
		// 期待値
		boolean expected;
		
		Fixture(int target, boolean expected) {
			super();
			this.target = target;
			this.expected = expected;
		}
		
		@Override
		public String toString() {
			return String.format("when value target=%s, expected=%s", target, expected);
		}
	}
}
