public class Person {
    /**
     * this class is going to initialize the node with the requiered data which is the name and ticket number
     * also it will be including both the next and prev as in a doubly linked list
     */
    private String name;
    private int ticketNo;
    private Person nextPerson;
    private Person prevPerson;

    /**
     * empty constructor
     */
    public Person() {
    }

    /**
     * constructor with requiered parameters in order to insert the user data requiered to make its node data with name and ticket number
     *
     * @param name
     * @param ticketNo
     */
    public Person(String name, int ticketNo) {
        this.name = name;
        this.ticketNo = ticketNo;
    }

    /**
     * constructor with all the variables
     *
     * @param name
     * @param ticketNo
     * @param nextPerson
     * @param prevPerson
     */
    public Person(String name, int ticketNo, Person nextPerson, Person prevPerson) {
        this.name = name;
        this.ticketNo = ticketNo;
        this.nextPerson = nextPerson;
        this.prevPerson = prevPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(int ticketNo) {
        this.ticketNo = ticketNo;
    }

    public Person getNextPerson() {
        return nextPerson;
    }

    public void setNextPerson(Person nextPerson) {
        this.nextPerson = nextPerson;
    }

    public Person getPrevPerson() {
        return prevPerson;
    }

    public void setPrevPerson(Person prevPerson) {
        this.prevPerson = prevPerson;
    }


}
