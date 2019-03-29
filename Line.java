public class Line {

    private Person head;
    private Person tail;
    private Person cursor;
    private int sizeOfLine;
    Person p = new Person();

    /**
     * using this getter to get the head
     *
     * @return
     */
    public Person getHead() {
        return head;
    }

    /**
     * getting the size of the line
     *
     * @return
     */
    public int getSizeOfLine() {
        return sizeOfLine;
    }

    /**
     * adding a person according to the end of the linked list and in a ordered form from small to big
     *
     * @param name
     * @param ticketNo
     */
    void addPerson(String name, int ticketNo) {
        Person newNode =
                new Person(name, ticketNo);

        cursor = head;
        if (head == null) {
            head = newNode;
            tail = head;
            sizeOfLine++;
            return;
        }
        if (head.getTicketNo() < ticketNo) {
            newNode.setNextPerson(head);
            head = newNode;
            sizeOfLine++;
            return;
        }
        while (cursor.getNextPerson() != null) {
            if (cursor.getTicketNo() < ticketNo && cursor.getNextPerson().getTicketNo() > ticketNo) {
                newNode.setNextPerson(cursor.getNextPerson());
                cursor.setNextPerson(newNode);
                sizeOfLine++;
                return;
            }
            cursor = cursor.getNextPerson();
        }
        tail.setNextPerson(newNode);
        tail = tail.getNextPerson();
        sizeOfLine++;
    }

    /**
     * removing a person from the list according to the check of the person in both lines
     * in this case specifically only the name
     *
     * @param name
     * @throws personNotFoundException
     */
    void removePerson(String name) throws
            personNotFoundException {


        if (head.getName().equals(name)) {//strings is .equals
            head = head.getNextPerson();
            sizeOfLine--;
            return;
        }
        cursor = head;
        while (cursor.getNextPerson().getNextPerson() != null) {
            if (cursor.getNextPerson().getName().equalsIgnoreCase(name)) {
                cursor.setNextPerson(
                        cursor.getNextPerson()
                                .getNextPerson());
                sizeOfLine--;
                return;
            }
            cursor = cursor.getNextPerson();
        }
        if (cursor.getNextPerson().getName().equalsIgnoreCase(name)) {
            cursor = tail;
            sizeOfLine--;
            return;
        } else {
            throw new personNotFoundException();
        }

    }

    /**
     * removing the person form the list and in this case only the ticket number as in the earlier method we did it with the name only
     *
     * @param ticketNo
     * @throws personNotFoundException
     */
    void removePerson(int ticketNo) throws
            personNotFoundException {
        if (head.getTicketNo() == ticketNo) {//strings is .equals
            head = head.getNextPerson();
            sizeOfLine--;
            return;
        }
        cursor = head;
        while (cursor.getNextPerson().getNextPerson() != null) {
            if (cursor.getNextPerson().getTicketNo() == ticketNo) {
                cursor.setNextPerson(
                        cursor.getNextPerson()
                                .getNextPerson());
                sizeOfLine--;
                return;
            }
            cursor = cursor.getNextPerson();
        }
        if (cursor.getNextPerson().getTicketNo() == ticketNo) {
            cursor = tail;
            sizeOfLine--;
            return;
        } else {
            throw new personNotFoundException();
        }
    }

    /**
     * printing the line in reverse format, from the end to that start.
     */
    void printLineInReverse() {
        //traverse normal linked list from cursor at head and keep adding into string then just reverse the string.
        //Reversing a string, inserting the node in the string.
        cursor = tail;
        while (cursor.getPrevPerson() != null) {
            System.out.format("%14s%14d\n", p.getName(), p.getTicketNo());
        }

    }
}
