package kr.s21.object.util;
import java.util.StringTokenizer;
public class StringTokenizerMain01 {
	public static void main(String[] args) {
		String source = "100,200,300,400";
		StringTokenizer st = new StringTokenizer(source, ","); //,가 여기서는 구분자임
		
		//구분자를 통해서 잘려진 문자열이 있는지 검증하는 역할<.hasMoreTokens()>
		while(st.hasMoreTokens()) {
			
			System.out.println(st.nextToken());//잘려진 문자열을 반환해주는 역할<.nextToken()>
		}
}
}
