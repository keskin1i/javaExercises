package throwDemo;

public class Main {
    public static void main(String[] args) {
         AccountMenager accountMenager = new AccountMenager();
         accountMenager.deposit(1000);
        System.out.println(accountMenager.getBalance());
        try {
            accountMenager.withdraw(900);
        } catch (BalanceInsufficientException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(accountMenager.getBalance());
        try {
            accountMenager.withdraw(200);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(accountMenager.getBalance());

    }
}
