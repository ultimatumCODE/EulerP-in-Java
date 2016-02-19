
public class Problem3{
	public static void main(String[] args){
		long sol=600851475143l;
		long time = System.nanoTime();
		for(int i=2;i<=sol/2+1;i++){
			if(sol%i==0){
				sol=sol/i;
				i=1;
			}
		}
		time = System.nanoTime() - time;
		System.out.println(time);
		System.out.println(sol);
	}
}
