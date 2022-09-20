public class ArraysAndLoops{
    public static void main(String[] args){
        String[] kingdoms = {"Mercia", "Wessex", "Northumbria", "E A"};
        for (int i = 0; i < kingdoms.length; i++){
            System.out.println(kingdoms[i]);
            System.out.println("The kingdom at index " + i + " is " + kingdoms[i]);
        }
    }
}