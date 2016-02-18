public class Problem1{
	public static void main(String[] args){
		long time = System.nanoTime();
		int sum=0;
		int steps =0;
		for(int i=1; ;i++){
			steps++;
			if(15*i<1000)
				sum=sum+3*i+5*i-15*i;
			else if(5*i<1000 && 15*i>999)
				sum=sum+3*i+5*i;
			else if(3*i<1000 && 5*i>999)
				sum=sum+3*i;
			else
				break;
		}
		time = System.nanoTime() - time;
		System.out.println(sum);
		System.out.println(time);
		System.out.println(steps);
	}
}