class Theatre
{


public static void main(String[] args)

{
  Theatre raja = new Theatre();
int amount =200;
int balance =raja.bookTicket(amount);
System.out.println("After booking ticket" +balance);
}


 int bookTicket(int amount)
{

int ticketPrice = 120;
int balance = amount -ticketPrice;
return balance;

}

}
