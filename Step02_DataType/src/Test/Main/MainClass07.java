package Test.Main;
/*
 * 	[	Java 참조 데이터 type	]
 * 
 * 	String type
 * 
 * 	-	문자열을 다룰때 사용하는 데이터 type 이다.
 * 	-	참조 데이터 type 변수에는 참조값(id) 값이 들어 있다.
 */
public class MainClass07 {
		public static void main(String[] args) {
				System.out.println("main 메소드가 시작되었습니다.");
				// "김구라" 라는 String type 참조값을 name 이라는 지역변수에 대입
				String name="김구라";
				//	name 안에 들어있는 참조값을 myName 이라는 새로운 변수에 대입
				String myName=name;
				// "원숭이" 라는 String type 참조값을 name 에 덮어쓰기(새로대입)
				name="원숭이";
				// String type 참조값이 들어갈 수 있는 지역변수 name 을 빈상태로 만들기
				name=null;
				// null 은 참조데이터 type 이 들어갈수있는 빈공간을 뜻한다.
		}
}
