import java.util.Random;

class Main
{
	
	void merge(int arr[], int start, int middle, int end)
	{
		
		int firstSub = middle - start + 1;
		int secondSub = end - middle;

		int Left[] = new int[firstSub];
		int Right[] = new int[secondSub];

		for (int i = 0; i < firstSub; ++i)
			Left[i] = arr[start + i];
		for (int j = 0; j < secondSub; ++j)
			Right[j] = arr[middle + 1 + j];

	
		int i = 0, j = 0;

		int k = start;
		while (i < firstSub && j < secondSub) {
			if (Left[i] <= Right[j]) {
				arr[k] = Left[i];
				i++;
			}
			else {
				arr[k] = Right[j];
				j++;
			}
			k++;
		}

		while (i < firstSub) {
			arr[k] = Left[i];
			i++;
			k++;
		}

		while (j < secondSub) {
			arr[k] = Right[j];
			j++;
			k++;
		}
	}

	void sort(int arr[], int start, int end)
	{
		if (start < end) {
			int middle = start + (end-start)/2;

			sort(arr, start, middle);
			sort(arr, middle + 1, end);

			merge(arr, start, middle, end);
		}
	}

	static void printArray(int numbers[])
	{
		int n = numbers.length;
		for (int i = 0; i < n; ++i)
			System.out.print(numbers[i] + ", ");
		System.out.println();
	}

	public static void main(String args[])
	{
	  int numbers[];
      numbers = new int[100];
    
    Random rand = new Random();
    int max = 500;
    for(int i=0; i< 100; i++)
    {
      int randomInt = rand.nextInt(max);
      numbers[i]=randomInt;
      
    }

		System.out.println("Random Array:");
		printArray(numbers);

		Main sorter = new Main();
		sorter.sort(numbers, 0, numbers.length - 1);

		System.out.println("Sorted Array:");
		printArray(numbers);
	}
}