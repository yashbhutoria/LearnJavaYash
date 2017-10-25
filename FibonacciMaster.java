import java.util.Scanner;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

class FibonacciMaster{
	
	static Map<Integer,BigInteger> bigMemo = new HashMap<Integer,BigInteger>();
    static BigInteger fiboBigMemoised(int n) {
    
    	if(!bigMemo.containsKey(n)){
            if(n<2)
                bigMemo.put(n, BigInteger.ONE);
            else{
                bigMemo.put(n, fiboBigMemoised(n-1).add(fiboBigMemoised(n-2))) ;   
            }
        }
        return bigMemo.get(n);
    }

	static long cache[] = new long[100];
	public static long fibo(int n){

		if(cache[n] != 0) return cache[n];

		if(n<2){
			cache[n] = 1;	
		} 
		else{
			cache[n] = fibo(n-1) + fibo(n-2);	
		} 
		return cache[n];
	}

	public static long iterativeLong(int n){
		long a = 1;
		long b = 1;
		long c = 0;
		
		while(n-- > 0){
			c = a+b;
			b = c;
			a = b;
		}
		return c;
	}

	public static BigInteger iterativeBigInteger(int n){
		BigInteger a = BigInteger.ONE;
		BigInteger b = BigInteger.ONE;
		BigInteger c = BigInteger.ZERO;
		while(n-- > 0){
			c = a.add(b);
			b = c;
			a = b;
		}
		return c;
	}


	public static void main(String[] args) {
		System.out.print(master(1000000));
	}
}