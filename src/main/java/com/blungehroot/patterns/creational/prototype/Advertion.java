package com.blungehroot.patterns.creational.prototype;

public class Advertion implements Copyable{
    private int id;
    private String advertiseName;
    private String sourcePlan;

    public Advertion(int id, String advertiseName, String sourcePlan) {
        this.id = id;
        this.advertiseName = advertiseName;
        this.sourcePlan = sourcePlan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdvertiseName() {
        return advertiseName;
    }

    public void setAdvertiseName(String advertiseName) {
        this.advertiseName = advertiseName;
    }

    public String getSourcePlan() {
        return sourcePlan;
    }

    public void setSourcePlan(String sourcePlan) {
        this.sourcePlan = sourcePlan;
    }

    @Override
    public Object copy() {
        Advertion copy = new Advertion(id, advertiseName, sourcePlan);
        return copy;
    }

    @Override
    public String toString() {
        return "Advertion{" +
                "id=" + id +
                ", advertiseName='" + advertiseName + '\'' +
                ", sourcePlan='" + sourcePlan + '\'' +
                '}';
    }
}
