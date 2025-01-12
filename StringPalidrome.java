package Testing1;

public class StringPalidrome {

	public static void main(String[] args) {
		String S1 = "Gadag"; //This is a Palidrome String
		String S2 = "Bijapur";
		String Name = String.join(" ", "Niranjan", "Sinha");
		System.out.println(Name);
		S1 = S1.toLowerCase();
		boolean flag = true;
		int length = S1.length();
		int[] Array1;
		Character[] Ch1 = new Character[5];
		//Character Ch;
		//System.out.print("To print each characters of String S1 : ");
		for (int i=0;i<length/2;i++)
		{
			//System.out.print(S1.charAt(i)+ "");
			//Ch1[i] = S1.charAt(length-1-i);
			if (S1.charAt(i)!=S1.charAt(length-i-1))
			{
				flag=false;
			    break;
			}
		}
//		for (int j=0;j<length;j++)
//		{
//		   System.out.print(Ch1[j]+" ");
//		   S2 = String.valueOf(Ch1[j]);
//		   System.out.println(S2);
//		}
//		System.out.println(S1);
//		System.out.println(S2);
		if (flag)
			System.out.println("String is palidrome and the String is : " + S1.toUpperCase());
		else
			System.out.println("String is not palidrome and string is : "+S1.toLowerCase());

	}

}
