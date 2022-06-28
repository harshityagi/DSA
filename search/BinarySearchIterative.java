package search;

public class BinarySearchIterative {

	public static void main(String[] args) {
		int[] a= {10,20,30,40};
		int t=20;
		System.out.println(binarySearchRec(a, 0, a.length, t));
		//System.out.println(binarySearch(a,t));
	}

	private static int binarySearch(int[] a, int t) {
		// TODO Auto-generated method stub
		int l=a.length,mid=0,str=0,end=l-1;
		while(str<=end) {
			mid=(str+end)/2;
			if(a[mid]==t) return mid;
			else if(a[mid]<t) str=mid+1;
			else if(a[mid]>t) end=mid-1;
		}
		return -1 ;
	}
	private static int binarySearchRec(int[] a, int low, int high, int t) {
		// TODO Auto-generated method
		if(low>high) return -1;
		int mid=(low+high)/2;
		if(a[mid]==t) return mid;
		else if(a[mid]>t) return binarySearchRec(a, low, mid-1, t);
		else return binarySearchRec(a, mid+1, high, t);
		//return -1;
	}
}
