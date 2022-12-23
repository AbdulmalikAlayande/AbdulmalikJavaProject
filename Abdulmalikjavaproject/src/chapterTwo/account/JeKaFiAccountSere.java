package chapterTwo.account;

public class JeKaFiAccountSere {
    public static void main(String[] args) {

        Account customerAccount = new Account();
        System.out.println(customerAccount.getAccountName());
        System.out.println(customerAccount.getAccountNumber());
        System.out.println(customerAccount.getBalance());
        System.out.println(customerAccount.getPin());

        System.out.println();

        Account customerAccount2 = new Account("Abdulmalik", "0092206389");
        System.out.println(customerAccount2.getAccountName());
        System.out.println(customerAccount2.getAccountNumber());
        System.out.println(customerAccount2.getBalance());
        System.out.println(customerAccount2.getPin());

        System.out.println();

        Account customerAccount3 = new Account("Abdulmalik", "0092206389", 30000);
        System.out.println(customerAccount3.getAccountName());
        System.out.println(customerAccount3.getAccountNumber());
        System.out.println(customerAccount3.getBalance());
        System.out.println(customerAccount3.getPin());

        System.out.println();

        Account customerAccount4 = new Account("Abdulmalik", "0092206389", 30000, "2022");
        System.out.println(customerAccount4.getAccountName());
        System.out.println(customerAccount4.getAccountNumber());
        System.out.println(customerAccount4.getBalance());
        System.out.println(customerAccount4.getPin());



    }
}
