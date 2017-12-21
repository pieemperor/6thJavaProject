/**************************************************************************************
 * ------------------------------------------------------------------------------------
 * File name: Customer.java
 * Project name: CSCI 1250 Project 6
 * ------------------------------------------------------------------------------------
 * Author Name: Dakota Cowell
 * Author E-mail: cowelld@goldmail.etsu.edu
 * Course-Section: CSCI-1250-201
 * Creation Date: 12/3/2015
 * Date of Last Modification: 12/8/2015
 * -----------------------------------------------------------------------------
 */


 /*******************************************************************************
  * Class Name: Customer <br>
  * Class Purpose: Project 6  <br>
  *
  * <hr>
  * Date created: 12/3/2015 <br>
  * Date last modified: 12/8/2015
  * @author Dakota Cowell
  */
public class Customer
{
  private String customerName; //stores customer's name entered by user
  private String phoneNumber; //stores customer's phone number entered by user
  private String address; //stores customer's address entered by user
  private String email; //stores customer's email entered by user
  private int nightsStaying; //Stores the number of nights customer is staying
  private double billTotal; //Stores the Final bill total after it is calculated
  private String selectedRoom; //Stores which room the customer chose
  private double roomCost; //Stores how much the room cost that customer chose
  private final double TAX_RATE = .0975; //Tax Rate
  private double subTotal; //Stores subtotal before tax is applied

  //Create array of the choices of rooms
  String[] rooms = {"Blue Bird", "Mallard", "Eagle", "Osprey", "Hawk",
                                  "Sparrow", "Wood Duck"};

  //Create an array of prices correspinding to the rooms
  final double[] prices = {190, 280, 335, 325, 325, 325, 325};

  /**
  * Method Name: Customer <br>
  * Method Purpose: create an object of the Customer class<br>
  *
  * <hr>
  * Date created: 12/3/15 <br>
  * Last modified: 12/8/15 <br>
  *
  * <hr>
  * Notes on specifications, special algorithms, and assumptions:
  * <hr>
  */
  public Customer()
  {
    setName("No Name Entered"); //Set default name
    setPhoneNumber("No Phone Number Entered"); //Set default phone number
    setAddress("No Address Entered"); //Set default address
    setEMail("No Email Entered"); //Set default email
  }

  /**
  * Method Name: Customer <br>
  * Method Purpose: create an object of the Customer class and pass their name
  * and email address in
  * <br>
  *
  * <hr>
  * Date created: 12/3/15 <br>
  * Last modified: 12/8/15 <br>
  *
  * <hr>
  * Notes on specifications, special algorithms, and assumptions:
  * <hr>
  *   @param mail is the customer's email address
  *   @param name is the customer's name
  */
  public Customer(String name, String mail)
  {
    setName(name); //Set name equal to value passed in
    setPhoneNumber("No Phone Number Entered"); //Set default phone number
    setAddress("No Address Entered"); //Set default address
    setEMail(mail); //Set email to value passed in
  }

  /**
  * Method Name: Customer <br>
  * Method Purpose: create an object of the Customer class and pass their name,
  * email address, phone number, and address in
  * <br>
  *
  * <hr>
  * Date created: 12/3/15 <br>
  * Last modified: 12/8/15 <br>
  *
  * <hr>
  * Notes on specifications, special algorithms, and assumptions:
  * <hr>
  *   @param mail is the customer's email address
  *   @param name is the customer's name
  *   @param phone is the customer's phone number
  *   @param street is the customer's street adress
  */
  public Customer(String name, String phone, String street, String mail)
  {
    setName(name); //Set name equal to value passed in
    setPhoneNumber(phone); //Set phone # to value passed in
    setAddress(street); //Set address to value passed in
    setEMail(mail); //Set email to value passed in
  }

  /**
  * Method Name: Student <br>
  * Method Purpose: copy an object of the Customer class<br>
  *
  * <hr>
  * Date created: 12/3/15 <br>
  * Last modified: 12/8/15 <br>
  *
  * <hr>
  * Notes on specifications, special algorithms, and assumptions:
  * <hr>
  *   @param original is the object that is passed in to be copied
  */
  public Customer(Customer original)
  {
    setName(original.customerName);
    setPhoneNumber(original.phoneNumber);
    setAddress(original.address);
    setEMail(original.email);
  }

  /**
  * Method Name: setName <br>
  * Method Purpose: set the customer's name <br>
  *
  * <hr>
  * Date created: 12/3/15 <br>
  * Last modified: 12/7/15 <br>
  *
  * <hr>
  * Notes on specifications, special algorithms, and assumptions:
  * <hr>
  *   @param name is the name of the customer passed in by the user.
  */
  public void setName(String name)
  {
    customerName = name; //set customerName equal to value passed in
  } //end setName

