package Pokemon;

public class Fire extends Pokemon{
    String weak = "Water";
    Boolean canBurn = true;
    public Fire(String t, int d, int h, String n){
        super(t, d, h, n);
        
    }
    public String getWeakness(){
        return weak;
    }
    public void heater(){
        System.out.print("You use your pokemon as a heater...");
    }
    public Boolean canBurn(){
        return canBurn;
    }
}
