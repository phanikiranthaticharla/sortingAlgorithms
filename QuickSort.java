class QuickSort {

    /* Method for partitioning given array */
    public int partition(int[] a, int start, int end) {

	int pi = start;
	for(int i=start; i< end; i++) {
	    if(a[i] < a[end]) {
		int temp = a[pi];
		a[pi] = a[i];
		a[i] = temp; 
		pi++;
	    }
	}
	int temp = a[pi];
	a[pi] = a[end];
	a[end] = temp;
	return pi;
    }


    /* Method for sorting given array recursively */
    public void sort(int[] a, int start, int end) {

	if(start < end) {
	    int pi = partition(a, start, end);
	    sort(a, start, pi-1);
	    sort(a, pi+1, end);
	}
    }

    /* Method to print given array */
    public void print(int[] a) {
	for(int i=0; i< a.length; i++) {
	    System.out.print(a[i] + " ");
	}
	System.out.println();
    }

    /* Method for swapping two numbers 
       This won't work because java passes by value
     */
    public void swap(int a, int b) {
	
	int temp = a;
	a = b;
	b = temp;
    }

    /* Driver Method */
    public static void main(String args[]) {

	QuickSort qs = new QuickSort();
	int[] arr = new int[]{20, 10, 15, 18, 19, 40, 55, 42};
	System.out.println("Array before Sorting");
	qs.print(arr);
	qs.sort(arr, 0, arr.length-1);
	System.out.println("Array after sorting");
	qs.print(arr);
    }
}
