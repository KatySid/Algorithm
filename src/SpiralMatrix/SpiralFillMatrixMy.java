package SpiralMatrix;

import java.util.Random;

public class SpiralFillMatrixMy {

    public static void main(String[] args) {
        //int m =(int)(Math.random()*10);
        //int n = (int)(Math.random()*10);
        int m=6;
        int n=6;
        int[][] array = new int [m][n];
        int x=0, y=0;
        int emptyStartX=0;
        int emptyX = array.length-1;
        int emptyStartY = 0;
        int emptyY = array[0].length-1;
        int direction =1;
        int count = m*n;
        for (int i = 0; i < count; i++) {
            array[x][y]=i+1;
            switch (direction) {
                case 1: {
                    if ((y + 1) <= emptyY) {
                        y++;
                    } else {
                        emptyStartX++;
                        direction++;
                        x++;
                    }
                    break;
                }
                case 2: {
                    if((x+1)<=emptyX){
                        x++;
                    } else {
                        emptyY--;
                        y--;
                        direction++;
                    }
                    break;
                }
                case 3: {
                    if((y-1)>=emptyStartY){
                        y--;
                    } else {
                        direction++;
                        x--;
                        emptyX--;

                    }
                    break;
                }
                case 4 : {
                    if((x-1)>=emptyStartX){
                        x--;
                    }else {
                        direction=1;
                        y++;
                        emptyStartY++;
                    }
                    break;
                }
            }

        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%-4d",array[i][j]);
                }
            System.out.println();
        }

    }
}
