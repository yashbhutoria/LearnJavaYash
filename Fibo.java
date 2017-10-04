import java.util.Scanner;
class Fibo{

	public static int fibo(int n){
		if(n<2) return 1;
		else return fibo(n-1) + fibo(n-2);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Length of Series: ");
		int n = in.nextInt();
		for(int i=0 ; i<n ; i++){
			System.out.print(fibo(i) + " ");	
		}
	}
}