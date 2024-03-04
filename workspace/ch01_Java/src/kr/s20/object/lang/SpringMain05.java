package kr.s20.object.lang;

import java.util.StringTokenizer;

public class SpringMain05 {
	public static void main(String[] args) {
		
		/*
		 * [실습}
		 * 아래 문자열의 대문자 -> 소문자, 소문자 -> 대문자
		 */
		String str = "abcMDye-4W?EWzz";
		String result = "";
		for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); //charAt = String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환해주는 녀석 
            							//(i)의 괄호는 문자열에서 문자의 순서를 나타내는 것
            if (ch >= 65 && ch <= 90) { // 대문자인 경우 소문자로 변환
            	//char -> String     		 소문자로 변환
            	result += String.valueOf(ch).toLowerCase();
            } else if (ch >= 97 && ch <= 122) { 
            	//char -> String     		 대문자로 변환
                result += String.valueOf(ch).toUpperCase();// 소문자인 경우 대문자로 변환
            } else { // 알파벳이 아닌 경우 그대로 유지
                result += ch;
            }
        }
        System.out.println(result);
        System.out.println("--------------------");
        
        String result2 = "";
        //				  String -> char[] 로 바꿔주는 함수<.toCharArray()>
        for (char c : str.toCharArray()) {
        	//대문자이면 true반환
        	if(Character.isUpperCase(c)) {
        					//소문자로 변환
        		result2 += Character.toLowerCase(c);
        					//소문자이면 true
        	}else if(Character.isLowerCase(c)) {
        					//대문자로 변환
        		result2 += Character.toUpperCase(c);
        	}else {
        		result2 +=c;
        	}
        }
        System.out.println(result2);
        System.out.println("--------------------");
        
        
        
        String result3 = "";
        for (int i =0; i<str.length();i++) {
        	char c = str.charAt(i);
        	if(c >=65 && c <= 90) {//대문자
        					//소문자로 변환
        		result3 += (char)(c+32); //형변환을 해야됨 why? 그냥 하면 아스키코드 형태로 나옴.
        	}else if (c >= 97 && c <=122) { //소문자
        					//대문자로 변환
        		result3 +=(char)(c-32);  //형변환을 해야됨
        	}else {
        		result3 += c;
        	}
        }
        System.out.println(result3);
        
        
    }
}




