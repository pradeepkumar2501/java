import java.util.*;
public class arrayex1{
	public static void main(String[] args){
	int[] arr=new int[10];
//write a program to create a one dimensional array of int having 10 elements initialize the array in the multiples of five and display them
	for(int i=0;i<arr.length;i++){
	arr[i]=5*i;
	}
	for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+", ");
}
}
}