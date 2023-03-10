package Pokemon;

public class Charazard extends Fire{
    private String sType;
    private boolean big;
    public Charazard(){
        super("Fire", 100, 100, "Steven");
        sType = "Flying";
        big = true;
    }
    public Charazard(String t, int h, int d, String n){
        super(t, h, d, n);
        sType = "Flying";
        big = true;
    }

    public void fireBreath(){
        System.out.print("Charazard uses Fire Breath for " + damage + " damage");
    }
    public void Fly(){
        System.out.print("Charazard used Fly!");
    }
    public void health(){
        System.out.print("Charazard has " + health + " HP");
    }
    public String getType(){
        return (type + " " + sType);
    }
    public void setType(String t, String st){
        type = t;
        sType = st;
    }
    public void setBig(Boolean s){
        this.big = s;
    }
    public Boolean getBig(){
        return (big);
    }
}

