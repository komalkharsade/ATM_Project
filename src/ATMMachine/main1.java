package ATMMachine;

import java.util.Scanner;

class ATM{
    float Balance;
    int PIN = 5674;

    public void checkpin(){
        System.out.println("********* Welcome To ATM *********");
        System.out.println("Enter Your Pin:");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if(enteredpin==PIN){
            menu();
        }
        else{
            System.out.println("Enter a valid pin");
            menu();
        }

    }

    public void menu(){
        System.out.println("Enter Your Choice:");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. withdraw Money");
        System.out.println("3. Deposite Money");
        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt == 1){
            checkBalance();
        }
        else if(opt == 2){
            withdrawMoney();
        }
        else if(opt == 3){
            depositeMoney();
        }
        else if(opt == 4){
            return;
        }
        else{
            System.out.println("Enter a valid choice:");
        }

    }
    public void checkBalance(){
        System.out.println("Balance:" + Balance);
        menu();
    }

    public void withdrawMoney(){
        System.out.println("Enter Amount To Withdraw");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficient Balance");

        }
        else{
            Balance = Balance - amount;
            System.out.println("Money Withdrawl Successfully");
        }
        menu();


    }
    public void depositeMoney(){
        System.out.println("Enter the amount:");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposited Successfully");
        menu();
    }
}

