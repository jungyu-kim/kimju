package chap04;

public class Exam173 {

	public static void main(String[] args) {
		// 50에서 100까지 3의 배수 합 구하기
		// 3의 배수 출력 마지막에 3의 배수합 출력
		// 3의 배수 갯수 출력
		int sum = 0;
		int cnt = 0;
		for (int i = 50; i <= 100; i++) {
			// i 값은 50~100까지 합
			if (i % 3 == 0) {
				System.out.print(i + " ");
				sum += i;
				cnt++;
			}
		}

		System.out.println("sum:" + sum + ",cnt:" + cnt);

		// 1에서 n까지의 7의배수 합이 300이 넘는 순간 n값 구하기
		// 7의 배수의 합이 300이 넘는 순간의 7의 배수 찾기
		// while 문

		int su = 0;
		sum = 0;
		while (sum < 300) {
			su += 7;
			sum += su;
		}
		System.out.println("7의 배수 = " + su);
		System.out.println("7의 배수 합 = " + sum);

//		int num = 0;
//		int sum1 = 0;
//		
//		while(true) {
//			num++;
//		if(sum1%7 == 0) {
//			sum1 += num;
//			if(sum1 >= 300) break;
//			
//		}
//		}
//

		// 구구단 : 중첩 for 문
		for (int a = 1; a < 10; a++) {
			System.out.print("===" + a + "단===");
		}
		for (int i = 1; i < 10; i++) {

			for (int j = 2; j < 10; j++) {
//				System.out.println(i + "X" + j + "=" + (i*j) );

				System.out.printf("\n%d X %d = %d", j, i, j * i);
			}
		}

	}

}
