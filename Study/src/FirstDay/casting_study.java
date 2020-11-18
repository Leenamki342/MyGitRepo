package FirstDay;

public class casting_study {
		public static void main(String[] args) {
				int a=100;
				int b=200;
				int c=500;
				
				int sum=a+b+c;
				System.out.println(sum);
				
				// casting란 int+int=int 에서 int+float=float 이런 식으로 실수값의 결과값이 필요할 때 사용하는 예약어이다.
				float avg=(float)sum/3;
				System.out.println("avg = "+avg);
		}
}


