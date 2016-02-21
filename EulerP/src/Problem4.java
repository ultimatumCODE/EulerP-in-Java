
public class Problem4 {
	public static void main(String[] args){
		int max=1;
		long time = System.nanoTime();
		for(int i=999;i>99;i--)
			for(int j=999;j>99;j--){
				if(isPalindrome(j*i))
					if(j*i>max)
						max=j*i;
			}
		time = System.nanoTime() - time;
		System.out.println(max);
		System.out.println(time);
	}
	
	
	public static boolean isPalindrome(int n) {
		int m = n/10;
		int rev = n%10;
		if(rev == 0)
			return false;
		while(m>0){
			rev = rev*10 + m%10;
			m = m/10;
		}
		return n == rev;
	}
}
