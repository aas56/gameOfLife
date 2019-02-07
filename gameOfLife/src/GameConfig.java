import java.util.*;

public class GameConfig {
	
	//Declare variables for Grid
//	static int width;
//	static int height;
//	int size;
//	int widthCheck;
//	int heightCheck;
//	int seed;
//	boolean running = true;
	
	public GameConfig() {
		
		//--------------------------------------------------Grid----------------------------------------------------------//
		//Assign values to variable width and height
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter width: ");
//		widthCheck = scanner.nextInt();
//		System.out.print("Enter height: ");
//		heightCheck = scanner.nextInt();
//		
//		while (running) {
//			if (widthCheck >= 3 && heightCheck >= 3) {
//				width = widthCheck;
//				height = heightCheck;
//				size = width*height;
//				System.out.print("The Game of Life grid will be " + width + "x" + height + " and a size of " + size);
//				running = false;
//			} else if (widthCheck < 3 || heightCheck < 3){
//				System.out.println(widthCheck + "x" + heightCheck + " is smaller than 3x3" + "\n"
//			    + "Please try again");
//				System.out.print("Enter width: ");
//				widthCheck = scanner.nextInt();
//				System.out.print("Enter height: ");
//				heightCheck = scanner.nextInt();
//				running = true;
//			}
//		}
	}
	
	//Initial grid view
	//Prints grid in the form of 0's and 1's
	//0 for dead cell and 1 for alive cell
	public static void grid(int w, int h, int[][] grid) {
		System.out.println("Current Generation: "); 
	    for (int i = 0; i < w; i++) { 
	        for (int j = 0; j < h; j++) { 
	            if (grid[i][j] == 0) 
	                System.out.print("0"); 
	            else
	                System.out.print("1"); 
	        	} 
	        System.out.println(); 
	    	} 
		}
	
	//User friendly grid view
	//Prints grid in the form of 0's and 1's
	//With padding and readable format
	public static void printGrid(int size, int row, int[][] grid) {
		
		for (int i = 0; i < 10 * (size - 4); i++) {
			System.out.print("-");
		}
		System.out.println("-");
		
		for (int i = 1; i <= grid[row].length; i++) {
			System.out.printf("| %3d ", grid[row][i - 1]);
		}
		System.out.println("|");
		
		//Final set of row so place line
		if (row == size - 1) {
			for (int i = 0; i < 10 * (size - 4); i++) {
				System.out.print("-");
			}
			System.out.println("-");
		}
	}
		
	//-------------------------------------------------Iterate--------------------------------------------------------//
	public static int[][] iterate(int[][] grid) {
		
		int row = grid.length;
		int column = grid[0].length;
		int aliveNeighbours;
		
		int[][] newGrid = new int[row][column];
		
		//Iterate through every row and column
		//Row
		for (int i = 0; i < row; i++) {
			//Column
			for (int j = 0; j < column; j++) {
				//Reset neighbour
				aliveNeighbours = 0;
				//Iterate through each individual position of every row and column
				//Check left and right of position x, (-1, 0, 1)
				for (int x = -1; x <= 1; x++) {
					//Check above and below of position y, (-1, 0, 1)
					for (int y = -1; y <= 1; y++) {
						try {
							aliveNeighbours = aliveNeighbours + grid[i + x][j + y];
						} catch (Exception e) {
//							System.out.println(e);
						}
						//Initial location of scenarios
					}
				}
				//Subtract cell as it was already counted
				aliveNeighbours = aliveNeighbours - grid[i][j];
//				System.out.print(aliveNeighbours);
				
				//Underpopulation
				if ((grid[i][j] == 1) && (aliveNeighbours < 2)) {
					newGrid[i][j] = 0;
				}
				//Overcrowding
				else if ((grid[i][j] == 1) && (aliveNeighbours > 3)) {
					newGrid[i][j] = 0;
				}
				//Survival
				else if ((grid[i][j] == 1) && ((aliveNeighbours == 2)||(aliveNeighbours == 3))) {
					newGrid[i][j] = 1;
				}
				//Creation of life
				else if ((grid[i][j] == 0) && (aliveNeighbours == 3)) {
					newGrid[i][j] = 1;
				}
				//Grid with no live cells
				else if ((grid[i][j] == 0) && (aliveNeighbours == 0)) {
					newGrid[i][j] = 0;
				}
				//Remain the same
				else {
					newGrid[i][j] = grid[i][j];
				}
//				System.out.print(aliveNeighbours);
			}
		}
		
		return newGrid;
	}
}
