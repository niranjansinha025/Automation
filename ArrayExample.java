package Testing1;

public class ArrayExample {

	public static void main(String[] args) {
		//Array a1[] = {1, 2, 3, 5, 8, 10, 13, 14};
		  //a[5] = {1,2,3,4,5};
		//int[] array1;
		  //array1 = new int[7];
		 int[] array1 = {1, 2, 3, 5, 8, 10, 13, 14};
		 int arrayLength = array1.length;
		 int Target_Sum = 12;
		 for(int i=0;i<arrayLength;i++)
		 {
			 for (int j=1;j<i+1;j++)
			 {
			 if (array1[i]+array1[j]==Target_Sum)
				 System.out.println("Both numbers are : "+array1[i] +" " +array1[j]);
			 }
		 }

	}

}