  /**
  * Method Name: setPhoneNumber <br>
  * Method Purpose: set the customer's phone number <br>
  *
  * <hr>
  * Date created: 12/3/15 <br>
  * Last modified: 12/7/15 <br>
  *
  * <hr>
  * Notes on specifications, special algorithms, and assumptions:
  * <hr>
  *   @param number is the phone number of the customer passed in by the user.
  */
  public void setPhoneNumber(String number)
  {
    phoneNumber = number;//set phoneNumber to number passed in
  }//end setPhoneNumber

  /**
  * Method Name: setAddress <br>
  * Method Purpose: set the customer's address <br>
  *
  * <hr>
  * Date created: 12/3/15 <br>
  * Last modified: 12/7/15 <br>
  *
  * <hr>
  * Notes on specifications, special algorithms, and assumptions:
  * <hr>
  *   @param street is the address of the customer passed in by the user.
  */
  public void setAddress(String street)
  {
    address = street; //set address to address passed in
  }//end setAddress

  /**
  * Method Name: setEMail <br>
  * Method Purpose: set the customer's email<br>
  *
  * <hr>
  * Date created: 12/3/15 <br>
  * Last modified: 12/7/15 <br>
  *
  * <hr>
  * Notes on specifications, special algorithms, and assumptions:
  * <hr>
  *   @param address is the email of the customer passed in by the user.
  */
  public void setEMail(String address)
  {
    email = address; //set email to address passed in
  }//end setEMail

  /**
  * Method Name: setNightsStaying <br>
  * Method Purpose: set the number of nights the customer is staying<br>
  *
  * <hr>
  * Date created: 12/3/15 <br>
  * Last modified: 12/7/15 <br>
  *
  * <hr>
  * Notes on specifications, special algorithms, and assumptions:
  * <hr>
  *   @param nights is the # of nights the customer is staying passed in by the user.
  */
  public void setNightsStaying(int nights)
  {
    nightsStaying = nights; //set nightsStaying to nights passed in
  } //end setNightsStaying

  /**
  * Method Name: setSelectedRoom <br>
  * Method Purpose: set the room the customer chose<br>
  *
  * <hr>
  * Date created: 12/3/15 <br>
  * Last modified: 12/7/15 <br>
  *
  * <hr>
  * Notes on specifications, special algorithms, and assumptions:
  * <hr>
  *   @param room is the room the customer chose. passed in by the user.
  */
  public void setSelectedRoom(int room)
  {
    //Check user input to see which room they selected, then set correct room and price
    if(room == 1)
    {
      selectedRoom = rooms[0]; //set selectedRoom equal to 1st room
      roomCost = prices[0]; //set roomCost to 1st room cost
    }
    else if(room == 2)
    {
      selectedRoom = rooms[1];//set selectedRoom equal to 2nd room
      roomCost = prices[1];//set roomCost to 2nd room cost

    }
    else if(room == 3)
    {
      selectedRoom = rooms[2];//set selectedRoom equal to 3rd room
      roomCost = prices[2];//set roomCost to 3rd room cost
    }
    else if(room == 4)
    {
      selectedRoom = rooms[3];//set selectedRoom equal to 4th room
      roomCost = prices[3];//set roomCost to 4th room cost
    }
    else if(room == 5)
    {
      selectedRoom = rooms[4];//set selectedRoom equal to 5th room
      roomCost = prices[4];//set roomCost to 5th room cost
    }
    else if(room == 6)
    {
      selectedRoom = rooms[5];//set selectedRoom equal to 6th room
      roomCost = prices[5];//set roomCost to 6th room cost
    }
    else if(room == 7)
    {
      selectedRoom = rooms[6];//set selectedRoom equal to 7th room
      roomCost = prices[6];//set roomCost to 7th room cost
    }
  }//end setSelectedRoom

  /**
  * Method Name: getName <br>
  * Method Purpose: get the customer's name <br>
  *
  * <hr>
  * Date created: 12/3/15 <br>
  * Last modified: 12/8/15 <br>
  *
  * <hr>
  * Notes on specifications, special algorithms, and assumptions:
  *
  *
  * <hr>
  *   @return String returns the customer's name
  */
  public String getName()
  {
    return customerName; //Return the customer's name
  }//end getName

  /**
  * Method Name: getPhoneNumber <br>
  * Method Purpose: get the customer's phone number <br>
  *
  * <hr>
  * Date created: 12/3/15 <br>
  * Last modified: 12/8/15 <br>
  *
  * <hr>
  * Notes on specifications, special algorithms, and assumptions:
  *
  *
  * <hr>
  *   @return String returns the customer's phone number
  */
  public String getPhoneNumber()
  {
    return phoneNumber; //Return customer's phone number
  }//end getPhoneNumber

  /**
  * Method Name: getAddress <br>
  * Method Purpose: get the customer's address <br>
  *
  * <hr>
  * Date created: 12/3/15 <br>
  * Last modified: 12/8/15 <br>
  *
  * <hr>
  * Notes on specifications, special algorithms, and assumptions:
  *
  *
  * <hr>
  *   @return String returns the customer's address
  */
  public String getAddress()
  {
    return address; //Return customer's address
  }//end getAddress

