public class BubbleSortTest {
    
    class BubbleSort {
        
        public void swap(int[] array, int i, int j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        
        public void bubbleSort(int[] array) {
            int n = array.length;
            
            for (int i = 0; i < n - 1; i++) 
			{
                for (int j = 0; j < n - i - 1; j++) 
				{
                    if (array[j] > array[j + 1]) 
					{
                        swap(array, j, j + 1);
                    }
                }
            }    
        }
    }

    public static void main(String[] args) {
		
        BubbleSortTest lab = new BubbleSortTest();
        BubbleSort object = lab.new BubbleSort();  
        
        int[] numbers = {8, 3, 1, 4, 5, 11, 7, 2, 17, 13};
        
        System.out.println("Array before Sorting:");
        for (int d = 0; d < numbers.length; d++){
			System.out.print(numbers[d] + ",");
		}
        
        object.bubbleSort(numbers);
        
        System.out.println("\nAfter sorting:");
        for (int d = 0; d < numbers.length; d++){
			System.out.print(numbers[d] + ",");
		}
    }
}
