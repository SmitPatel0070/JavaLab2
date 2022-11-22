
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

// main files
public class Main {


    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) {

        //default constructor demo

        System.out.println("Here, it shows the default value of the Work Ticket");
        WorkTicket ticket1 = new WorkTicket();
        System.out.println(ticket1.toString());

        //parameterized constructor

        System.out.println("Parameterized value of the Work Ticket");
        WorkTicket parametrizedTicket = new WorkTicket(1, "AMCE_123", LocalDate.now(), "Password Reset");
        System.out.println(parametrizedTicket.toString());

//
        System.out.println("Work Ticket to get exception ");
//        WorkTicket  Ticket = new WorkTicket(-1, "AMCE Ecepiom",LocalDate.now(), "Ticket to generate exception");
//        System.out.println( Ticket.toString());
//

        System.out.println("~~~~~ THE END ~~~~~.");

    }

}
