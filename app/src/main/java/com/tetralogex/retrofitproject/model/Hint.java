
package com.tetralogex.retrofitproject.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Hint {

    @SerializedName("food")
    @Expose
    private Food__1 food;
    @SerializedName("measures")
    @Expose
    private List<Measure> measures;

    public Food__1 getFood() {
        return food;
    }

    public void setFood(Food__1 food) {
        this.food = food;
    }

    public List<Measure> getMeasures() {
        return measures;
    }

    public void setMeasures(List<Measure> measures) {
        this.measures = measures;
    }

}
