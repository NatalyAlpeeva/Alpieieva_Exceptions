public class UserCredentials {
    private String name;
    private String passw;
    private String expName="user";
    private String expPass="rabbit";

    public String getName() {
        return name;
    }

    public String getPassw() {
        return passw;
    }

    public UserCredentials(String name, String passw) {
        this.name = name;
        this.passw = passw;
    }

    public void login() throws EmptyCredsException, LengthException, CredsMissmatchException {
        if (this.name == null|| this.passw == null|| this.name.equals("")||this.passw.equals("")) {
            throw new EmptyCredsException("Name and/or password cannot be empty");
        } else if (this.passw.length() < 6) {
            throw new LengthException("Password less than 6 characters");
        } else if (!name.equals(expName)||!expPass.equals(passw)) {
            throw new CredsMissmatchException("Name and password are incorrect");
        } else {
            System.out.println("You are successfully login to the system");
        }
    }
}
