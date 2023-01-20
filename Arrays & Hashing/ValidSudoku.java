class ValidSudoku {

       public static boolean isValidSubboxSudoku(char[][] board){

        // takes 3x3 char arrays as argument

        List<Character> chars = new ArrayList<>();

        for(int row=0;row<3;row++){
            for(int column=0;column<3;column++){
                if(board[row][column] == '.') {}
                else chars.add(board[row][column]);
            }
            System.out.println();
        }

        Set<Character> charSet = new HashSet<>(chars);
        if(chars.size() != charSet.size()) return false;
        return true;
    }

    public static boolean isValidSudoku(char[][] board) {

               // Checking rows for duplicates
        for(int row=0;row<board[0].length;row++){

            List<Character> chars = new ArrayList<>();

            for(char i:board[row]){

                if (i == '.'){}

                else chars.add(i);
            }

            Set<Character> charSet = new HashSet<>(chars);

            if(chars.size() != charSet.size()) return false;

        }

        // Checking columns for duplicate with a nested for loop 

        for(int column=0;column<9;column++){

            List<Character> chars = new ArrayList<>();

            for(int row=0;row<9;row++){

                if(board[row][column] == '.') {}
                else chars.add(board[row][column]);
            }

            Set<Character> charSet = new HashSet<>(chars);

            if(charSet.size() != chars.size()) return false;
        }
        
        // Checking 9 subboxes for duplicate with a nested for loop 

        for(int column=0;column<9;column += 3){
            for(int row=0;row<9;row += 3){

                char[][] subbox = new char[3][3];

                subbox[0] =  Arrays.copyOfRange(board[row],column,column+3);
                subbox[1] =  Arrays.copyOfRange(board[row+1],column,column+3);
                subbox[2] =  Arrays.copyOfRange(board[row+2],column,column+3);

                if (isValidSubboxSudoku(subbox) == false) return false;
            }
        }
        return true;

    }
}
