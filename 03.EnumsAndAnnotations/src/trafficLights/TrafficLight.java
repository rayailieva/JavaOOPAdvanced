package trafficLights;

import java.util.List;

import static trafficLights.Light.GREEN;
import static trafficLights.Light.RED;
import static trafficLights.Light.YELLOW;

public class TrafficLight {
    private List<Light> lights;

    public TrafficLight(List<Light> lights) {
        this.lights = lights;
    }

    public void change(){
        Light[] lightvalues = Light.values();

        for(int i = 0; i < lights.size(); i++){
           switch (lightvalues[i]){
               case RED:
                    lightvalues[i] = GREEN;
                   break;
               case GREEN:
                   lightvalues[i] = YELLOW;
                   break;
               case YELLOW:
                   lightvalues[i] = RED;
                   break;
           }
        }
    }

    @Override
    public String toString() {
        return String.join(" ", (CharSequence) lights);
    }
}
