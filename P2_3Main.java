import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class P2_3Main {
    public static void main(String[] args)
    {
        ArrayList<P2_3> arr = new ArrayList<P2_3>();
        Scanner sc = new Scanner(System.in);
        String str;
        int op;
        P2_3 ac = null;
        P2_3 a = new P2_3(null);
        arr.add(new P2_3("AC001"));
        arr.add(new P2_3("AC002"));
        arr.add(new P2_3("AC003"));
        arr.add(new P2_3("AC004"));
        arr.add(new P2_3("AC005"));
        arr.add(new P2_3("AC006"));
        arr.add(new P2_3("AC007"));
        arr.add(new P2_3("AC008"));
        arr.add(new P2_3("AC009"));
        arr.add(new P2_3("AC010"));
        System.out.print("Enter your ID :- ");
        str = sc.next();
        Iterator itr = arr.iterator();
        while(itr.hasNext())
        {
            a = (P2_3) itr.next();
            if(str.equals(a.id))
                ac = a;

        }
        if(ac == null)
        {
            System.out.println("Invalid ID");
            System.exit(0);
        }
        else
        {
            do
            {

                op = sc.nextInt();
                switch(op)
                {
                    case 1:
                        ac.BalanceInq();
                        break;
                    case 2:
                        ac.withdraw();
                        break;
                    case 3:
                        ac.deposit();
                        break;
                    case 4:
                        ac.moneyTransfer(arr);
                        break;
                    case 5:
                        ac.Create(arr);
                        break;
                    case 6:
                        ac.delete(arr);
                        break;
                    case 0:
                        System.out.println("Thank you");
                        break;
                    default:
                        System.out.println("Invalid input");
                }
            }while(op != 0);
        }
    }
}