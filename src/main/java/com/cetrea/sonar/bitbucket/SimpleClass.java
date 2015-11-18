package com.cetrea.sonar.bitbucket;

public class SimpleClass {
	public String foo(String bar) {
		if(bar.equals("")) {
			bar = bar.substring(1);
			
			if (bar != null) {
				return bar;
			}
		}
		String s = null;
		return s.substring(1);
	}
}
