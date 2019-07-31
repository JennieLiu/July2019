//package main.java;

public class Main {

    public static void as1 (int a, int b){
        if(a < b){
            for(int i = a+1; i<b; i++){
                System.out.print(i+",");
            }
        }
    }

    public static void as2(int a, int b){
        int sum = 0;
        if(a < b){
            for(int i = a+1; i<b; i++){
                sum+=i;
            }
        }
        System.out.print(sum);
    }

    public static void main(String[] args)
    {
        ///////////////////////////////DAY1
        // Exe1
        int a = 500;
        short b = 10;
        byte c = 30;
        long d = 70000 + 15*a + b;
        System.out.println(d);
        // Exe2
        double pd = 100;
        double kg = 0.453592370 * pd;
        System.out.println(kg);
        // Exe3
        double e = 20;
        double f = 80;
        double g = (e+f) *25;
        System.out.println(g);
        System.out.println(g % 3);
        if(g<=20){
            System.out.println("Total was over the limit");
        }
        // Exe4
        char cc = 'A';
        switch(cc){
            case 'A' :
                System.out.println("Apple");
                break;
            case 'B' :
                System.out.println("Banana");
                break;
            case 'C' :
                System.out.println("Cherries");
                break;
            case 'D' :
                System.out.println("Dragon Fruit");
                break;
            case 'F' :
                System.out.println("ElderBerry");
                break;
            default :
                System.out.println("Not in fruit basket");
        }
        // Assignments
        as1(6,12);
        as2(6,12);
        //as 3 in other file
        Employee john = new Employee("John", "EY", "NYC");
        System.out.println("");
        System.out.println(john.sayHello());

        /////////////////////////DAY2
        Account account = new Account();
        // Change this line to chose your service
        int input = 1;
        switch(input){
            case 1 :
                System.out.println("Account Balance:");
                System.out.println("$"+account.getBalance());
                break;
            case 2:
                System.out.println("Deposit Money:");
                // change num there
                account.deposit(5.5);
                break;
            case 3:
                System.out.println("Withdraw Money");
                // change num there
                account.withdraw(5.00);
                break;
            case 4:
                System.out.println("Exit");
                break;
            default :
                System.out.println("Please type in current service name");
        }

    }
}