  /**
  * Method Name: getEMail <br>
  * Method Purpose: get the customer's email <br>
  *
  * <hr>
  * Date created: 12/3/15 <br>
  * Last modified: 12/8/15 <br>
  *
  * <hr>
  * Notes on specifications, special algorithms, and assumptions:
  *
  *
  * <hr>
  *   @return String returns the customer's email
  */
  public String getEMail()
  {
    return email; //Return customer's email
  }//end getEMail

  /**
  * Method Name: getSelectedRoom <br>
  * Method Purpose: get the customer's selected room <br>
  *
  * <hr>
  * Date created: 12/3/15 <br>
  * Last modified: 12/8/15 <br>
  *
  * <hr>
  * Notes on specifications, special algorithms, and assumptions:
  *
  *
  * <hr>
  *   @return String returns the customer's selected room
  */
  public String getSelectedRoom()
  {
    return selectedRoom; //Return the room the user selected
  }//end getSelectedRoom

  /**
  * Method Name: getRoomCost <br>
  * Method Purpose: get the customer's room cost <br>
  *
  * <hr>
  * Date created: 12/3/15 <br>
  * Last modified: 12/8/15 <br>
  *
  * <hr>
  * Notes on specifications, special algorithms, and assumptions:
  *
  *
  * <hr>
  *   @return double returns the customer's room cost
  */
  public double getRoomCost()
  {
    return roomCost; //Return the cost of the room the user selected
  }//end getRoomCost

  /**
  * Method Name: calcSubTotal <br>
  * Method Purpose: calculate the subtotal of the bill <br>
  *
  * <hr>
  * Date created: 12/3/15 <br>
  * Last modified: 12/8/15 <br>
  *
  * <hr>
  * Notes on specifications, special algorithms, and assumptions:
  *
  *
  * <hr>
  *   @return void
  */
  public void calcSubTotal()
  {
    //Calculate subtotal by multiplying nights staying by the cost of the room
    subTotal = nightsStaying * roomCost;
  }//end calcSubTotal

  /**
  * Method Name: calcTotalBill <br>
  * Method Purpose: calculate the total of the bill <br>
  *
  * <hr>
  * Date created: 12/3/15 <br>
  * Last modified: 12/8/15 <br>
  *
  * <hr>
  * Notes on specifications, special algorithms, and assumptions:
  *
  *
  * <hr>
  *   @return void
  */
  public void calcTotalBill()
  {
    //Calculate the total bill by multiplying subtotal by tax * subtotal
    billTotal =  subTotal + (subTotal * TAX_RATE);
  }//end calcTotalBill

  /**
  * Method Name: roomsMenu <br>
  * Method Purpose: create a menu of the rooms and costs <br>
  *
  * <hr>
  * Date created: 12/3/15 <br>
  * Last modified: 12/8/15 <br>
  *
  * <hr>
  * Notes on specifications, special algorithms, and assumptions:
  *
  *
  * <hr>
  *   @return String returns the menu
  */
  public String roomsMenu()
  {
    String str = "1. Blue Bird  |  $190/night  \n"
              +  "2. Mallard    |  $280/night  \n"
              +  "3. Eagle      |  $335/night  \n"
              +  "4. Osprey     |  $325/night  \n"
              +  "5. Hawk       |  $325/night  \n"
              +  "6. Sparrow    |  $325/night  \n"
              +  "7. Wood Duck  |  $325/night  \n";
    return str;
  }//end roomsMenu

  /**
  * Method Name: toString <br>
  * Method Purpose: converts the customer information to a String<br>
  *
  * <hr>
  * Date created: 12/3/15 <br>
  * Last modified: 12/8/15 <br>
  *
  * <hr>
  * Notes on specifications, special algorithms, and assumptions:
  *
  * <hr>
  *   @return String returns the customer's information
  */
  public String toString()
  {
    String str = "  Customer name: " + customerName + "\n"
              +  "   Phone Number: " + phoneNumber + "\n"
              +  "Billing address: " + address + "\n"
              +  "         E-mail: " + email + "\n"
              +  "  Selected Room: " + selectedRoom + "\n"
              +  "  Bill subTotal: $" + subTotal + "\n"
              +  "     Bill Total: $" + billTotal + " (Tax Applied)";
    return str;
  }//end toString

  /**
  * Method Name: equals <br>
  * Method Purpose: check to see if 2 objects are the same <br>
  *
  * <hr>
  * Date created: 11/16/15 <br>
  * Last modified: 11/16/15 <br>
  *
  * <hr>
  * Notes on specifications, special algorithms, and assumptions:
  *
  * <hr>
  *   @param original The original object is passed in
  *   @return boolean
  */
  public boolean equals(Customer original)
  {
    boolean same = false;
    if(customerName.equals(original.customerName) &&
        phoneNumber.equals(original.phoneNumber) && address.equals(original.address)
        && email == original.email)
    {
      same = true;
    }
    return same;
  }//end equals
}
