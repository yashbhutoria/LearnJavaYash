class Ellipsis{

	public static int sum(int... arr){
		int ans = 0;
		for(int i : arr){
			ans += i;
		}
		return ans;
	}

	public static void main(String[] args) {
		System.out.println(sum(1,2,3,4,1,2,2,2,2,2,2,2));
		System.out.println(sum(1,2,3));
		System.out.println(sum(1,2));
		System.out.println(sum(1));
	}
	
}