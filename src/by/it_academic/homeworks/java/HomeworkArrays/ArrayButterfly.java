package by.it_academic.homeworks.java.HomeworkArrays;

public class ArrayButterfly {
        public static void main(String[] args) {
            int arrayButterfly[][] = new int[5][5];
            int i, j;
            for (i = 0; i < arrayButterfly.length / 2 + 1; i++) {
                for (j = 0; j < arrayButterfly[i].length; j++) {
                    if ((j < i) || (j >= (arrayButterfly[i].length - i)))
                        arrayButterfly[i][j] = 0;
                    else
                        arrayButterfly[i][j] = 1;

                }

            }
            for (i = arrayButterfly.length - 1; i >= arrayButterfly.length / 2 + 1; i--) {
                for (j = 0; j < arrayButterfly[i].length; j++) {
                    if ((j < arrayButterfly[i].length - 1 - i) || (j > i))
                        arrayButterfly[i][j] = 0;
                    else
                        arrayButterfly[i][j] = 1;
                }
            }
            for (i = 0; i < arrayButterfly.length; i++) {
                for (j = 0; j < arrayButterfly[i].length; j++) {
                    System.out.print(arrayButterfly[i][j]);
                }
                System.out.println(" ");
            }
        }
    }

