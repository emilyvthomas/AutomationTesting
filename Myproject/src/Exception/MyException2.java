package Exception;

public class MyException2 {
    // Driver Program
    public static void main(String args[])
    {
        try {
            // Throw an object of user defined exception
            throw new MyException1();
        }
        catch (MyException1 e) {
            System.out.println("Caught");
 
            // Print the message from MyException object
            System.out.println("expection");
        }
    }
}