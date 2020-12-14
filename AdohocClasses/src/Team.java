public class Team {
    private String name = "no team";
    public String teamCaptain = "no captain";
    public String goalScorer = "no one";
    private int points = 0;
    public int maximumNmberOfplayers = 11;

    public Team(String captain, String scorer) {
       this.teamCaptain = captain;
       this.goalScorer = scorer;
    }
    public String setName(String name) {
        return this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int setPoints(int points) {
        return this.points = points;
    }

    public int getPoints() {
        return this.points;
    }

    public void addPoints(int point) {
        this.points += point;
//        this.points = this.points + 1;
    }

    public void  subtractPoints(int point) {
        this.points = this.points - 1;
//        this.points -= point;
    }


}
