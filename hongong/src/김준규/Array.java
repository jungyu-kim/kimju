package 김준규;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// 1번
		int [] nums= new int[10];
		for(int i=0; i<nums.length; i++ ) {
			int su =(int)(Math.random()*100)+1;
			nums[i] = su;
		}
		// 배열 값 출력
		System.out.println(Arrays.toString(nums));
		// 배열 값의 합계, 최대값, 최소값 출력
		int sum = 0;
		int max = 0;
		int min = 0;
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
			sum += nums[i];
			if(max < nums[i]) max =nums[i];
			if(min < nums[i]) min =nums[i];
		}
		System.out.println();
		System.out.printf("sum = %d max = %d min = %d\n", sum, max, min);
		
		// 2번 //타입[] 변수 = new 타입[길이];
		int[][] arr = {{1,2,3},{1,2},{1},{1,2,3}};
				        
		 for(int i=0; i<arr.length; i++) {
			 for (int j=0; j<arr[i].length; j++) {
				 
				 System.out.print(arr[i][j] + " ");
			 }
			 System.out.println();
		}
		
		// 3번
		// 4번
		// 5번
		// 6번
		

	}

}
