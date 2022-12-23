package chapterTwo.account;

public class UBABankAccountTest {
    public static void main(String[] args) {
        UBABankAccount customer1 = new UBABankAccount();
        System.out.println(customer1.getAccountName());
        System.out.println(customer1.getBankName());
        System.out.println(customer1.getAccountNumber());
        System.out.println(customer1.getAccountBalance());
        System.out.println(customer1.getPin());
        System.out.println();


        UBABankAccount customer2 = new UBABankAccount("Abdulmalik");
        System.out.println(customer2.getAccountName());
        System.out.println(customer2.getBankName());
        System.out.println(customer2.getAccountNumber());
        System.out.println(customer2.getAccountBalance());
        System.out.println(customer2.getPin());

        System.out.println();

        UBABankAccount customer3 = new UBABankAccount("Bolade","UBA");
        System.out.println(customer3.getAccountName());
        System.out.println(customer3.getBankName());
        System.out.println(customer3.getAccountNumber());
        System.out.println(customer3.getAccountBalance());
        System.out.println(customer3.getPin());
        System.out.println();

        UBABankAccount customer4 = new UBABankAccount("Ayanniyi", "UBA","2210785731");
        System.out.println(customer4.getAccountName());
        System.out.println(customer4.getBankName());
        System.out.println(customer4.getAccountNumber());
        System.out.println(customer4.getAccountBalance());
        System.out.println(customer4.getPin());
        System.out.println();

        UBABankAccount customer5 = new UBABankAccount("Alayande","Palmpay","7036174617",40000000);
        System.out.println(customer5.getAccountName());
        System.out.println(customer5.getBankName());
        System.out.println(customer5.getAccountNumber());
        System.out.println(customer5.getAccountBalance());
        System.out.println(customer5.getPin());
        System.out.println();

        UBABankAccount customer6 = new UBABankAccount("Alabi","UBA","2119473092",50000000,"1999");
        System.out.println(customer6.getAccountName());
        System.out.println(customer6.getBankName());
        System.out.println(customer6.getAccountNumber());
        System.out.println(customer6.getAccountBalance());
        System.out.println(customer6.getPin());
    }
}
