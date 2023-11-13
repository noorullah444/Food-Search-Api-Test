
package com.tetralogex.retrofitproject.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Measure {

    @SerializedName("uri")
    @Expose
    private String uri;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("weight")
    @Expose
    private Double weight;
    @SerializedName("qualified")
    @Expose
    private List<Qualified> qualified;

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public List<Qualified> getQualified() {
        return qualified;
    }

    public void setQualified(List<Qualified> qualified) {
        this.qualified = qualified;
    }

}
