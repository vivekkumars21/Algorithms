import java.util.Enumeration;

public class selection {
	public static void sort(int[] arr){
		for(int i = 0; i<arr.length - 1 ; i++){
			int minIdx = i;

			for(int j = i + 1; j < arr.length; j++){
				if(arr[j] < arr[minIdx]){
					minIdx = j;
				}
			}

			int temp = arr[minIdx];
			arr[minIdx] = arr[i];
			arr[i] = temp;
		}
	}

	public static void main(String[] args){
		int[] arr = { 4, 45, 11 ,65, 2};

		sort(arr);

		for(int num : arr){
			System.out.print(num + " ");
		}
	}
}
