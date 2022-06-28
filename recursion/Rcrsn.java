package recursion;

import java.util.Arrays;
import java.util.Scanner;

//RECURSION: A function calls itself directly or indirectly. 
public class Rcrsn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	      int n=sc.nextInt();
	      int a[]=new int[n];
	      for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();        
	      }
	      Arrays.sort(a);
	      int j=0;
	      int flag=0;
	      while(j<n-1){
	        if(a[j]==a[j+1]) flag=1;
	        j++;
	      }
	      if(flag==0){
	        System.out.println("false");
	      }else{
	        System.out.println("true");
	        }
	      sc.close();
	}

}
