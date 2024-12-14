import scanner.Input;
import Security.EncryptionHandler;

class Application extends Input {

    void start(){
        EncryptionHandler encryptionHandler= new EncryptionHandler(3);

        String username;
        String password;


        System.out.print("Enter your username : ");
        username = readString();
        System.out.print("Enter your password : ");
        password = readString();

        String encryptedPassword =encryptionHandler.encryptText(password);

        while(true){
            System.out.print("Re-enter your password: ");
            String re_enteredPassword = readString();

            String decryptedPassword= encryptionHandler.decryptText(encryptedPassword);

            if(re_enteredPassword.equals(decryptedPassword)){
                System.out.println("Password match successful!");
                break;
            } else {
                System.out.println("Incorrect password, please try again.");
            }
        }

    }
}

