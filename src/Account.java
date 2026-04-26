public class Account {
    String ownerName;
    double balance;

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
