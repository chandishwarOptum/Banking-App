package Banking2;

interface PrincipalBank{
    long getBalance();
    void withdraw(long amount);
    void deposit(long amount);
    void showAccount();
    boolean search(Long acc_no);
}

