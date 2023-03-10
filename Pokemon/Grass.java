package Pokemon;

public class Grass extends Pokemon 
{
    String weak = "Fire";
    Boolean canGrow = true;
    public Grass(String t, int d, int h, String n){
        super(t, d, h, n);
        
    }
    public String getWeakness(){
        return weak;
    }
    public void eat(){
        System.out.print("You eat a peice of your pokemon...");
    }
    
    public Boolean canGrow(){
        return canGrow;
    }
}
