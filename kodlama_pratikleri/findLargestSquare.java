public class findLargestSquare {
   
    public static void findLargestSquare(int[][] matrix) {
        
        int row=1;
        int maxRow = 0;

        int[][] rowCoordinates = new int[matrix.length][];
        
        int maxRow_j=0;

        for(int i=0;i<matrix.length;i++){

            for(int j=0;j<matrix[i].length;j++){

                if(matrix[i][j] == 1){
                    
                    if(j == matrix[i].length-1){
                        break;
                    }

                    // row check! 
                    while(matrix[i][j+1] == 1){

                        j++;
                        row++;
                        if(row>maxRow){
                            maxRow=row;
                            maxRow_j = j-maxRow+1;}
                        
                        if(j == matrix[i].length-1){
                            break;
                        }
                    }
                }

            }

            rowCoordinates[i] = new int[]{maxRow_j,maxRow};

            maxRow = 0;
            row=1;

        }


        int maxDimension = 0;
        boolean flag = true;


        for(int i=0;i<matrix.length;i++){


            if(rowCoordinates[i][1] == 0){break;}

            int index = rowCoordinates[i][0];
            int count = rowCoordinates[i][1];

            if(count + i > matrix.length-1){
                count = matrix.length-i;
            }

            for(int j=index,step=0;step<count;step++,j++){

                for(int k=0;k<count;k++){

                    if (matrix[i+k][j] != 1){
                        flag=false;
                    }

                }      
            } 
            
            if (flag == true){
                if (count>maxDimension) {maxDimension=count;}
            }
            else{
                flag=true;
            }
            }


        for(int i=0;i<maxDimension;i++){
            for(int j=0;j<maxDimension;j++){
                System.out.print("1 ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {0, 1 ,1, 0, 1},
            {1, 1, 0, 1, 0},
            {0, 1, 1, 1, 0},
            {1, 1, 1, 1, 0},
            {1, 1, 1, 1, 1},
            {0, 0, 0, 0, 0}
        };



        findLargestSquare(matrix);

        
    }
}
