package math;

public class armstrong {

	public static void main(String[] args) {
		int i =1;
	      while(i<500){
	        int b=i;
	        int sum=0,tmp=0;
	        while(b>0){
	          tmp=b%10;
	          b=b/10;
	          int c=tmp*tmp*tmp;
	          sum+=c;
	        }
	        if(sum==i){
	          System.out.println(i);
	        }
	        i++;
	      }
	}

}
