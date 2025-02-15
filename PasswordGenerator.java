import java.security.SecureRandom;

public class PasswordGenerator {
    public static void main(String[] args) {
        // Creating a SecureRandom object for secure random number generation
        SecureRandom random = new SecureRandom();
        
        // Characters to be included in the password
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
        
        // Reading user input for the password length
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the length of the password: ");
        int passwordLength = scanner.nextInt();
        
        // Generating the password
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < passwordLength; i++) {
            int randomIndex = random.nextInt(characters.length());
            password.append(characters.charAt(randomIndex));
        }
        
        // Printing the generated password
        System.out.println("Generated password: " + password.toString());
    }
}
