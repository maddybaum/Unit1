import java.util.Arrays;

public class TDarrays{
    public static void main(String[] args){
        int[][] grades = {
                {72, 74, 78, 76},
                {65, 64, 61, 67},
                {95, 98, 99, 100}
        };
        for (int i = 0; i < grades.length; i++){
            for (int j = 0; j < grades.length; j++){

                switch (i) {
                    case 0: System.out.print("\tHarry: "); break;
                    case 1: System.out.print("\tRon: "); break;
                    case 2: System.out.print("\tHermione: "); break;
                }
                System.out.println(grades[i][j] + " ");
                System.out.print("\n");
            }
        }

        System.out.println("\tHarry: " + Arrays.toString(grades[0]));
        System.out.println("\tRon: " + Arrays.toString(grades[1]));
        System.out.println("\tHermione: " + Arrays.toString(grades[2]));


    }
}