package Battleship;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BattleshipRunnner {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File file = new File("Board1");
		Scanner scan = new Scanner(file);
		String[][] battleship = new String[10][10];
		String[] temp = new String[10];
		int i = 0;
		while(scan.hasNextLine()) {
			temp = scan.nextLine().split(",");
			for(int j = 0; j < 10; j++) {
				battleship[i][j] = temp[j];
				
			}
			i++;
		}
		
		Validatorinator board = new Validatorinator(battleship);
		System.out.println(board.shipChecker());
		System.out.println(board.balanced(battleship));
	}
}
