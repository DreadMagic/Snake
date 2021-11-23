package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static final int WIDTH = 10;
    public static final int HEIGHT = 10;

    public static void drawSnake(int x, int y){
        for(int i=0;i < WIDTH; i++){
            for(int j = 0; j < HEIGHT; j++){
                if (i==y && j==x){
                    System.out.print("Ω ");
                }
                else{
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int sx = 4;
        int sy = 5;
        int [][] pos = new int[0][0];
        drawSnake(sx,sy);
        boolean loop = true;
        int clock = 0;
        while (loop){
            Scanner direction = new Scanner(System.in);
            String wasd = direction.nextLine();
            wasd = wasd.toLowerCase(Locale.ROOT);
            if (clock >= 15){

            }
            if (wasd.equals("a")){
                sx +=-1;
                System.out.println();
                drawSnake(sx,sy);
                if (sx==-1) loop = false;
            }
            else if (wasd.equals("s")){
                sy +=1;
                System.out.println();
                drawSnake(sx,sy);
                if (sy==HEIGHT) loop = false;
            }
            else if (wasd.equals("d")){
                sx +=1;
                System.out.println();
                drawSnake(sx,sy);
                if (sx==WIDTH) loop = false;
            }
            else if (wasd.equals("w")){
                sy -=1;
                System.out.println();
                drawSnake(sx,sy);
                if (sy==-1) loop = false;
            }
            clock++;
        }
    }
}
