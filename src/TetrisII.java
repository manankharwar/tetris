public class TetrisII {

    public static int objectAtTheBottom(char[][] field){
        int answer = 0;

        return answer;
    }

    public static void main(String[] args){
        char[][] field = new char[][] {{'*', '*', '*', '*'}, {'#', '*', '.', '*'}, {'.', '.', '#', '.'}, {'.', '#', '.', '#'}};

        int result = objectAtTheBottom(field);
        System.out.println(result);
    }
}
