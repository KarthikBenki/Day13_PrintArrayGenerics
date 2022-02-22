package com.blz.printarray;

public class PrintArray {

    // integer array printing
    static public void printArray(int[] arr) {
	for (int element : arr)
	    System.out.print(element + " ");
	System.out.println();
    }

    // double array printing
    static public void printArray(double[] arr) {
	for (Double element : arr)
	    System.out.print(element + " ");
	System.out.println();
    }

    // character array printing
    static public void printArray(char[] arr) {
	for (char element : arr)
	    System.out.print(element + " ");
	System.out.println();
    }

    public static void main(String[] args) {
	int[] arr1 = { 10, 20, 30 };
	double[] arr2 = { 1.23, 2.24, 3.345 };
	char[] arr3 = { 'a', 'A', 'V' };
	printArray(arr1);
	printArray(arr2);
	printArray(arr3);

    }

}
