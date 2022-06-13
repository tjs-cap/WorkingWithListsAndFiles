import java.io.File;  // Import the File class
import java.util.Scanner;

public class DeleteFile {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in); //set up scanner for user feedback
        File f = new File("example.txt"); //create an instance of file (f)
        String response = "no"; //set up a string variable to be used with IF statement, default to "no"
        System.out.println("You are about to delete " + f.getName() +"!");
        System.out.println("Are you sure? Yes/No"); //display label for the IF statement
        response = inp.nextLine().toLowerCase(); //take the response from the user and force it for lowercase
        if (response.equals("yes") || response.equals("y")) {  //check if user wishes to remove the file/
            if (f.delete()) { //perform the removal of the file
                System.out.println("Deleted the file: " + f.getName());
            } else {
                System.out.println("Failed to delete the file. File may not exist!");
            }
        }
        else {
            System.out.println("File not deleted!");
        }
    }

}
