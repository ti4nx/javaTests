import java.*;	
public class RandomChar{
	public static void main(String[] args){
		RandomChar ran = new RandomChar();
		String letter = ran.RandomLetters();
		String[] letters = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","_"};
		System.out.println("Your new tile is "+letter+"\n");
		System.out.println("Available Letters:");
		for(int i =0; i<letters.length;i++){
			String ListofLetters = ran.countLetters(letters[i]);
			if(letter.equals(letters[i])){
				System.out.println(letters[i]+" = "+(Integer.parseInt(ListofLetters)-1));
			}
			else{
				System.out.println(letters[i]+" = "+ListofLetters);
			}
		}
		
	}
	
	public String RandomLetters(){ // Random Letter
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_";
		int x = (int)(Math.random()*27);
		return ""+alphabet.charAt(x);
	}
	
	public String countLetters(String b){
		switch(b){
			case "B": case "C": case "M": case "P": case "F": case "H": case "V": case "W": case "Y":
					return ""+2;
				
			case "E": 
					return ""+12;
				
			case "K": case "J": case "X": case "Q": case "Z":
					return ""+1;
				
			case "D": case "L": case "S": case "U": 
					return ""+4;
				
			case "N": case "R": case "T":
					return ""+6;
				
			case "O":
					return ""+8;
			
			case "A": case "I":
					return ""+9;
				
			case "G":
					return ""+3;
			case "_":
					return ""+2;
			default:	return "";
			
			
		}
	}
	
}