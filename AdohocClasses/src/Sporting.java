public class Sporting {
    public static void main(String arg[]) {
        Account account = new Account();
        account.setName("account");
        System.out.println(account.getName());

        account.setAccountBalance(20);
        System.out.println(account.getAccountBalance());
        account.accountBalance = 0;

        Team barcelona = new Team("Lionel Messi", "Luis Suarez");
        barcelona.setName("barcelona");
        barcelona.getName();



        System.out.println(barcelona.getName() + " team captian is " + barcelona.teamCaptain);
        System.out.println(barcelona.getName() + " goal was scored by " + barcelona.goalScorer);

        Team liverpool = new Team("Roberto Frimino", "Sadio Mane");
        liverpool.setName("Liverpool");


        System.out.println(liverpool.getName() + " team captian is " + liverpool.teamCaptain);
        System.out.println(liverpool.getName() + " goal was scored by " + liverpool.goalScorer);

        Team juventus = new Team("Christiano Ronaldo", "Douglas Costa");
        juventus.setName("Juventus");
        juventus.setPoints(33);
        juventus.addPoints(4);
        System.out.println("Juvetus has " + juventus.getPoints());
        juventus.subtractPoints(1);
        System.out.println("Juvetus has " + juventus.getPoints());
//        juventus.setPoints(juventus.getPoints());
        System.out.println("Juvetus has " + juventus.getPoints());


        System.out.println(juventus.getName() + " team captian is " + juventus.teamCaptain);
        System.out.println(juventus.getName() + " goal was scored by " + juventus.goalScorer);

        FiveAside fiveAside = new FiveAside("Steven Gerard", "Ronaldihno");
        fiveAside.setName("My Five Players");

        System.out.println(fiveAside.getName() + " team captian is " + fiveAside.teamCaptain);
        System.out.println(fiveAside.getName() + " goal was scored by " + fiveAside.goalScorer);

    }
}
