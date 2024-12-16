package next.catapi.domain;

import java.util.Map;

public class Cat {
    private final Map<String, Object> objectmapData;

    public Cat(Map<String, Object> objectmapData) {
        this.objectmapData = objectmapData;
    }

    public String getId() {
        return objectmapData.get("id").toString();
    }

    public String getName() {
        return this.objectmapData.get("name").toString();
    }

    public int getWeightInKgs() {
        var weightRange = ((Map<String, Object>) this.objectmapData.get("weight")).get("metric").toString();
        var splittedWeightRange = weightRange.split(" - ");
        return (Integer.parseInt(splittedWeightRange[0]) + Integer.parseInt(splittedWeightRange[1])) / 2;
    }

    public int getLifeSpan() {
        var lifeSpanRange =  this.objectmapData.get("life_span").toString();
        var splittedLifeSpanRange = lifeSpanRange.split(" ");
        return (Integer.parseInt(splittedLifeSpanRange[0]) + Integer.parseInt(splittedLifeSpanRange[2]))/ 2;
    }

    public int getIntelligence() {
        return Integer.parseInt(this.objectmapData.get("intelligence").toString());
    }

}
