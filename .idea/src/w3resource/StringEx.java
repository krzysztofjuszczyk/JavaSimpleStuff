package w3resource;

import java.util.Scanner;

public class StringEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Password validation, enter password: ");
////        String testString = scanner.nextLine();
//        scanner.close();
        String test = "du3pa12";

        if (ex11isValid(test)) System.out.println("valid");
                else System.out.println("invalid");
        System.out.println("test");
    }
    //11. Write a Java method to check whether a string is a valid password.
// A password must have at least 6 characters.
//A password consists of only letters and digits.
//A password must contain at least two digits.
    public static boolean  ex11isValid (String pass){
            boolean isPasswordValid = false;
            if ((pass.length() >=6) &&
                pass.matches(".*[a-zA-Z].*")&&
                pass.matches(".*[0-9]{2,}.*"))
                isPasswordValid = true;
        return isPasswordValid;
        }

    }

