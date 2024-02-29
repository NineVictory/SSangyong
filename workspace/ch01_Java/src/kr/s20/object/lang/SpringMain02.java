package kr.s20.object.lang;

public class SpringMain02 {
	public static void main(String[] args) {
		String s1 = "Kwon Sun Ae";
				   //012345678910, length(길이) = 11
		
		int index = s1.indexOf('n'); //'n'이 위치한 인덱스를 반환하는 함수 <.indexOF(문자)>
		System.out.println("맨 처음 문자 n의 위치 : " +index);
		
		index = s1.indexOf("Sun");// 단어가 아닌 sun이라는 문자열을 넣을 시 맨 앞에 있는 S의 위치만 반환한다.
									// 즉 문자열의 모든 위치는 나타내지않고 맨 앞만 나타냄.
		System.out.println("문자 Sun의 위치"+index); 
		
		index = s1.lastIndexOf('n');//indexOf의 반대, indexOf는 앞에서부터 찾지만 lastIndexOf는 뒤에서부터 찾는다.
									//그래서 Kwon의 n이 아닌 sun의 n을 반환한다.
		System.out.println("마지막 문자 n의 위치 : "+ index);
		
		char c = s1.charAt(index); //바로 위에서 index가 n으로 지정되어있었기 때문에 c에는 n의 위치인 7이 들어간다.
		System.out.println("지정한 인덱스의 문자 추출:"+c);
		
		index = s1.indexOf('S');
		String str = s1.substring(index); //문자열 추출. index의 값부터 뒤에 값들을 반환한다. index는 S이기 때문에 S가 나오기 전까지의 문자들은 넘기고 S를 찾는다.
		System.out.println("대문자 S부터 끝까지 잘라내기 : "+ str);
		
		str = s1.substring(index,index+3);//index = 5, 즉 5와 8을 지정
		System.out.println("인덱스 5부터 인덱스 8전까지 문자열 추출: " + str); //8이 출력되는 것이 아닌 8 '전'까지 출력. index위치 567이 출력
		
		int length = s1.length();
		System.out.println("문자열의 길이: "+length);
		
		//구분자를 이용해서 문자열 잘라내기
		String[] array = s1.split(" "); //split(나누려는 기준값) 문자를 잘라서 첫번째 문자는 인덱스 0번째부터 순서대로 넣는다.
		for (int i =0; i<array.length; i++) {
			System.out.println("array["+i+"]:"+array[i]);
		}
	}
}
