class BubbleSort {

	public static void main(String args[]) {
		int arr[] = new int[]{10, 1, 5, 15, 2, 3};
		bubble(arr, arr.length);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	static void bubble(int arr[], int n)
	{
		int temp, swaps = 0;
		for(int i = 0; i < n-1; i++) {
			swaps = 0;
			for(int j = 0; j < n-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					swaps++;
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
			if(swaps == 0) return;
		}

	}
}
