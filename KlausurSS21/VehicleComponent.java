package KlausurSS21;

public abstract class VehicleComponent {
    protected int cost;
    protected int hitpoints;
    protected String name;

    public VehicleComponent(int cost,int hitpoints,String name){
        this.cost=cost;
        this.hitpoints=hitpoints;
        this.name=name;
    }
}
