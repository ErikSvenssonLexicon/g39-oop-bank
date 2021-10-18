package se.lexicon;


import se.lexicon.models.BankAccount;
import se.lexicon.models.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        BankAccount bankAccount = new BankAccount(
                500,
                new Customer("Mohamad",
                        "mohamad@gmail.com",
                        "43423423"),
                10000
        );

        BankAccount bankAccount2 = new BankAccount(
                0,
                new Customer("Erik",
                        "erik@gmail.com",
                        "4234234243"),
                1000
        );

        try{
            System.out.println(bankAccount.withdraw(500));
            System.out.println(bankAccount.getBalance());
            System.out.println(bankAccount.getCustomer().getCustomerSummary());
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }



    }
}
