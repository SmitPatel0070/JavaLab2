import java.time.LocalDate;



/**
 *
 * Name: Smit Patel
 * Student ID: 100846414
 * File Name: Java Lab 2
 * Date: 21st November, 2022
 * Group No.: 11
 *
 */


// WorkTicket class
public class WorkTicket {



    private int WorkTicketNumber;
    private String ClientId;
    private LocalDate WorkTicketDate;
    private String IssueDescription;
    final private int CENTURY_START = 2000;



    final private int CENTURY_END = 2099;


// default constructor
    WorkTicket() {
        WorkTicketNumber=0;
        ClientId = null;
        WorkTicketDate = null;
        IssueDescription = null;

    }


// Parameterized constructor
    WorkTicket(int myTicketNumber, String myClientId, LocalDate myWorkTicketDate, String myDescription) {
        setWorkTicket( myTicketNumber,  myClientId, myWorkTicketDate, myDescription);



    }


// accessor and mutator for all variables
    public void setWorkTicketNumber(int myTicketNumber) {
        if (myTicketNumber > 0) {
            WorkTicketNumber = myTicketNumber;

        } else {

            throw new IllegalArgumentException("Ticket number must be above 0.");

        }



    }



    public int getWorkTicketNumber() {
        return WorkTicketNumber;

    }



    public void setClientId(String myClientId) {
        ClientId = myClientId;

    }



    public String getClientId() {
        return ClientId;

    }



    public LocalDate getDate() {
        return WorkTicketDate;

    }



    public void setDate(LocalDate myWorkTicketDate) {



        int currentYear = myWorkTicketDate.getYear();
        if (!(currentYear < CENTURY_START || currentYear > CENTURY_END)) {
            WorkTicketDate = myWorkTicketDate;

        } else {

            throw new IllegalArgumentException("Year must be in the range of 2000 and 2099.");

        }
    }



    public String getIssueDescription() {
        return IssueDescription;

    }



    public void setIssueDescription(String myDescription) {
        IssueDescription = myDescription;

    }


// this is mutator for work ticket class which assigns the value to the respective variables
    public boolean setWorkTicket(int myTicketNumber, String myClientId, LocalDate myWorkTicketDate, String myDescription) {
        boolean valid = true;



        if (valid) {
            setWorkTicketNumber(myTicketNumber);
            setClientId(myClientId);
            setDate(myWorkTicketDate);
            setIssueDescription(myDescription);
            return valid;

        } else {

            return (!valid);

        }

    }

    // this is overrided tostring method

    @Override
    public String toString()

    {   String formattedString= "------------------------------------"
            +"\nWork Ticket Number :" +getWorkTicketNumber()
            +"\nClient ID :"+getClientId()
            +"\nWork Ticket Date :" +getDate()
            +"\nTicket Description :"  +getIssueDescription()
            +"\n---------------------------------------------------\n";
        return formattedString;

    }

}