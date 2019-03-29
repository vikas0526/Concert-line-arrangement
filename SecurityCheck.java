import java.util.*;

public class SecurityCheck {
    /**
     * both lines to to make a different list through them
     */
    private Line LineA = new Line();
    private Line LineB = new Line();

    public Line getLineA() {
        return LineA;
    }

    public Line getLineB() {
        return LineB;
    }

    public SecurityCheck() {
    }

    /**
     * constructor
     *
     * @param lineA
     * @param lineB
     */
    public SecurityCheck(Line lineA, Line lineB) {
        LineA = lineA;
        LineB = lineB;
    }

    /**
     * adding a person in the list accordingly and furthermore balancing them
     *
     * @param addPersonList
     */
    void addPerson(List<Person> addPersonList) {

        for (int i = 0; i < addPersonList.size(); i++) {
            getLine().addPerson(addPersonList.get(i).getName(), addPersonList.get(i).getTicketNo());
        }
    }

    /**
     * removing a person from the list through the search of both the lines
     *
     * @param removePerson
     * @throws personNotFoundException
     */
    void removePerson(Person removePerson) throws
            personNotFoundException {
        try {
            LineA.removePerson(removePerson.getTicketNo());
        } catch (personNotFoundException pnfeA) {
            try {
                LineB.removePerson(removePerson.getTicketNo());
            } catch (personNotFoundException pnfeB) {
                System.out.println("Not found in both the Lines");

            }
        }
    }

    /**
     * printing the line in both lines A and B
     */
    void printSecurityCheck() {
        Person nptr = LineA.getHead();
        System.out.println("LineA:");
        while (nptr != null) {
            System.out.println("[name:" + nptr.getName() + ", ticketNo:" + nptr.getTicketNo() + "]");
            nptr = nptr.getNextPerson();
        }
        Person nptr2 = LineB.getHead();
        System.out.println("LineB:");
        while (nptr2 != null) {
            System.out.println("[name:" + nptr2.getName() + ", ticketNo:" + nptr2.getTicketNo() + "]");
            nptr2 = nptr2.getNextPerson();
        }
    }

    public Line getLine() {
        if (LineA.getSizeOfLine() == LineB.getSizeOfLine() || LineA.getSizeOfLine() < LineB.getSizeOfLine()) {
            return LineA;
        } else {
            return LineB;
        }
    }
}
