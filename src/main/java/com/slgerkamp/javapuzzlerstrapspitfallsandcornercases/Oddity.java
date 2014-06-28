package com.slgerkamp.javapuzzlerstrapspitfallsandcornercases;


/**
 * 表情豊かなパズラー
 * 風変わり
 *
 */
public class Oddity {
    public static boolean isOdd( int i ){
    	// 値を絶対値にする
//    	return Math.abs(i) % 2 == 1;
    	// 模範回答
//    	return i % 2 != 0;
    	// 模範回答 ビット積演算子を利用
    	return (i & 1) != 0;
    }
}
