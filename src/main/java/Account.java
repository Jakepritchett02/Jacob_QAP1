public class Account {
    private String ID;
            private String name;
            private int balance;

    public Account(String ID, String name, int balance) {
        this.ID = ID;
        this.name = name;
        this.balance = balance;
    }



    public String getID() {
        return ID;
    }


    public String getName() {
        return name;
    }



    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int credit(int amount ) {
        balance += amount;
                return balance;
    }

    public int debit(int amount){
        if (amount <= balance){
            balance -= amount;
        }
          else  {
            System.out.println("Exceeded amount balance" );}
        return balance;
    }
    public void transferTo(Account sender,Account receiver, int amount   ){
        sender.debit(amount);
        receiver.credit(amount);
    }
    @Override
    public String toString() {
        return "Account{" +
                "ID= " + ID + '\'' +
                ", Name= " + name + '\'' +
                ", balance= " + balance +
                '}';
    }
}


