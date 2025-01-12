package Testing1;

public class Dec262024 {

	public static void main(String[] args) {
		String S1 = "Niranjan Sinha";
		String S2 = new String ("SecurEyes");
		String[] FullName = {"Kumar","Akhil","Niranjan","Sinha"};
		char C1 = 'N';
		int[] a1 = {4,5,2,9,0,15,1,24};
		int[] a2 = new int[5];
		a1[0] = 11 ; a2[1] = 99;
		char[] a3 = {'N','I','R','A','N','J','A','N'};
		System.out.println("To get the length of the string S1 :"+S1.length());	
		System.out.println("To combine two strings S1 & S2 :"+S1.concat(S2));
		System.out.println("To get character at 0th Position for String S1 :"+S1.charAt(0)); //N
		System.out.println("To get character at 5th Position for String S1 :"+S1.charAt(5)); //N
		System.out.println("To get index of Char J within String S1 :"+S1.indexOf('J'));
		//System.out.println("\n"+ "Reverse String using StringBuilder : "+S3.);
		char Ch;
		String ReverseString = "";
		for (int i=0;i<S2.length();i++)
		{
			Ch = S2.charAt(i);
			ReverseString = Ch + ReverseString;
		}
		System.out.println("Reverse String : "+ReverseString);
		// Reverse String using String buffer class built in function
		StringBuilder S3 = new StringBuilder("Sinha");
		System.out.println("\n"+ "Original String : "+S3);
		S3.reverse();
		System.out.println("\n"+ "Reverse String using String buffer builtin Functions : "+S3);
		// Print my full name
		for (String i:FullName)
			System.out.println(i);
		for (int j=0;j<FullName.length;j++)
			System.out.println(FullName[j]);
		// To check string equality using equal functions
		System.out.println("To check if two Strings S1 & S2 are equal or not - " + S1.equals(S2));
		
	}

}
