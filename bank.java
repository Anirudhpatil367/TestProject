import java.util.Scanner;

class bank
{
    double withdraw_amt;
    double deposit_amt;
    double view_balance=20000.00;
    void view_balance()
    {
        System.out.println("balance is :"+view_balance);

    }
    void welcome()
    {
        System.out.println("welcome to mashreq bank");
    }
    void witdraw()
    {
        if (withdraw_amt<view_balance)
        {
            view_balance=view_balance-withdraw_amt;
            System.out.println("the amount of "+withdraw_amt+" is succesfull and remaining balance is "+view_balance);
        }
        else
        {
            System.out.println("insufficient funds");
        }
    }

    void deposit()
    {
        view_balance=deposit_amt+view_balance;
        System.out.println();
        System.out.println("amount successfully deposited and balance is:"+view_balance);
    }
}
class MainClass26
{
    public static void main(String[] args)
    {
        System.out.println("main method started");
        Scanner scn1=new Scanner(System.in);
        bank b1=new bank();

        b1.welcome();
        System.out.println("current balance is "+b1.view_balance);
        System.out.println();        
        
        System.out.println("enter the amount to deposit");
        double depo=scn1.nextDouble();
        b1.deposit_amt=depo;
        b1.deposit();
        b1.view_balance();
        System.out.println();
        System.out.println("enter the amount to withdraw");
        double with=scn1.nextDouble();
        b1.withdraw_amt=with;
        b1.witdraw();
        
        System.out.println();     
        //b1.view_balance();
        //System.out.println("balance is :"+b1.view_balance);
        
        
        
        System.out.println("main method ended");
        
    }
}


