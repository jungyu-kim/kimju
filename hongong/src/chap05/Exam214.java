package chap05;

public class Exam214 {

	public static void main(String[] args) {
		// 2차원 배열
		int[][] scores = {
				{10,20,30},
				{40,50,60}			
		};
		
		for(int i=0; i<scores.length; i++) {
			for(int j : scores[i] ) {
				
				System.out.print(j + " "); //향상된 for문 교재 p219
			}
			System.out.println();

		}
		
		//2*3 배열을 선언하고
		//1에서 10까지 무작위 수를 입력하세요.
		//같은 수 입력 가능
		
		int[][] nums = new int[2][3];  //타입[] 변수 = new 타입[길이];
		
//		System.out.println(nums.length);  행번호, 행의길이2 
//		System.out.println(nums[0].length); 3
//		System.out.println(nums[1].length); 3
//		System.out.println(nums[2].length); 3
		
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[i].length; j++) {
			int su = (int)(Math.random()*10)+1; //1에서 10까지 무작위 수
			nums[i][j] = su;
			System.out.print(nums[i][j] + " ");
		}
			System.out.println();
	}
		
		
		//향상된 for 문 for(타입 변수 : 배열)
		int[] su1 = {10,20,30,40,50};
		//배열의 합, 최대값, 최소값
		//향상된 for 문을 이용
		int sum = 0;
		int max = Integer.MIN_VALUE;//int 값 중에 최소값
		int min = Integer.MAX_VALUE;//int 값 중에 최대값
		for(int ele : su1) {
			sum += ele;	
			if(max < ele) max = ele;
			if(min < ele) min = ele;
		
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println("sum = " + sum);
		
		
	}
}
