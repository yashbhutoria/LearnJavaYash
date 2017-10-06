import java.util.*;
class RMS{

	public static double root(double n){
		return Math.sqrt(n);
	}

	public static double[] square(double[] arr){
		for( int i = 0 ; i < arr.length ; i++ ){
			arr[i] *= arr[i];
		}
		return arr;
	}

	public static double mean(double[] arr){
		double ans = 0;
		for(double i : arr){
			ans += i;
		}
		ans /= arr.length;
		return ans;
	}

	public static void main(String[] args) {
		double arr[] = new double[10];

		for(int i=0;i<10;i++){
			arr[i] = Math.sin(Math.random()*100);
		}

		System.out.println(Arrays.toString(arr));

		System.out.println("Mean: "+mean(arr));
		double ans = root(mean(square(arr)));
		System.out.println("RMS Value: "+ans);
	}
}