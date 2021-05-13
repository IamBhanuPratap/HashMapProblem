package shopxTest;

import java.util.Scanner;

public class missingCharacter {

	public static void main(String[] args) {
		int stringLength = 13;
		String text = "Interplanetar";
		char[] stringCharArray = text.toCharArray();
		char[] stringCharArray1 = text.toCharArray();
		char[] base64array = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
		int count=stringCharArray.length-1;
		int sum=0;
		while(count>=0) {
			char arrayChar = stringCharArray[count];
			int index1=0,index2=1,index3=0;
			for(int j=0;j<base64array.length;j++) {
				if(base64array[j]==arrayChar) {
					index1=j;
				}
			}
			index1 = index1*2;
			if(index1>63) {
				index3=(index1-63)-index2;
				stringCharArray1[count]=base64array[index2+index3];
			}
			else if(index1<=63) {
				stringCharArray1[count]=base64array[index1];
			}
			System.out.println(stringCharArray1);
			count=count-2;
		}
		int loop=0;
		for(int k=0;k<stringCharArray1.length;k++) {
		for(int l=0;l<base64array.length;l++) {
			if(stringCharArray1[k]==base64array[l]) {
				loop=l;
				break;
			}
		}
		System.out.println(stringCharArray1[k]+" "+loop);
		sum=sum+loop;
		}
		System.out.println(sum);
		sum=sum/10;
		System.out.println(sum);
		System.out.println(base64array[sum]);
		Scanner scanner = new Scanner(System.in);

	}

}
