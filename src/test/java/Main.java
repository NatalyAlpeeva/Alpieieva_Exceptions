import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a name");
        String name=in.nextLine();
        System.out.println("Please enter a password");
        String passw=in.nextLine();

        UserCredentials userCredentials = new UserCredentials(name,passw);


        try {
            userCredentials.login();
        } catch (EmptyCredsException e) {
            e.printStackTrace();
        } catch (LengthException e) {
            e.printStackTrace();
        } catch (CredsMissmatchException e) {
            e.printStackTrace();
        }
    }
}
