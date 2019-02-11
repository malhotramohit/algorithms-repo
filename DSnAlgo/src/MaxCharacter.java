import java.util.Scanner;

public class MaxCharacter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String sentences=sc.nextLine();
		String[] sentencesArray=sentences.split("\\.");
		//int len=sentencesArray.lengt
		int index = 0;
		int max=0;
		for (int i = 0; i < sentencesArray.length; i++) {
			String sentence=sentencesArray[i];
			String[] arrayOfwordsInaSentence=sentence.split(" ");
			int len=arrayOfwordsInaSentence.length;
			int totalchar=0;
			for(int j=0;j<len;j++)
			{
				totalchar=totalchar+arrayOfwordsInaSentence[j].length();
			}
			if(max<totalchar)
			{
				max=totalchar;
				index=i;
			}
		}
		System.out.println(sentencesArray[index]);
		
	}
}
