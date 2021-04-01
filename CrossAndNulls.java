package ARRAYS_GAME_CROSS_AND_NULLS;

import java.util.Scanner;

class Game_CrossAndNull {
    public static int x = 1;
    public static int z = 1;
    public static int[][] field = new int[4][4];

    ////////METHOD_ONE_///////////////////////////////
    public static void init() {
        for (x = 1; x < field.length; x++) {
            System.out.println("|---+---+---|");
            for (z = 1; z < field.length; z++) {
                //  choose_cell();
                field[1][1] = 1;
                field[1][2] = 2;
                field[1][3] = 3;
                field[2][1] = 4;
                field[2][2] = 5;
                field[2][3] = 6;
                field[3][1] = 7;
                field[3][2] = 8;
                field[3][3] = 9;
                System.out.print("| " + field[x][z] + "\t");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("|---+---+---|");
    }
}

public class CrossAndNulls {
    public static void main(String[] args) {
        //  Game_CrossAndNull.init();
        //  Game_CrossAndNull.choose_cell();
        String[][] field = new String[4][4];
        int move = 0;
        int moveX = 0;
        int move0 = 0;
        boolean valid;
        String gambler;
        String gamblerNull = "0";
        String gamblerX = "x";
        Game_CrossAndNull.init();
        ///////////////////////////////////////////////
        field[1][1] = "1";
        field[1][2] = "4";
        field[1][3] = "7";
        field[2][1] = "2";
        field[2][2] = "5";
        field[2][3] = "8";
        field[3][1] = "3";
        field[3][2] = "6";
        field[3][3] = "9";
        do {
            move++;
            for (int x = 1; x < 2; x++) {
                System.out.print("Enter Player X or 0: ");
                Scanner enter_player = new Scanner(System.in);
                gambler = enter_player.next();
                //    do{
                if (gambler.equals(gamblerX) ) {
                    moveX = move;
                    valid = true;
                    System.out.println("Player - X");
                    System.out.println("Player-X move: " + moveX + " " + valid);
                    /////////////////////////////////////////////////////////////
                    //  for (int x = 1; x < 2; x++) {
                    System.out.print("Player X enter pleas number field: ");
                    Scanner enter_number_field = new Scanner(System.in);
                    int number_field_one = enter_number_field.nextInt();
                    System.out.println("|---+---+---|");
                        if (number_field_one == 1 && field[1][1] != gamblerNull) {
                            field[1][1] = gamblerX;
                            valid = true;
                        } else if (number_field_one == 2 && field[2][1] != gamblerNull) {
                            field[2][1] = gamblerX;
                        } else if (number_field_one == 3 && field[3][1] != gamblerNull) {
                            field[3][1] = gamblerX;
                        } else if (number_field_one == 4 && field[1][2] != gamblerNull) {
                            field[1][2] = gamblerX;
                        } else if (number_field_one == 5 && field[2][2] != gamblerNull) {
                            field[2][2] = gamblerX;
                        } else if (number_field_one == 6 && field[3][2] != gamblerNull) {
                            field[3][2] = gamblerX;
                        } else if (number_field_one == 7 && field[1][3] != gamblerNull) {
                            field[1][3] = gamblerX;
                        } else if (number_field_one == 8 && field[2][3] != gamblerNull) {
                            field[2][3] = gamblerX;
                        } else if (number_field_one == 9 && field[3][3] != gamblerNull) {
                            field[3][3] = gamblerX;
                        }
                } else if (gambler.equals(gamblerNull) ) {
                    move0 = move;
                    valid = true;
                    System.out.println("Player - 0");
                    System.out.println("Player-0 move: " + move0 + " " + valid);
                    /////////////////////////////////////////////////////////////
                    //for (int x = 1; x < 2; x++) {
                    System.out.print("Player 0 enter pleas number field: ");

                    Scanner enter_number_field = new Scanner(System.in);
                    int number_field_one = enter_number_field.nextInt();
                    System.out.println("|---+---+---|");
                        if (number_field_one == 1 && field[1][1] != gamblerX) {
                            field[1][1] = gamblerNull;
                            valid = true;
                        } else if (number_field_one == 2 && field[2][1] != gamblerX) {
                            field[2][1] = gamblerNull;
                        } else if (number_field_one == 3 && field[3][1] != gamblerX) {
                            field[3][1] = gamblerNull;
                        } else if (number_field_one == 4 && field[1][2] != gamblerX) {
                            field[1][2] = gamblerNull;
                        } else if (number_field_one == 5 && field[2][2] != gamblerX) {
                            field[2][2] = gamblerNull;
                        } else if (number_field_one == 6 && field[3][2] != gamblerX) {
                            field[3][2] = gamblerNull;
                        } else if (number_field_one == 7 && field[1][3] != gamblerX) {
                            field[1][3] = gamblerNull;
                        } else if (number_field_one == 8 && field[2][3] != gamblerX) {
                            field[2][3] = gamblerNull;
                        } else if (number_field_one == 9 && field[3][3] != gamblerX) {
                            field[3][3] = gamblerNull;
                        }
                } else {
                    System.out.println("Such Player is not, try again");
                }
                //  }while (!valid);
                for (int z = 1; z < field[x].length; z++) {
                    // System.out.print("| " + field[z][x] + "\t");
                }
            }
            for (int x = 1; x < field.length; x++) {
                for (int z = 1; z < field[x].length; z++) {
                    System.out.print("| " + field[z][x] + "\t");
                }
                System.out.print("|");
                System.out.println();
                System.out.println("|---+---+---|");
            }
        } while (move <= field.length);
        if (moveX > move0) {
            System.out.println("Player-X CONGRATULATION!!! You WINNER Player-X!!!");
        } else {
            System.out.println("Player-0 CONGRATULATION!!! You WINNER Player-0!!!");
        }
        System.out.println();
        for (int x = 1; x < field.length; x++) {
            System.out.println("|---+---+---|");
            for (int z = 1; z < field[x].length; z++) {
                System.out.print("| " + field[z][x] + "\t");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("|---+---+---|");
        System.out.println();
        System.out.println(field[1][1] + " " + field[2][1] + " " + field[3][1]);
        System.out.println(field[1][2] + " " + field[2][2] + " " + field[3][2]);
        System.out.println(field[1][3] + " " + field[2][3] + " " + field[3][3]);
    }
    //////////////////////////////////////////////////////////////////////
}

