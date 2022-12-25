package GeeksterDSA.Week3;

public class CharArrayInDecendingUsingMergeShort {
	
public static void merge(char[] arr,int l,int mid,int r) {
		
		char[] temp = new char[arr.length];
		
		int i=l ,j=mid+1;
		int index=0;
		while(i<=mid && j<=r) {
			if(arr[i]<arr[j]) {
				temp[index]=arr[i];
				i++;
			}
			else {
				temp[index]=arr[j];
				j++;
			}
			index+=1;
		}
		while(i<=mid) {
			temp[index]=arr[i];
			i++;
			index++;
		}
		while(j<=r) {
			temp[index]=arr[j];
			j++;
			index++;
		}
		index=0;
		for(int k=l;k<=r;k++) {
			arr[k]=temp[index];
			index++;
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
