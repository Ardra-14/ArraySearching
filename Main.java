import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Searching sr = new Searching();
        System.out.println("Enter the size of the array: ");
        int size = s.nextInt();


        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i< size;i++){
            arr[i] = s.nextInt();
        }

        System.out.println("Enter the element to search: ");
        int searchElement = s.nextInt();

        try {
            int pos = sr.process(arr, searchElement);
            System.out.println("Element found at the position: "+ pos);
        } catch (UniqueElementExceptions | ElementNotFoundExceptions e) {
            System.out.println(e.getMessage());
        }

    }
}