package Test.Main;

public class MainClass08 {
		public static void main(String[] args) {
				System.out.println("main 메소드가 시작되었습니다.");
				//	지역변수는 선언만 하면 만들어지지 않는다.
				int num1;
				
				// 만들어지지 않았기 때문에 참조 불가.
				// int result=num1+10;
				
				// 참조데이터 type 이 담길 지역변수도 역시 선언만 하면 만들어지지 않는다.
				String name;
				//	참조불가
				// System.out.println(name);
		}
}
