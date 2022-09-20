import java.util.Scanner;


public class Javapedia{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many historical figures will you register?");
        int numberOfFigures = scan.nextInt();

        String[][] database = new String[numberOfFigures][3];
        System.out.println(numberOfFigures);

        for(int i = 0; i < database.length; i++){
        System.out.println("\n\tFigure");
        System.out.print("\t - Name: ");
        scan.nextLine();
        database[i][0] = scan.nextLine();
        System.out.print("\t - Date of Birth: ");
        database[i][1] = scan.nextLine();
        System.out.print("\t - Occupation: ");
        database[i][2] = scan.nextLine();
        System.out.print("\n");
        }
        print2dArray(database);
    }
    public static void print2dArray(String[][] array){
        for(int i = 0; i < array.length; i++){
            System.out.print("\t");
            for(int j = 0; j<array[i].length; j++){
                System.out.println(array[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
}