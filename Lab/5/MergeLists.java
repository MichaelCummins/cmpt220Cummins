/**
 * file: MergeLists.java
 * author: Michael Cummins
 * course: CMPT 220
 * assignment: lab 5
 * due date: October 6,2016
 * version: 1.0
 */
import java.util.Scanner;

public class MergeLists {
  // Main method 
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter list1: ");
    int[] list1 = new int[input.nextInt()];
    for (int i = 0; i < list1.length; i++) {
      list1[i] = input.nextInt();
    }
    System.out.print("Enter list2: ");
    int[] list2 = new int[input.nextInt()];
    for (int i = 0; i < list2.length; i++) {
      list2[i] = input.nextInt();
    }
    // Merge 
    int[] list3 = merge(list1, list2);
    // Display merged lists
    System.out.print("The merged list is");
    for (int e: list3) {
      System.out.print(" " + e);
    }
      System.out.println();
	}

  /** merge merges lists into a new sorted list.*/
  public static int[] merge(int[] list1, int[] list2)  {
    int[] list3 = new int[list1.length + list2.length];
    for (int i = 0; i < list1.length; i++)
      list3[i] = list1[i];
    for (int i = 0, j = list1.length; i < list2.length; i++, j++) {
      list3[j] = list2[i];	
    }

    sort(list3);
    return list3;
	}
  /** sort sorts a list in accending order*/
  public static void sort(int[] list) {
    for (int i = 0; i < list.length - 1; i++) {
    int min = list[i];
	int minIndex = i;
	for (int j = i + 1; j < list.length; j++) {
    if (list[j] < min) {
    min = list[j];
    minIndex = j; 
      }					
    }
	if (minIndex != i) {
    list[minIndex] = list[i];
    list[i] = min;
      }
    }
  }
}