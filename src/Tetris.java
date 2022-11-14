public class Tetris {
    public static void main(String[] args){
        int[][] field = new int[][]{{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {1, 1, 0, 1, 0}, {1, 0, 1, 0, 1}};
        int[][] figure = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 0, 1}};

        int height = field.length;
        int width = field[0].length;
        int lengthOfTheField = figure.length;
//        System.out.println(height); -> 5
//        System.out.println(width); -> 4/3


        // we are checkinh if the figure can fit in the box or not!!!!
        for(int column = 0; column < (width - lengthOfTheField + 1); column++){
            int row = 1;
            while(row < (height - lengthOfTheField + 1)){
                boolean canFit = true;
                for(int x = 0; x < lengthOfTheField; x++){
                    for(int y = 0; y < lengthOfTheField; y++){
                        if(field[row+x][column+y] == 1 && figure[x][y] == 1){
                            canFit = false;
                        }
                    }
                }
                if(!canFit){
                    break;
                }
                row += 1;
            }
            row -= 1;

            for(int x = 0; x < lengthOfTheField; x++){
                boolean rowFilled = true;
                for(int columnIndex = 0; columnIndex < width; columnIndex++){
                    if(!(field[row+x][columnIndex] == 1 || (((column <= columnIndex) && (columnIndex < column + lengthOfTheField)) &&
                            (figure[x][columnIndex - column] == 1)))){
                        rowFilled = false;
                    }
                }
                if(rowFilled){
                    System.out.println("Column: " + column);
                }
                else{
                    System.out.println(-1);
                }
            }
        }
    }
}
