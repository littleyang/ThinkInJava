package interrupt.thread;

public class InterruptThread extends Thread {

	@Override
	//override the run method
	public void run(){
		long number = 1L;
		while(true){
			if(isPrime(number)){
				System.out.printf("Number %d is prime number!\n",number);
			}
			if (isInterrupted()) {
				System.out.printf("The Prime Generator has been Interrupted\n");
				return;
			}
			number ++;
		}
	}
	 public boolean isPrime(long num){
		 
		 if(num < 2){
			 return true;
		 }
		 for (long i =2;i< num;i++){
			 if((num%i==0)){
				 return false;
			 }
		 }
		 return true;
	 }
}
