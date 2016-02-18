
public class Problem1Alternative{
		public static void main(String[] args){
			long time = System.nanoTime();
			int sum=0;
			int steps =0;
			for(int i=1;i<1000;i++){
				if(i%3==0 || i%5==0)
					sum=sum+i;
				steps++;
			}
			time = System.nanoTime() - time;
			System.out.println(sum);
			System.out.println(time);
			System.out.println(steps);
		}
}