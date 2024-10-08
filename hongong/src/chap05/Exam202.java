package chap05;

import java.util.Arrays;

public class Exam202 {

	public static void main(String[] args) { //String[] 배열
//		String args1 = Integer.parseInt(args[2]);
//		System.out.println(args1 + 100);
		// 배열을 생성
		// 배열을 이용하는 방법
		
		
//		int[] scores = {83, 90, 87};
//		
//		System.out.println("scores[0] : " + scores[0]);
//		System.out.println("scores[1] : " + scores[1]);
//		System.out.println("scores[2] : " + scores[2]);
//		
//		int sum = 0;
//		for(int i=0; i<scores.length; i++) {
//			sum += scores[i];
//		}
//		System.out.println("총합 : " + sum);
//		double avg = (double) sum / 3;
//		System.out.printf("%.2f", avg);
		
		//배열에 1에서 100까지의 임의의 수 10개를 저장
		//배열의 합과 평균(소수 첫째자리까지 나타냄),
		//최댓값,최소값을 구하세요
		
		//배열 생성
		int[] nums = new int[10]; //교재 p204참고
		for(int i=0; i<nums.length; i++) {  //0 ~ 9 - > 10개 방
			int su = (int)(Math.random()*100)+1; // double로 생성 되기때문에 int입력 +1은 첫번째 부터
			nums[i] = su; 
		}
		
		System.out.println(nums);
		System.out.println(Arrays.toString(nums));
		
		//배열 이용, 합, 평균, 최대, 최소값 구하기
		int sum = 0;
		int max = 0;
		int min = 100;
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
			sum += nums[i];
			if(max < nums[i]) max =nums[i];
			if(min < nums[i]) min =nums[i];
		}
		System.out.println();
		
		double avg = (double)sum / nums.length;
		System.out.printf("sum = %d avg = %.1f max = %d min = %d", sum, avg, max, min);
			

	}

}
