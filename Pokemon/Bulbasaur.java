package Pokemon;

public class Bulbasaur extends Grass{
    private String sType;
    private Boolean shiny;
    public Bulbasaur(){
        super("Grass", 10000,5, "Bob");
        sType = "Posion";
        shiny = false;
    }
    public Bulbasaur(String t, int h, int d, String n){
        super(t, h, d, n);
        sType = "Posion";
        shiny = false;
    }

    public void vineWhip(){
        System.out.print("Bulbasaur uses vine whip for " + damage + " damage");
    }
    public void health(){
        System.out.print("Bulbasaur has " + health + " HP");
    }
    public String getType(){
        return (type + " " + sType);
    }
    public void setType(String t, String st){
        type = t;
        sType = st;
    }
    public void rockSmash(){
        System.out.print("Charazard used Rock Smash!");
    }
    public void setShiny(Boolean s){
        this.shiny = s;
    }
    public Boolean getShiny(){
        return (shiny);
    }
}