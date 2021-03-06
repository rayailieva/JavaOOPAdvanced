package panzer.models.vehicles;

import panzer.contracts.Part;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Revenger extends BaseVehicle {
    public Revenger(String model, double weight, BigDecimal price, int attack, int defense, int hitpoins) {
        super(model, weight, price.multiply(BigDecimal.valueOf(1.50)), (int) (attack * 2.50), (int) (defense * 0.50), (int) (hitpoins * 0.50));
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Revenger - " + super.getModel() + "\n");
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
