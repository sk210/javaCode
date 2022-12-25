package GeeksterDSA.Week3;

public class MergeShort {
	
	public static void merge(int[] arr,int l,int r) {
		
		int mid = (l + r)/2;
		int j = mid + 1;
		int i = l;
		int k = l;
		int[] temp = new int[arr.length];
		
		while(l <= mid && j <= r) {
			if(arr[i]<arr[j]) {
				temp[k++] = arr[i++];
			}
			else {
				temp[k++] = arr[j++];
			}
			
		}
		
		while(i <= mid) {
			temp[k++] = arr[i++];
		}
		
		while(j <= r) {
			temp[k++] = arr[j++];
		}
		
		for(i = l;i<=r;i++) {
			arr[i] = temp[i];
		}
		
	}
	
	public static void sort(int[] arr,int l,int r) {
		if(l<r) {
			
			int mid = l + ((r - l)/2);
			sort(arr,mid,r);
			sort(arr,l,mid+1);
			merge(arr,l,r);
			
		}
	}
	
	static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

	public static void main(String[] args) {
		
		int[] arr = {23,54,3,6,7,2,10};
		int l = 0;
		int r = arr.length - 1;
		sort(arr,l,r);
		System.out.println("Print Sorted Array");
		printArray(arr);

	}

}
