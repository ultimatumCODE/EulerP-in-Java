
public class Problem5 {
	public static void main(String[] args){
		int[] divisors = new int[20]; //array that will contain the divisors to find the product
		divisors[0] = 2;
		divisors[1] = 3;
		int sn= 6; //this will be the product of the elements of divisors
		for(int k=2;k<20;k++)
			divisors[k]=1; //initiallizate all the elements of divisors as 1
		for(int i=4;i<21;i++){ // the number we are finding must be divisible by 1 to 20, but we have stored 2 and 3 in divisors already
			int test=i; 
			for(int j=i-3;j>=0;j--){ //i-3 is the pointer to last element of the divisors array
				if(test%divisors[j]==0){ 
					test = test/divisors[j];
					}
			}
			divisors[i-2] = test; // we save the remaining test in the next to last divisors stores, thats i-2 pointer
			sn*=test; 
		}
		System.out.println(sn);
	}
}