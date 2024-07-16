
import java.util.Arrays;


public class MagicSquareFactory {

    public static MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        if(size <= 0 || size % 2 == 0) {
            return square;
        }
        
        int[][] magicSquare = new int[size][size];

        int row = 0;
        int col = size / 2;

        for (int num = 1; num <= size * size; num++) {
            magicSquare[row][col] = num;

            int prevRow = row;
            int prevCol = col;
            row--;
            col++;
            if (row < 0) {
                row = size - 1;
            }
            if (col == size) {
                col = 0;
            }

            if (magicSquare[row][col] != 0) {
                row = prevRow + 1;
                col = prevCol;
            }



        }
        
         square.setSquare(magicSquare);
        return square;
    }
    
    

}
