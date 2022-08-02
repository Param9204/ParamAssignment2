public class P2_4 {
    private int id=0;
    double balance=500,annualInterest=7,amount;
    String dateCreated;
    P2_4()
    {
        id=0;
        balance=50000;
        annualInterest=7;
    }
    P2_4(int i,double bal)
    {
        id=i;
        balance=bal;
    }
    void setdata(int i,double bal,double aInt,String dt)
    {
        id=i;
        balance=bal;
        annualInterest=aInt;
        dateCreated=dt;
    }
    int getId()
    {
        return id;
    }
    double getBal()
    {
        return balance;
    }
    double getAnn()
    {
        return annualInterest;
    }
    double getMonthlyInterestRate()
    {
        return (annualInterest*100)/12;
    }
    double getMonthlyInterest()
    {
        return balance*(annualInterest*100)/12;
    }
    String getDt()
    {
        return dateCreated;
    }
    void withdraw(double amount)
    {
        balance-=amount;
        if(balance>0)
            System.out.println("The balance left after withdrawal of Rs."+amount+" is Rs."+balance);
        else
            System.out.println("Withdrawal of Rs."+amount+" is not possible!!");
    }
    void deposit(double amount)
    {
        balance+=amount;
        System.out.println("The balance left after deposit of Rs."+amount+" is Rs."+balance);
    }
}
class SavingAccount extends P2_4
{
    SavingAccount(double a)
    {
        amount=a;
        balance-=amount;
    }
    public String toString()
    {
        if(balance>=3000)
        {
            return "The balance left after withdrawal of Rs."+amount+" is Rs. "+balance;
        }
        else
        {
            return "Beyond1 Over Draft Limit Not Possible!!\nMinimum balance of Rs. 3000 is required.";
        }
    }
}
class CheckingAccount extends P2_4
{
    CheckingAccount(double am)
    {
        amount = am;
        balance-=amount;
    }
    public String toString()
    {
        System.out.println("Withdrawal Successful!!");
        return "Now the balance left is Rs."+balance+" after the withdrawal of Rs."+amount;
    }
}
