package com.pageObjects;

public class A_B_SplitTestingPage {
	private static String expectedHeadingText = "A/B Test Variation 1";
	private static String expectedParagraphText = "Also known as split testing. This is a way in which businesses are able to simultaneously test and learn different versions of a page to see which text and/or functionality works best towards a desired outcome (e.g. a user action such as a click-through).";
	
	public static String expectedHeadingText() {
		return expectedHeadingText;
	}
	
	public static String expectedParagraphText() {
		return expectedParagraphText;
	}
}
