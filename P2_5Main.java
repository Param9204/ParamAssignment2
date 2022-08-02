public class P2_5Main {
    public static void main(String[] args) {
        P2_5 p1=new P2_5();
        P2_5 sc1= new P2_5();
        P2_5 sc2=new P2_5();
        P2_5 sc3 =new P2_5();

        System.out.println("The average of the numbers is :"+sc1.getaverage(2));    //Make object with pass the argumnet
        System.out.println("The average of the numbers is :"+sc2.getaverage(2,3)); //Make object with pass the argumnet
        System.out.println("The average of the numbers is :"+sc3.getaverage(2,3,5));  //Make object with pass the argumnet
    }
}
