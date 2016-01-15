/**
 * Created by geoff_000 on 10/01/2016.
 */
/**1. What are the reasons for using generics here?
 *      provides the same set of behaviours to different classes
 *
 *  2. What are the benefits?
 *      less code required; more versatile
*/




public class Driver {
    public static void main(String[] args){

        Storage<BankAccount> aStorage = new Storage<BankAccount>();
        Storage<String> sStorage = new Storage<String>();
        Class<BankAccount> baCls = BankAccount.class;

            //Object myAccount = baCls.newInstance() creates a new instance of BankAccount as an Object which
            // creates an error when setValue(myAccount) invoked since aStorage was initialzed as Storage<BankAccount>
            // therefore cast myAccount as a BankAccount.

        try {
            BankAccount myAccount = baCls.newInstance();
            aStorage.setValue(myAccount);
// Deposit
            myAccount.deposit(15);
        }
        catch ( InstantiationException e ) {
// ...
        }
        catch ( IllegalAccessException e ) {
// ...
        }

        System.out.println( aStorage.getValue().showBalance() );
        if( aStorage.getClass() == sStorage.getClass() ) {
            System.out.println( "EQUAL" );
        } else {
            System.out.println( "NOT EQUAL" );
        }

    }
}
