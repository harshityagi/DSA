package array;

public class Sorting {
	static int cntQ=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[]= {6,3,9,5,2,8}; //int l=a.length;
		//printA(a);
		//quickSort(a,0,l-1);
		//print
		//printA(a);
		int i=6;
		int x=i++;
		System.out.println(x);
		System.out.println(i);
		System.out.println(x);
			
	}
	private static void printA(int[] a) {
		// TODO Auto-generated method stub
		int l=a.length;
		for(int i=0;i<l;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void quickSort(int a[],int l, int h) {
		
		if(l<h) {
			System.out.println("Inside QuickSort "+cntQ);
			//cntQ++;
			int pidx=partition(a,l,h);
			System.out.println("Inside QuickSort");
			printA(a);
			quickSort(a,l,pidx-1);
			quickSort(a,pidx+1,h);
		}
		cntQ++;
	}
	private static int partition(int[] a, int l, int h) {
		cntQ++;
		int pivot=a[h];
		int i=l-1;
		for(int j=l;j<h;j++) {
			if(a[j]<pivot) {
				i++;
				//swap
				int tmp=a[i];
				a[i]=a[j];
				a[j]=tmp;
			}
		}
		//swap with pivot
		i++;
		int tmp=a[i];
		a[i]=pivot;
		a[h]=tmp;
		return i;//pivot index
	}

}
