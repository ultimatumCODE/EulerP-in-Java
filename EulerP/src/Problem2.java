
public class Problem2{
	public static void main(String[] args){
		int l=1;
		int r=2;
		int sum=2;
		long time = System.nanoTime();
		while(l+r<4000000){
			int n=l+r;
			l=r;
			r=n;
			if(n%2==0)
				sum+=n;
		}
		time = System.nanoTime() - time;
		System.out.println(time);
		System.out.println(sum);
	}
}
