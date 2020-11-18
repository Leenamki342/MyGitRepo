package Test.Main;

public class MainClass04 {

		public static void main(String[] args) {	// main + ctrl + space
				System.out.println("main 메소드가 시작 되었습니다.");	// Syso + ctrl + space
				/*	1. 각각의 점수를 지역변수 eng, kor, math 에 대입하기.
				 * 	영어점수 100
				 * 	국어점수 100
				 * 	수학점수 90
				 */
				int eng=100;
				int kor=100;
				int math=90;
				System.out.println("영어, 국어, 수학 점수");
				System.out.println("eng = "+eng);
				System.out.println("kor = "+kor);
				System.out.println("math = "+math);
				
				//	2. eng, kor, math 세 점수의 합을 구해서 sum 이라는 이름의 지역변수에 담아보기.
				int sum=eng+kor+math;
				System.out.println("총합");
				System.out.println("sum = "+sum);
				
				// 3. 세 점수의 평균 구하기.(ave 사용)
				//	int type 과 int type 을 연산하면 결과는 int type 만 나온다.
				// 만일 정확한 실수값을 얻으려면 연산에 참여하는 데이터 중에
				//어느 하나라도 실수 type 이 되어야 실수 type 이 출력된다.
				double ave=(double)sum/3d;	//	정수:sum , 실수:(double)sum / 정수:3, 실수:3d
				System.out.println("평균");
				System.out.println("ave = "+ave);
				
		}

}
