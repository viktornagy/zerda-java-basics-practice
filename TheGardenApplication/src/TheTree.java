/**
 * Created by Viktor on 2016.11.21..
 */
public class TheTree {

    int waterAmount=0;
    String color=null;

    public TheTree(String color, int waterAmount) {
        this.color=color;
        this.waterAmount=waterAmount;
    }

    public int watering(int water){
        return this.waterAmount+=0.4*water;

    }

}
