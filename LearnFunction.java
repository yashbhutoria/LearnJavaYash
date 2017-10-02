//Date : 2 October
// learning to implement simple function

class LearnFunction{
	// Return multiple values using array
	public static int[] cal(int a, int b){
		int sum = a+b;
		int mult = a*b;
		int div = a/b;
		int sub = a-b;
		int arr[] = {sum,mult,div,sub};
		return arr;
	}


	// This can also be used
	public static int[] cal2(int a, int b){
		int sum = a+b;
		int mult = a*b;
		int div = a/b;
		int sub = a-b;
		return new int[]{sum,mult,div,sub};
	}



	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z[] = cal(x,y);

		for(int i: z){
			System.out.println(i);
		}	
		
	}
}