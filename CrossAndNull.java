package Arr_Game_CrossAndNull;

import java.util.Scanner;

class CrossAndNull {
    public static String[][] field = new String[4][4];
    public static int x;
    public static int z = 0;
    public static int move = 0;
    public static int moveX = 0;
    public static int move0 = 0;
    public static boolean valid;
    public static String gambler;
    public static String gamblerNull = "0";
    public static String gamblerX = "x";
    public static String pictures;

    public static void presentGame() {
        pictures =
        "  +#####@                                                  ###  ####+  #### ###       ####+  ####            ##### ##### \n" +
        " #########:                 .                              ###  #####  #### ###       #####  ####            ##### #####  \n"+
        " ####  #### #### ####% ########* .########-.########-       #   ###### ####  #        ###### ####  ####  ### ##### #####  \n"+
        " ####  %%%% ##############  #### ####   #####   #####           ######:####           ######:####  ####  ### ##### #####  \n"+
        " ####       ######  ######  #### -#####-   -#####-              ###########           ###########  ####  ### ##### #####  \n"+
        " ####  #### #####     ####  ####    ######.   ######.           ####.######           ####.######  ####  ### ##### #####  \n"+
        " ####  #### #####     ####  #### ####   #######   ####          #### ######           #### ######  ####  ### ##### #####  \n"+
        " #########. #####     -######### *########**########*           ####  #####           ####  #####  #########.##### #####  \n"+
        "   *###=.   #####       .%##@:     :@##@-    :@##@-             ####  @####           ####  @####   @#= #### ##### #####\n";

        System.out.println(pictures);
    }

    ////////METHOD_ONE_///////////////////////////////
    public static void initializationField() {
        System.out.println("\t\t***Welcome in Game***");
        System.out.println("\n_-_-_-_-_-_-CROSS AND NULL-_-_-_-_-_-_\n");
        field[1][1] = "1";
        field[1][2] = "4";
        field[1][3] = "7";
        field[2][1] = "2";
        field[2][2] = "5";
        field[2][3] = "8";
        field[3][1] = "3";
        field[3][2] = "6";
        field[3][3] = "9";
        for (x = 1; x < field.length; x++) {
            System.out.println("|---+---+---|");
            for (z = 1; z < field[x].length; z++) {
                System.out.print("| " + field[z][x] + "\t");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("|---+---+---|");
    }

    ////////METHOD_TWO_///////////////////////////////
    public static void logicGameCrossAndNull() {
        do {
            move++;
            for (x = 1; x < 2; x++) {
                System.out.print("Enter Player X or 0: ");
                Scanner enter_player = new Scanner(System.in);
                gambler = enter_player.next();
                if (gambler.equals(gamblerX)) {
                    moveX++;
                    valid = true;
                    System.out.println("Player - X");
                    System.out.println("Player-X move: " + moveX + " " + valid);
                    System.out.println("All move: " + move);
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
                } else if (gambler.equals(gamblerNull)) {
                    move0++;
                    valid = true;
                    System.out.println("Player - 0");
                    System.out.println("Player-0 move: " + move0 + " " + valid);
                    System.out.println("All move: " + move0);
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
                valid = true;
                for (z = 1; z < field[x].length; z++) {
                }
            }
            for (x = 1; x < field.length; x++) {
                for (z = 1; z < field[x].length; z++) {
                    System.out.print("| " + field[z][x] + "\t");
                }
                System.out.print("|");
                System.out.println();
                System.out.println("|---+---+---|");
            }
        } while (move <= field.length);

        if (moveX == 3 && gamblerX == "x") {
            System.out.println("Player-X CONGRATULATION!!! You WINNER Player-X!!!");
        } else if (move0 == 3 && gamblerNull == "0") {
            System.out.println("Player-0 CONGRATULATION!!! You WINNER Player-0!!!");
        } else {
            System.out.println("Not WINNER! This is a draw!");
        }
    }

    ////////METHOD_THREE_///////////////////////////////
    public static void showBoardAndResultGame() {
        System.out.println();
        for (x = 1; x < field.length; x++) {
            System.out.println("|---+---+---|");
            for (z = 1; z < field[x].length; z++) {
                System.out.print("| " + field[z][x] + "\t");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("|---+---+---|");
        System.out.println();
        System.out.println("RESULT GAME: ");
        System.out.println(field[1][1] + " " + field[2][1] + " " + field[3][1]);
        System.out.println(field[1][2] + " " + field[2][2] + " " + field[3][2]);
        System.out.println(field[1][3] + " " + field[2][3] + " " + field[3][3]);
    }
}
