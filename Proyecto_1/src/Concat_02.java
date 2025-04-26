public class Concat_02 {
    public static void main(String[] args) {
        String name = "Sebastian";
        String surname = "Urrego";
        int value = 100;
        String word1 = "Aprendiendo", word2 = "Java"; // No recomendable
        String greeting = word1 + " " + word2;


        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Full name: " + name + " " + surname);
        System.out.println("Value: " + value);
        System.out.println(greeting);
        System.out.println(word1.concat(word2)); // Concatenar por medio de un metodo
    }
}
