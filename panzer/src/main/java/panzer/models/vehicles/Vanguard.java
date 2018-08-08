package panzer.models.vehicles;

import panzer.contracts.Part;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Vanguard extends BaseVehicle {
    public Vanguard(String model, double weight, BigDecimal price, int attack, int defense, int hitpoins) {
        super(model, weight * 2.00, price, (int) (attack * 0.75), (int) (defense * 0.50), (int) (hitpoins * 1.75));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Vanguard - %s\n", super.getModel()));
        sb.append(String.format("Total Weight: %.3f\n", super.getTotalWeight()));
        sb.append(String.format("Total Price: %.3f\n", super.getTotalPrice()));
        sb.append(String.format("Attack: %d\n", super.getTotalAttack()));
        sb.append(String.format("Defense: %d\n", super.getTotalDefense()));
        sb.append(String.format("HitPoints: %d\n", super.getTotalHitPoints()));
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
