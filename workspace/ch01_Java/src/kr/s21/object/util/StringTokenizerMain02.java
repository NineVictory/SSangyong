package kr.s21.object.util;
import java.util.StringTokenizer;
public class StringTokenizerMain02 {
	public static void main(String[] args) {
		String source = "2024-03-04 14:03:20"; //-,공백,:등이 구분자이다.
		StringTokenizer st =
				new StringTokenizer(source, "- :");//-,공백,:등이 구분자이다.
		while(st.hasMoreTokens()) {//잘려진 문자열이 있는지 검토
			System.out.println(st.nextToken());//잘려진 문자열을 반환해주는 역할
		}
	}
}
