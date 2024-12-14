package scanner;

import java.util.Scanner;

public class Input {
    private Scanner input;

    public Input(){
        this.input=new Scanner(System.in);
    }

    protected String readString(){
        return input.next();
    }
    protected Integer readNumber(){
        return input.nextInt();
    }
}
