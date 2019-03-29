import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SecurityCheckDriver {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        SecurityCheck security = new SecurityCheck();
        Line l = new Line();
        System.out.println("Hi, Hope all is good with you?");
        System.out.println("Please begin using your program");
        String input = "";
        /**
         * while loop to help the user navigate through the program, it is accompanied with a switch format.
         */
        while (!input.equalsIgnoreCase("Q")) {
            System.out.println("(A)-Add Person");
            System.out.println("(R)-Remove Person");
            System.out.println("(P)-Print Table");
            System.out.println("(PR)-Print Reverse");
            System.out.println("(Q)-Quit");
            System.out.println("Please select an option:");
            input = sc.nextLine();
            switch (input) {
                /**
                 * adding the ticket number and the name to the linked list
                 */
                case "A":
                    List<Person> personList = new ArrayList<Person>();
                    String name;
                    int ticketNumber;
                    System.out.println("Please insert the number of people you are going to insert");
                    int numberOfPerson = sc.nextInt();
                    for (int i = 0; i < numberOfPerson; i++) {
                        System.out.println("enter name and ticket number of persons needed to be added");
                        name = sc.next();
                        ticketNumber = sc.nextInt();
                        personList.add(new Person(name, ticketNumber));
                    }
                    security.addPerson(personList);
                    System.out.println("Add has been done properly. :)");
                    break;
                case "R":
/**
 * removing a node from the list through only the individual ticket number
 */
                    Person personListRemove = new Person();
                    System.out.println("Please insert the number of people you are going to insert");
                    int numberOfPersonTicket = sc.nextInt();
                    for (int i = 0; i < numberOfPersonTicket; i++) {
                        int ticketNumberRemove = sc.nextInt();
                        try {
                            security.removePerson(new Person("", ticketNumberRemove));
                        } catch (personNotFoundException e) {
                            e.getStackTrace();
                        }
                    }

                    System.out.println("Remove has been done properly. :)");
                    break;
                case "P":
                    /**
                     * printing the list in both line a and b banacing them
                     */
                    security.printSecurityCheck();
                    System.out.println("Lists have been printed :)");
                    break;
                case "PR":
                    /**
                     * printing in reverse
                     */
                    security.getLineA().printLineInReverse();
                    security.getLineB().printLineInReverse();
                    System.out.println("Line has been printed in reverse");
                    break;
                case "Q":
                    /**
                     * quitting and exitting the program
                     */
                    System.exit(0);
                    break;
            }
        }
    }
}