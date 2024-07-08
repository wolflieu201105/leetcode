class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int[][] myGrid = new int[grid.length][grid[0].length];
        switch(grid[0][0]){
            case '.':
                myGrid[0][0] = 0;
                break;
            case 'X':
                myGrid[0][0] = 1;
                break;
            case 'Y':
                myGrid[0][0] = -1;
                break;
        }
        for (int i = 1; i < grid.length; i++) {
            switch(grid[i][0]){
                case '.':
                    myGrid[i][0] = myGrid[i-1][0];
                    break;
                case 'X':
                    myGrid[i][0] = myGrid[i-1][0] + 1;
                    break;
                case 'Y':
                    myGrid[i][0] = myGrid[i-1][0] - 1;
                    break;
            }
        }
        for (int i = 1; i < grid[0].length; i++) {
            switch(grid[0][i]){
                case '.':
                    myGrid[0][i] = myGrid[0][i-1];
                    break;
                case 'X':
                    myGrid[0][i] = myGrid[0][i-1] + 1;
                    break;
                case 'Y':
                    myGrid[0][i] = myGrid[0][i-1] - 1;
                    break;
            }
        }
        for (int i = 1; i < grid.length; i++) {
            for (int y = 1; y < grid[0].length; y++) {
                switch(grid[i][y]){
                    case '.':
                        myGrid[i][y] = myGrid[i][y-1] + myGrid[i-1][y] - myGrid[i-1][y-1];
                        break;
                    case 'X':
                        myGrid[i][y] = myGrid[i][y-1] + myGrid[i-1][y] - myGrid[i-1][y-1] + 1;
                        break;
                    case 'Y':
                        myGrid[i][y] = myGrid[i][y-1] + myGrid[i-1][y] - myGrid[i-1][y-1] - 1;
                        break;
                }
            }
        }
        int maxLength = grid[0].length;
        int minLength = maxLength;
        int returnValue = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int y = 0; y <maxLength; y++){
                if (grid[i][y] == 'X'){
                    minLength = y;
                    break;
                }
            }
            for (int y = minLength; y < maxLength; y++){
                for (int z = i; z < grid.length; z++) {
                    if(myGrid[z][y] == 0) {
                        returnValue++;
                    }
                }
            }
            maxLength = minLength;
        }
        return returnValue;
    }
}