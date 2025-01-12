package Testing1;

public class StringExample {

	public static void main(String[] args) {
		//int[] intArrayA1 = new int[20];
				String str = new String("Kumar Akhil Niranjan Sinha");
				System.out.println(str);
			    int len = str.length();
			    System.out.println(len);
				//int position = str.indexOf('S');
				System.out.println("Index of Character S : "+str.indexOf('S'));
				//1st method of printing  7th, 14th, 21st position characters
//				char Char_7th_position = str.charAt(7);
//				char Char_14th_position = str.charAt(14);
//				char Char_21st_position = str.charAt(21);
//				System.out.println(Char_7th_position);
//				System.out.println(Char_14th_position);
//				System.out.println(Char_21st_position);
//				//2nd method of printing  7th, 14th, 21st position characters
				System.out.println("Char at 0th Position = " + str.charAt(0));
				System.out.println("Char at 14th Position = " + str.charAt(14));
				System.out.println("Char at 21st Position = " + str.charAt(21));
				System.out.println("Char at 21st Position = " + str.charAt(25));
				System.out.println("\n"+ "Trim a string : "+str.toUpperCase());
//				for (int i=0;i<len;i=i+7)
//				{
//					System.out.println("Char at nth Position = " + str.charAt(i));
//				}
				
				// To Reverse a String using for loop method as below - 
				char Ch;
				String ReverseString = "";
				for (int j=0;j<str.length();j++)
				{
					Ch = str.charAt(j);
					ReverseString = Ch + ReverseString;
				}
				System.out.println("\n"+ "Original String : "+str);
				System.out.println("\n"+ "Reverse String : "+ReverseString);
				// To Reverse a String using String buffer - 
				StringBuilder str1 = new StringBuilder("Kumar Akhil Niranjan Sinha");
				System.out.println("\n"+ "Original String : "+str1);
				str1.reverse();
				System.out.println("\n"+ "Reverse String using StringBuilder : "+str1.toString());
				//System.out.println(str1.toString());
			}

		}
