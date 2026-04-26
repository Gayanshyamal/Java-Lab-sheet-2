public class Account {
    String ownerName;
    double balance;

    //Parameterized  constructor
    public Account(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    //No argument constructor

    public Account() {
        ownerName = "Unknown";
        balance = 0;
    }

    //deposit method
    public void add(double deposit){
        balance = balance + deposit ;
    }

    //withdraw method
    public void deduct(double withdraw){
        balance = balance - withdraw;
    }

    //setter and getter

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
