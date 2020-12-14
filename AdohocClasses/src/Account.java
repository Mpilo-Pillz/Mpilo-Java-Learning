public class Account {
    private String name;
    public int accountBalance = 90;

    public String setName(String name) {
        return this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int setAccountBalance(int money) {
        if (money > 100) {
            System.out.println("Nah fam you cant take my money");
        } else if (money > this.accountBalance) {
            System.out.println("I ont have that aount right now gonna ay you wheni get paid");
        }
        return this.accountBalance = money;
    }

    public int getAccountBalance() {
        return this.accountBalance;
    }


}
