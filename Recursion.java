class Recursion{


	public static int factorialIter(int n){
		int ans = 1;
		while(n > 0){
			ans *= n;
			n--;
		}
		return ans;
	} 

	public static int factorialRecur(int n){
		return n*factorialRecur(n-1);
	}

	public static void main(String[] args) {
		System.out.println(factorialRecur(5));
	}
}