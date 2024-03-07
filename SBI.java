package Banking2;


class SBI implements PrincipalBank {

    String name;
    Long accno;
    String acc_type;
    long balance;
    String region;

    SBI(String name, String acc_type, long balance, String region){
        this.name = name;
        this.accno = accno;
        this.acc_type = acc_type;
        this.balance = balance;
        this.accno = (long) (Math.random() * 100000);
        this.region = region;
    };

    public long getBalance(){
        return balance;
    }

    public void withdraw(long amount){
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println("Your balance is less than " + amount + "\tTransaction failed...!!" );
        }

    }

    public void deposit(long amount){
        balance = balance + amount;

    }

    public void showAccount(){
        System.out.println("\n");
        System.out.println("SBI Bank account");
        System.out.println("Name of account holder: " + name);
        System.out.println("Account no.: " + accno);
        System.out.println("Account type: " + acc_type);
        System.out.println("Balance: " + balance);
        System.out.println("Region: " + region);


    }

    public boolean search(Long ac_no) {
        if (accno.equals(ac_no)) {
            showAccount();
            return (true);
        }
        return (false);
    }

}

