package ch.unil.doplab;

/**
 * Software Architectures | DOPLab | UniL
 *
 * @author Melike Geçer
 */
public class Reviews {

    public static void main(String[] args) {
        System.out.println("---> start <---");
        // TODO: Create a new Java class called User. The User class should have the following class fields and methods.
        // Also, add accessors and mutators if necessary.
        // 1. a username
        // 2. a first name
        // 3. a last name
        // 4. an email address
        // 5. password
        // 6. balance
        // 7. increaseBalance()
        // 8. decreaseBalance()
        // 9. isPasswordCorrect()
        // TODO: Create a constructor that sets all class fields, except balance, in the User class.
        // TODO: Create a User instance.
        User user = new User("mel", "melike", "gecer", "melike.gecer@ab.com", "1234");
        // TODO: Print the user's information.
        System.out.println(user.getUsername());
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        System.out.println(user.getEmail());
        System.out.println(user.getBalance());
        // TODO: Check if the password is correct.
        System.out.println("Password should is " + user.isPasswordCorrect("1234"));
        System.out.println("Password should is " + user.isPasswordCorrect("5678"));
        // TODO: Add money to the user's acccount.
        System.out.println(user.getBalance());
        user.increaseBalance(1000);
        System.out.println(user.getBalance());
        // TODO: Remove money from the user's account.
        System.out.println(user.getBalance());
        user.decreaseBalance(430);
        System.out.println(user.getBalance());
        // TODO: The following methods are common to ALL Java classes, override them in the class User to have customized functionalities.
        // equals()
        // toString()
        System.out.println("---> end <---");
    }
}
