public class TetrisII {

    public static int objectAtTheBottom(char[][] field){
        int answer = 0;
        int width = field[0].length;
        int height = field.length;

        int[] int_array = new int[width];

        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                if(field[i][j] == '*'){
                    int_array[j] = Math.max(int_array[j]+1, i);
                }
            }
        }

        int max = Integer.MIN_VALUE;
        // int_array gives us the number of objects in a given column.
        System.out.print("[ ");
        for(int i = 0; i < int_array.length; i++){
            if(int_array[i] > max){
                max = int_array[i];
            }
            System.out.print(int_array[i] + " ");
        }
        System.out.println("]");

        for(int column = 0; column < width; column++){
            System.out.println("int_array = " + int_array[column]);
            if(int_array[column] == -1){
                continue;
            }

            int moves = height - max;

            while(moves > 0){
                if(field[int_array[column]][column] == '#'){
                    answer++;
                }

                int_array[column]++;
                moves--;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        char[][] field = new char[][] {{'*', '*', '*', '*'}, {'#', '*', '.', '*'}, {'.', '.', '#', '.'}, {'.', '#', '.', '#'}};
        int result = objectAtTheBottom(field);
        System.out.println(result);
    }
}
