package GeeksterDSA.Week3;

public class CharArrayInDecendingOrder {
	
public static void merge(char[] arr,int l,int mid,int r) {
		
		int j = mid + 1;
		int i = l;
		int k = l;
		char[] temp = new char[arr.length];
		
		while(l <= mid && j <= r) {
			if(arr[i]>arr[j]) {
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
	
	
	
	public static void sort(char[] arr,int l,int r) {
		if(l<r) {
			
			int mid = l + ((r - l)/2);
			sort(arr,l,mid);
			sort(arr,mid+1,r);
			merge(arr,l,mid,r);
			
		}
	}
	
	static void printArray(char[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

	public static void main(String[] args) {
		char[] arr = {'a','x','y','A','T','t'};
		int l = 0;
		int r = arr.length - 1;
		sort(arr,l,r);
		printArray(arr);

	}

}
