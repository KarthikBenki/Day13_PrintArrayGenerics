package com.blz.printarray;

public class PrintArray {

    // generic array printing
    static public <T> void printArray(T[] arr) {
	for (T element : arr)
	    System.out.print(element + " ");
	System.out.println();
    }

    public static void main(String[] args) {
	Integer[] arr1 = { 10, 20, 30 };
	Double[] arr2 = { 1.23, 2.24, 3.345 };
	Character[] arr3 = { 'a', 'A', 'V' };
	printArray(arr1);
	printArray(arr2);
	printArray(arr3);

    }

}
