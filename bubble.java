public class bubble {
    public static void main(String[] args){
		System.out.println("HELL");

		int[] arr = {6, 1, 55, 98, 76};
		int temp;

		for(int i = 0; i< arr.length - 1 ; i++){
			for(int j = 0; j<arr.length - i - 1; j++){
				if(arr[j] > arr[j + 1]){
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;




				}


			}


		}

		for(int num : arr){
			System.out.print(num + " ");
		}


	}
}
