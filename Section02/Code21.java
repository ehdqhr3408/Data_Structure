package Section02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Code21 {
    static int n;
    static int[][] grid;

    public static void main(String[] args) {
        try {
            Scanner inFile = new Scanner(new File("data.txt")_);
            n = inFile.nextInt();
            grid = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    grid[i][j] = inFile.nextInt();
            inFile.close();
            for(int x=0;x<n;x++){
                for(int y=0;y<n;y++){
                    for(int dir=0;dir<8;dir++){
                        for(int len=1;len<=n;len++){
                            int val = computeValue(x,y,dir,len);
                            if(val != -1 && isPrime(val))
                                System.out.println(val);
                        }
                    }
                }
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
    static int [] offsetX = {0,1,1,0,-1,-1,-1};
    static int [] offsetY = {-1,-1,0,1,1,1,0,-1};

    public static int getDigit(int x,int y, int dir, int k) {
        int newX = x + k * offsetX[dir];
        int newY = y + k * offsetY[dir];
        if (newX < 0 || newX >= grid.length || newY < 0 || newY >= grid.length)
            return -1;
        else
            return grid[newX][newY];
    }
    public static int computeValue(int x, int y, int dir, int len){
        // at page 50
    }
    public boolean ifPrime(int k){

    }
    public static int getDigit(int x,int y, int dir, int k){
        int newX=x, newY=y;
        switch(dir){
            case 0: newY -= k; break;
            case 1: newX -= k; newY -= k; break;
            case 2: newX -= k; break;
            case 3: newX -= k; newY -= k; break;
            case 4: newY -= k; break;
            case 5: newX -= k; newY -= k; break;
            case 6: newX -= k; break;
            case 7: newX -= k; newY -= k; break;
        }
        if(newX<0||newX >=n||newY<0||newY>=n)
            return -1;
        return grid[newX][newY];
    }
}
