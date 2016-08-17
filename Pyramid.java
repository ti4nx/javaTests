import java.util.*;
public class Pyramid{
	public static void main(String[] args){
		Letters letterg = new GeneratedLetters();
		letterg.generateLetter();
	}
}
class generateLetter{
	protected void displayX(int dim){
		for(int i=0;i<dim;i++){
			for(int j=0;j<dim;j++){
				if(i==j || i+j==dim-1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
	protected void displayY(int dim){
		for(int i=0;i<dim;i++){
			for(int j=0;j<dim;j++){
				if(i==j && j<=dim/2 || i+j==dim-1 && j>=dim/2 || j==dim/2 && i>j){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
	protected void displayZ(int dim){
		for(int i=0;i<dim;i++){
			for(int j=0;j<dim;j++){
				if(i==0 || i==dim-1 || i+j==dim-1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
class Letters extends generateLetter{
	public void generateLetter(){
			Scanner s = new Scanner(System.in);
			System.out.print("Enter a letter X, Y, or Z: ");
			String letter = s.nextLine();
			String theLetter = "";
				
			System.out.print("Enter odd number: ");
			int dim = s.nextInt();
			
				try{
					char[] a = letter.toCharArray();
					for(int x=0;x<a.length;x++){
						switch(a[x]){
							case 'X': case 'x': displayX(dim); break;
							case 'Y': case 'y': displayY(dim); break;
							case 'Z': case 'z': displayZ(dim); break;
							default: break;
						}
					}
				}catch(Exception e){}
				
			
	}
	
	
}
