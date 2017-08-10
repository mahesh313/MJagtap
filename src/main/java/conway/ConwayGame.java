package conway;

import java.util.Arrays;

/**
 * Created by jagtapm on 7/17/2017.
 */
public class ConwayGame {
    public static Boolean[][] next(Boolean[][] input) {
//        Boolean[][] input = new Boolean[7][7];//this is initial input
        Boolean[][] pInput = new Boolean[7][7];//this indicates boundary of the initial seed
        Boolean[][] cInput = new Boolean[7][7];//this stores updated data

        int count = 0; //count no of live neighbours

        //initializing all arrays
//        for (Boolean[] booleans : input) {
//            Arrays.fill(booleans, Boolean.FALSE);
//        }
        for (Boolean[] booleans : pInput) {
            Arrays.fill(booleans, Boolean.FALSE);
        }
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                cInput[i][j] = input[i][j];
            }
        }


        //test input
//        input[2][4] = input[4][2] = input[3][3] = Boolean.TRUE;
//        cInput[2][4] = cInput[4][2] = cInput[3][3] = Boolean.TRUE;

        //finding the boundary and storing it in the pInput
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (input[i][j]) {
                    pInput[i][j] = Boolean.TRUE;
                    if ((i - 1) >= 0 && (i - 1) <= 6) {
                        pInput[i - 1][j] = Boolean.TRUE;

                    }
                    if ((i + 1) >= 0 && (i + 1) <= 6) {
                        pInput[i + 1][j] = Boolean.TRUE;

                    }
                    if ((j - 1) >= 0 && (j - 1) <= 6) {
                        pInput[i][j - 1] = Boolean.TRUE;

                    }
                    if ((j + 1) >= 0 && (j + 1) <= 6) {
                        pInput[i][j + 1] = Boolean.TRUE;

                    }
                    if ((i - 1) >= 0 && (i - 1) <= 6 && (j - 1) >= 0 && (j - 1) <= 6) {
                        pInput[i - 1][j - 1] = Boolean.TRUE;

                    }
                    if ((i + 1) >= 0 && (i + 1) <= 6 && (j + 1) >= 0 && (j + 1) <= 6) {
                        pInput[i + 1][j + 1] = Boolean.TRUE;

                    }
                    if ((j - 1) >= 0 && (j - 1) <= 6 && (i + 1) >= 0 && (i + 1) <= 6) {
                        pInput[i + 1][j - 1] = Boolean.TRUE;

                    }
                    if ((j + 1) >= 0 && (j + 1) <= 6 && (i - 1) >= 0 && (i - 1) <= 6) {
                        pInput[i - 1][j + 1] = Boolean.TRUE;

                    }
                }
            }
        }

//        for (int i = 0; i < 7; i++) {
//            for (int j = 0; j < 7; j++) {
//                System.out.println( i + " " + j + " " + pInput[i][j]);
//            }
//        }
        System.out.println("===========================");

        //actually counting the live neighbours

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                count = 0;
                if (pInput[i][j]) {
                    if ((i - 1) >= 0 && (i - 1) <= 6) {
                        if (input[i - 1][j]) count++;

                    }
                    if ((i + 1) >= 0 && (i + 1) <= 6) {
                        if (input[i + 1][j]) count++;

                    }
                    if ((j - 1) >= 0 && (j - 1) <= 6) {
                        if (input[i][j - 1]) count++;

                    }
                    if ((j + 1) >= 0 && (j + 1) <= 6) {
                        if (input[i][j + 1]) count++;

                    }
                    if ((i - 1) >= 0 && (i - 1) <= 6 && (j - 1) >= 0 && (j - 1) <= 6) {
                        if (input[i - 1][j - 1]) count++;

                    }
                    if ((i + 1) >= 0 && (i + 1) <= 6 && (j + 1) >= 0 && (j + 1) <= 6) {
                        if (input[i + 1][j + 1]) count++;

                    }
                    if ((j - 1) >= 0 && (j - 1) <= 6 && (i + 1) >= 0 && (i + 1) <= 6) {
                        if (input[i + 1][j - 1]) count++;

                    }
                    if ((j + 1) >= 0 && (j + 1) <= 6 && (i - 1) >= 0 && (i - 1) <= 6) {
                        if (input[i - 1][j + 1]) count++;
                    }
                    System.out.println(i + " " + j + " " + count);

                    if (count < 2) cInput[i][j] = Boolean.FALSE;
                    if (count == 3 && !input[i][j]) cInput[i][j] = Boolean.TRUE;
                    if (count > 3) cInput[i][j] = Boolean.FALSE;

                }
            }

        }
        System.out.println("=============================");

        //this is output
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.println( i + " " + j + " " + cInput[i][j]);
            }
        }
        return cInput;
    }



//   public static void main(String[] args) {
//        ConwayGame c = new ConwayGame();
//        c.next();
//    }



}
