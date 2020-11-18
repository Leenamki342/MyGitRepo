package Test.Main;

public class MainClass10 {
		public static void main(String[] args) {
				// 기본 데이터 type
				int	num1=10;
				double	num2=10.1;
				char	ch1='a';
				//	참조 데이터 type
				String	str="abcde12345";	// 디버그 했을 때 (id = xxx) 값은 xxx번의 사물함에 () 앞의 값이 들어있다.
				//	length() 메소드는 문자열의 길이를 리턴한다.
				int size=str.length();
				char ch=str.charAt(5); // 문자열에서 index(5) 인 문자 가져오기 (0부터 시작)
				//	소문자를 모두 대문자로 변환한 문자열 얻어내기
				String result=str.toUpperCase();	// 이전의 문자열을 수정한것이 아니라 새로 문자열이 생긴것이다.
				// 문자열은 수정이 불가능하다.
		}
}
