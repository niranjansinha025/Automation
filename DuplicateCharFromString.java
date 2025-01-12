package Testing1;

import java.util.Arrays;
// To find duplicate character in a string
// https://www.geeksforgeeks.org/print-all-the-duplicates-in-the-input-string/
public abstract class DuplicateCharFromString {

	public static void main(String[] args) {
		String str = "Hellow World";
		//System.out.println("String displayed as : "+str);
		char CharOfString[] = str.toCharArray();
		//System.out.println("String to be displayed as all characters  : ");
		Arrays.sort(CharOfString);
        String sortedStr = new String(CharOfString);
        System.out.println("Sorted String to be displayed  : "+sortedStr);
		//int count = 1;
//		for (int i=0;i<CharOfString.length;i++)
//		{
//			System.out.print(CharOfString[i]+" ");
//			int count = 1;
//			if (CharOfString[i]=='0')
//				continue;
//			int j=i+1;
//			for (j=i+1;j<CharOfString.length;j++)
//			{
//				if (CharOfString[i] == CharOfString[j])
//					count++;
//				CharOfString[j] = '0';
//			}
//			
//		}
//		if (count >1)
//			System.out.println("Duplicate character is found");
        
        for (int i = 0; i < CharOfString.length; i++) {
            int count = 1;

            // Counting the occurrences of each character
            while (i < CharOfString.length - 1
                   && sortedStr.charAt(i)
                          == sortedStr.charAt(i + 1)) {
                count++;
                i++;
            }

            // Printing the duplicate character and its
            // count
            if (count > 1) {
                System.out.println(sortedStr.charAt(i)
                                   + ", count = " + count);
            }
        

	}

	}
}
