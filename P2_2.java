import java.util.Date;
class P2_2
    {
        private int id;
        private double balance;
        private static double annualInterestRate;
        private Date dateCreated = new Date();
        public P2_2()
        {
            id=0;
            balance=500;
            annualInterestRate=7;
        }
        public P2_2(int newId, double newBalance)
        {
            id=newId;
            balance=newBalance;
            annualInterestRate=0.07;
        }
        public P2_2(int newId, double newBalance, double newAnnualInterestRate)
        {
            id=newId;
            balance=newBalance;
            annualInterestRate=newAnnualInterestRate;
        }

        public int getId()
        {
            return id;
        }
        public double getBalance()
        {
            return balance;
        }
        public double getAnnualInterestRate()
        {
            return annualInterestRate;
        }
        public void setId(int newId)
        {
            id=newId;
        }
        public void setBalance(int newBalance)
        {
            balance=newBalance;
        }
        public void setAnnualInterestRate(int newAnnualInterestRate)
        {
            annualInterestRate =newAnnualInterestRate;
        }

        double getMonthlyInterestRate()
        {
            return(annualInterestRate/12);
        }
        double getMonthlyInterest()
        {
            return(balance*(annualInterestRate/12));
        }
        public java.util.Date getDate()
        {
            return this.dateCreated;
        }
        double Withdraw(double amount)
        {
            if(balance-amount < 0)
            {}
            else
            {
                balance-=amount;
            }
            return balance;
        }
        double Deposit(double amount)
        {
            return balance+=amount;
        }
    }


