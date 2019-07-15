static void insert(int arr[],int p)
{
	int n = arr.length, temp, j;

	if(n <= 1) return;

	for(int i = 1; i < n; i++) {
		temp = arr[i];

		for(j = i-1; j >= 0; j--) {
			if(arr[j] > temp) {
				arr[j+1] = arr[j];
			} else {
				break;
			}
		}
		arr[j+1] = temp; 
	}
}
