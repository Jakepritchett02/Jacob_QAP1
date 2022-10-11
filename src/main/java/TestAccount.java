public class TestAccount {
    public static  void main (String[] args){
       Account account1  = new Account("12345", "Jacob", 5000 );
               Account account2 = new Account("12346", "Bob", 4000);
        System.out.println(account1);
        System.out.println(account2);

        account1.transferTo(account1,account2,1000);
        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
    }
}
