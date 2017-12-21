/**
  * ------------------------------------------------------------------------------------------------------------
  * File name: Project6.java
  * Project name: Project 6
  * -----------------------------------------------------------------------------------------------------------
  * Initially create by: Dakota Cowell
  * Modified by: Dakota Cowell    cowelld@goldmail.etsu.edu
  * Course-Section: CSCI 1250
  * Creation Date: 12/3/15
  * Date of Last Modification: 12/8/15
  * -----------------------------------------------------------------------------------------------------------
  */

//import Scanner class
import java.util.Scanner;

/**
  * Class Name: Project6 <br>
  * Class Purpose: This class will act as a fake reservation system. It will
  * ask the user which room they want to stay in and it will calculate their
  * total bill as well as store the user's contact information
  *
  * <hr>
  * Date created: 12/3/15
  * Date last modified: 12/8/15
  * @author Dakota Cowell
  */

public class Project6
{
  /**
    * Method Name: 	main <br>
    * Method Purpose: Interacts with the user asking which room they would like
    * to stay in and asks for their contact information. Will let them repeat the
    * process as many times as they would like
    *
    * <hr>
    * Date created: 12/3/15 <br>
    * Date last modified: 12/8/15 <br>
    *
    * <hr>
    * Notes of specifications, special algorithms, and assumptions:
    *
    * <hr>
    */
  public static void main(String [] args)
  {
    char repeat; //used to choose whether to repeat the process or not

    //Create new Scanner
    Scanner kb = new Scanner(System.in);

    //Clear Screen
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

    //Greet the user
    System.out.println(" Hello! Welcome to Whitestone Country Inn's new "
                    +  "reservation system\n"
                    +  "-----------------------------------------------"
                    +  "---------------------");

    //Create new object of Customer class
    Customer customer = new Customer();

    //begin do while loop
    do
    {
      //Clear Screen
      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

      //Print out the menu of rooms
      System.out.println(customer.roomsMenu());

      //Ask user which room they want to stay in
      System.out.print("Please enter the number of the room you would like to reserve. ");
      customer.setSelectedRoom(kb.nextInt());

      //Clear Screen
      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

      //Tell user which room they are staying in and the cost of the room
      System.out.println("You have chosen to stay in the " + customer.getSelectedRoom()
                      +  ".\nThe cost of that room is $" + customer.getRoomCost()
                      +  " per night.\n");

      //Ask how many nights they wish to stay
      System.out.print("How many nights would you like to stay? ");
      customer.setNightsStaying(kb.nextInt());

      System.out.println("Thank you. Please enter your contact information below.");

      //Flush input buffer
      kb.nextLine();

      //Ask for user's name
      System.out.print("Please enter your first and last name. ");
      customer.setName(kb.nextLine());

      //Ask for user's phone number
      System.out.print("Please enter your phone number in the format (XXX)XXX-XXXX. ");
      customer.setPhoneNumber(kb.nextLine());

      //Ask for user's address
      System.out.print("Please enter your billing address. ");
      customer.setAddress(kb.nextLine());

      //Ask for user's e-mail address
      System.out.print("Please enter your e-mail address. ");
      customer.setEMail(kb.nextLine());

      //Calculate user's subTotal
      customer.calcSubTotal();

      //Calculate user's Total Bill
      customer.calcTotalBill();

      //Clear The Screen
      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

      //Give user a bill overview
      System.out.println("-------------------- Bill Overview ---------------------");
      System.out.println(customer + "\n");

      System.out.println("The full amount will be due at the time of checkout.");
      System.out.println("Thank you for reserving your room.  \nWe will contact "
                      +  "you as soon possible to set up the dates for your stay\n"
                      +  "If you have any questions please call (879)342-1234\n");

      //Ask to repeat process
      System.out.println("Would you like to reserve a different room? (Y or N)");
      repeat = kb.nextLine().charAt(0);
    }
    while(repeat == 'Y' || repeat == 'y');//end do while
  }//end main
}//end Project6
