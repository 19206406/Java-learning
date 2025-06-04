package PACKAGE_NAME.Exceptions;

public class MultipleExceptions {

    public static void main(String[] args) {


        try {
            String text = "Sebastian";
            System.out.println("Texto: " + text.length());
            int[] numbers = new int[5];
            System.out.println(numbers[7]);
        } catch (NullPointerException e) {
            System.out.println("Error: " + e);
            System.out.println("Error: " + "El texot tiene valor nulo");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e);
            System.out.println("Error: Este elemento no existe");
        }
    }
}
