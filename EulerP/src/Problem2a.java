
public class Problem2a{
	public static void main(String[] args){
		int l=1;
		int r=2;
		int sum=0;
		long time = System.nanoTime();
		while(r<4000000){
			sum+=(r);
			int n1=l;
			int n2=r;
			l=n1+2*n2;
			r=2*n1+3*n2;
		}
		time = System.nanoTime() - time;
		System.out.println(time);
		System.out.println(sum);
	}
}
