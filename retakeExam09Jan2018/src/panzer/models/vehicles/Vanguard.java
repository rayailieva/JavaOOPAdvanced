package panzer.models.vehicles;

import panzer.contracts.Part;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Vanguard extends VehicleImpl {
    public Vanguard(String model, double weight, BigDecimal price, int attack, int defense, int hitPoints) {
        super(model, weight * 2.00, price, (int) (attack * 0.75), (int) (defense * 1.50), (int) (hitPoints * 1.75));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vanguard - ").append(super.getModel() + "\n");
        sb.append(String.format("Total Weight: %.3f", super.getTotalWeight()) + "\n");
        sb.append(String.format("Total Price: %.3f", super.getTotalPrice()) + "\n");
        sb.append("Attack: " + super.getTotalAttack() + "\n");
        sb.append("Defense: " + super.getTotalDefense() + "\n");
        sb.append("HitPoints: " + super.getTotalHitPoints() + "\n");

        List<Part> toJoin = new ArrayList<>((Collection<? extends Part>) super.getParts());
        if(toJoin.size()==0){
            sb.append("Parts: None");
        }else{
            List<String> toJoin2 = new ArrayList<>();
            for (int i = 0; i < toJoin.size(); i++) {
                toJoin2.add(toJoin.get(i).getModel());
            }
            sb.append("Parts: "+String.join(", ",toJoin2));
        }
        return sb.toString();
    }
}
