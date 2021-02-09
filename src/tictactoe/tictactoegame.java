package tictactoe;
import java.util.*;
public class tictactoegame {
	static String player1="";
	static String player2="";
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
		System.out.println("Welcome to play TIC-TAC-TOE world");
		System.out.println("Enter x or o for player1");
		player1=s.nextLine();
		if(player1.equals("x")){
			player2="o";
			System.out.println("player2= "+player2);
		}
		else {
			player2="x";
			System.out.println("player2= "+player2);
		}
		
	print();

	}
	static String arr[] =new String[9];
	public static void print() {
		
		Scanner s=new Scanner(System.in);
		for(int i=0;i<9;i++) {
			arr[i]=" ";
		}
		int c=0;
		 System.out.println("Player1:enter a number ");
		for(int i=0;i<9;i++) {
			if(c==9) {
				 System.out.println("Game Over!");
				 return ;
			}
			if(!win()) {
			  if(i%2==0) {
				  int x=s.nextInt();
				     if(check(x)) {
				 
				 
			arr[x]=player1;
		System.out.println( arr[0]+"|"+arr[1]+"|"+arr[2]);
		System.out.println("-----");
		System.out.println( arr[3]+"|"+arr[4]+"|"+arr[5]);
		System.out.println("-----");
		System.out.println( arr[6]+"|"+arr[7]+"|"+arr[8]);
		System.out.println("");
		System.out.println("");
		             if(!win()) {
		            	 if(c==8) {
		 					System.out.println("Game Over!");
		 					return ;
		 				}
		            	 System.out.println("Player2 turn:");
				     }
				     else {
				    	 System.out.println("Player1 win! Congrats..");
							System.out.println("Game Over!");
							return;
						      }
			              }
			  }
			else {
				int x=s.nextInt();
				if(check(x)){
			arr[x]=player2;
			System.out.println( arr[0]+"|"+arr[1]+"|"+arr[2]);
			System.out.println("-----");
			System.out.println( arr[3]+"|"+arr[4]+"|"+arr[5]);
			System.out.println("-----");
			System.out.println( arr[6]+"|"+arr[7]+"|"+arr[8]);
			System.out.println("");
			System.out.println("");
			if(!win()){
				if(c==8) {
					System.out.println("Game Over!");
					return ;
				}
				 System.out.println("Player1 turn:")  ;
		     }
		     else {
		    	 System.out.println("Player2 win! Congrats..");
					System.out.println("Game Over!");
					return;
				      }                   
				}
				       else {
					System.out.println("Space already filled!Try another one!");
					i--;c--;
				            }
				     }
			}
				else {
					System.out.println("Game Over!");
					return;
				      }
			c++;
			      }
		}
		
	public static boolean check(int x) {
		if(arr[x].equals("\\s")) {
			return false;
		}
		else {
			return true;
			
		}
	}
	public static boolean win() {
		if((arr[0].equals("x")&&arr[1].equals("x")&&arr[2].equals("x"))||(arr[0].equals("o")&&arr[1].equals("o")&&arr[2].equals("o"))) {
			return true;
		}
		if((arr[3].equals("x")&&arr[4].equals("x")&&arr[5].equals("x"))||(arr[3].equals("o")&&arr[4].equals("o")&&arr[5].equals("o"))) {
			return true;
		}
	    if((arr[6].equals("x")&&arr[7].equals("x")&&arr[8].equals("x"))||(arr[6].equals("o")&&arr[7].equals("o")&&arr[8].equals("o"))) {
			return true;
		}
		if((arr[0].equals("x")&&arr[4].equals("x")&&arr[8].equals("x"))||(arr[0].equals("o")&&arr[4].equals("o")&&arr[8].equals("o"))) {
			return true;
		}
		if((arr[2].equals("x")&&arr[4].equals("x")&&arr[6].equals("x"))||(arr[2].equals("o")&&arr[4].equals("o")&&arr[6].equals("o"))) {
			return true;
		}
		if((arr[0].equals("x")&&arr[3].equals("x")&&arr[6].equals("x"))||(arr[0].equals("o")&&arr[3].equals("o")&&arr[6].equals("o"))) {
			return true;
		}
		if((arr[1].equals("x")&&arr[4].equals("x")&&arr[7].equals("x"))||(arr[1].equals("o")&&arr[4].equals("o")&&arr[7].equals("o"))) {
			return true;
		}
		if((arr[2].equals("x")&&arr[5].equals("x")&&arr[8].equals("x"))||(arr[2].equals("o")&&arr[5].equals("o")&&arr[8].equals("o"))) {
			return true;
		}
		return false;
	}

}
