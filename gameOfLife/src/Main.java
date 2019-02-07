import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {		
		int width = 10;
		int height = 10;
		
		//Grid below outputs correct new grid
		int[][] grid = 
			  { {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
	            {0, 0, 0, 1, 1, 0, 0, 0, 0, 0}, 
	            {0, 0, 0, 0, 1, 0, 0, 0, 0, 0}, 
	            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
	            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
	            {0, 0, 0, 1, 1, 0, 0, 0, 0, 0}, 
	            {0, 0, 1, 1, 0, 0, 0, 0, 0, 0}, 
	            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0}, 
	            {0, 0, 0, 0, 1, 0, 0, 0, 0, 0}, 
	            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
	        };
		
		//Grid below outputs incorrect new grid
//		int[][] grid = 
//			  { {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
//	            {0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
//	            {0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
//	            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
//	            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
//	            {0, 0, 1, 1, 1, 0, 0, 0, 0, 0},
//	            {0, 0, 1, 1, 0, 0, 0, 0, 0, 0},
//	            {0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
//	            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
//	            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
//	        };
		
		//Correct output
//		int[][] grid = 
//		  	  { {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
//          	{0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
//          	{0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
//          	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
//          	{0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
//          	{0, 0, 1, 0, 1, 0, 0, 0, 0, 0},
//          	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
//          	{0, 0, 1, 1, 1, 0, 0, 0, 0, 0},
//          	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
//          	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
//      	};
		
//		System.out.println("Initial Generation: ");
//		int size = grid.length;
//        for(int i = 0; i < size; i++){
//            GameConfig.printGrid(size, i, grid);
//        }
//        
//		System.out.println("Next Generation: ");
//        int[][] newGrid = GameConfig.iterate(grid);
//        int newSize = newGrid.length;
//        for(int i = 0; i < newSize; i++){
//            GameConfig.printGrid(newSize, i, newGrid);
//        }
			
        String ask = "Y";
        
        Scanner scanner = new Scanner(System.in); 
        
        while(ask.equals("Y")) {
        	System.out.println(ask);
        	grid = GameConfig.iterate(grid);
            int newSize = grid.length;
            for(int i = 0; i < newSize; i++){
                GameConfig.printGrid(newSize, i, grid);
            }
            
            System.out.println("Would you like to iterate? Y = Yes or N = No");
            ask = scanner.nextLine();

        	
        }
		
		
	}
}
