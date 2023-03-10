package Pokemon;

public class Squirtle extends Water{
    private String sType;
    private boolean small;
    public Squirtle(){
        super("Water", 5,10000, "Kyle");
        sType = "Null";
    }
    public Squirtle(String t, int h, int d, String n){
        super(t, h, d, n);
        sType = "Null";
    }

    public void waterGun(){
        System.out.print("Squirtle uses water gun for " + damage + " damage");
    }
    public void health(){
        System.out.print("Squirtle has " + health + " HP");
    }
    public String getType(){
        return (type + " " + sType);
    }
    public void setType(String t, String st){
        type = t;
        sType = st;
    }
    public void waterFall(){
        System.out.print("Charazard used WaterFall!");
    }
    public void setSmall(Boolean s){
        this.small = s;
    }
    public Boolean getSmall(){
        return (small);
    }
}