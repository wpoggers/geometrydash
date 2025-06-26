public class Cards {
    private String suite;
    private String power;
    private int poweri;
    public Cards(String suite, int power) {
        this.suite = suite;
        this.poweri=power;
        if(power<11 && power>1) {
            this.power = ""+power;
        } else if(power == 11) {
            this.power = "Jack";
        } else if(power == 12) {
            this.power = "Queen";
        } else if(power == 13) {
            this.power = "King";
        } else if(power == 1) {
            this.power = "Ace";
        }
    }
    public void setSuite(String suite) {
        this.suite = suite;
    }
    public void setPower(int power) {
        if(power<11 && power>1) {
            this.power = ""+power;
        } else if(power == 11) {
            this.power = "Jack";
        } else if(power == 12) {
            this.power = "Queen";
        } else if(power == 13) {
            this.power = "King";
        } else if(power == 1) {
            this.power = "Ace";
        }  
    }
    //getters
    public String getSuite() {return this.suite;}
    public String getPower() {return this.power;}
    public int getPowerAsInt() {return this.poweri;}
    public String toString() {
        return this.suite + ", " +this.power;
    }
}
