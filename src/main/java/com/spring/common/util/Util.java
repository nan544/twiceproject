package com.spring.common.util;

public class Util {
	public static int nvl(String text) {
		return nvl(text, 0);
	}
	/******************************************************
	 * nvl() 메서드는 문자열을 숫자로 변환하는 메서드
	 * @param (숫자로 변환할 문자열, 초기값으로 사용할 값(대체값))
	 	참고 : 예외 처리는 체크 예외와 비체크 예외로 구분
	 			체크 예외는 파일 입출력 / 네트워크 입출력 / 데이터베이스 입출력
	 			나머지는 비체크 예외로 인식
	 * @return int
	 *******************************************************/
	public static int nvl(String text, int def) {
		int ret = def;
		try {
			ret = Integer.parseInt(text);
		}catch(Exception e) {
			ret = def;
		}
		return ret;
	}
}
