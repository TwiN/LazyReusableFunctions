public static double getMaxValue(double[] arr) {
	double max = Double.MIN_VALUE;
	for (int i = 0; i<arr.length; i++) {
	    if (arr[i]>max) { 
	        max=arr[i];
	    }
	}
	return max;
}
