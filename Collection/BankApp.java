class BankAccount {
    private double balance;

    public BankAccount(double openingBalance) {
        balance = openingBalance;
    }
    public void deposit(double amount){
        balance = balance + amount;
    }
    public void withdrawal(double amount){
        balance = balance - amount;
    }

    public void display(){
        System.out.println("balance="+balance);
    }

}
class BankApp{
    public static void main(String[] args){
        BankAccount ba1 = new BankAccount(100.00);
        System.out.println("Before Transaction,");
        ba1.display();
        System.out.println("After deposit");
        ba1.deposit(12.00);
        ba1.display();
        System.out.println("After witdrawal");
        ba1.withdrawal(13.00);
        ba1.display();
    }
}
