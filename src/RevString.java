import java.util.Scanner;

public class RevString {

	public void swapAWord(char[] arr,int i,int j){
		while(i<j){
			char temp = arr[i];
			arr[i++] = arr[j];
			arr[j--] = temp;
		}
	}

	public void revString(char[] arr){
		int i=0;
		for(int j=0;j<arr.length;j++)
			if(j==arr.length-1 || arr[j+1]==' '){
				swapAWord(arr, i, j);
				i=j+2;
			}
		swapAWord(arr, 0, arr.length-1);
	}

	public void printStr(char[] arr){
		for(char c : arr){
			System.out.print(c);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		RevString revString = new RevString();
		char[] arr = line.toCharArray();
		revString.revString(arr);
		revString.printStr(arr);

	}

}
