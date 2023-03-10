package Pokemon;

public class Water extends Pokemon{
    String weak = "Grass";
    Boolean canSurf = true;
    public Water(String t, int d, int h, String n){
        super(t, d, h, n);
        type = t;
    }
    public String getWeakness(){
        return weak;
    }
    public void surf(){
        System.out.print("you surf on your pokemon");
    }
    public Boolean canSurf(){
        return canSurf;
    }
}
