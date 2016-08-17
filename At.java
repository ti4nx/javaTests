public class At{
	public static void main(String[] args){
		
		int[] x = {1,2,3,4,5,6,7,8,9};
		String z[] = {"h","e","l","l","o"};
		char y[] = {'a','b','c','d','e','f'};
		String h = "hello world";
		System.out.println(countArray(x));
		reverseString(h);
		changeLetter("hello", 'e', 'a');
		// System.out.println(z.length);
	}
	private static int countArray(String x[]){
		int count = 0;
		try{
			while(x[count] != ""){count++;}
		}
		catch(Exception e){}
		return count;
	}
	private static int countArray(int x[]){
		int count = 0;
		try{
			while(x[count] != 0){count++;}
		}
		catch(Exception e){}
		return count;
	}
	private static int countArray(char x[]){
		int count = 0;
		try{
			while(x[count] != ' '){count++;}
		}
		catch(Exception e){}
		return count;
	}
	private static void reverseString(String word){
		String reverseStr="";
		
		try{
			char[] chrArray = word.toCharArray();
			int y = countArray(chrArray);
			for(int x=y-1;x>=0;x--){
				reverseStr = reverseStr + chrArray[x];
			}
			System.out.println(reverseStr);
		}
		catch(Exception e){}
	}
	
	private static void changeLetter(String word, char a, char b){
		String r = "";
		try{
			char[] chrArray = word.toCharArray(); //convert word to array
			int y = countArray(chrArray);  // count the length of the array 
			for(int x=0;x<=y;x++){ 		
				if(chrArray[x] == a){	// if the char in array is equal to the given char, then change the char to the new char
					chrArray[x] = b;
					r = r + chrArray[x];
				}
				else{
					r = r + chrArray[x];
				}
			}
		}
		catch(Exception e){}
		System.out.println("Given word is " + word + ", " + a + " has been replaced with " + b);
		System.out.println("New word is " + r);
	}
}