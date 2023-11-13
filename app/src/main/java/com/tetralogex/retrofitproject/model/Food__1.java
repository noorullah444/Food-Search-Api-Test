
package com.tetralogex.retrofitproject.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Food__1 {

    @SerializedName("foodId")
    @Expose
    private String foodId;
    @SerializedName("uri")
    @Expose
    private String uri;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("knownAs")
    @Expose
    private String knownAs;
    @SerializedName("nutrients")
    @Expose
    private Nutrients__1 nutrients;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("categoryLabel")
    @Expose
    private String categoryLabel;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("brand")
    @Expose
    private String brand;
    @SerializedName("foodContentsLabel")
    @Expose
    private String foodContentsLabel;
    @SerializedName("servingSizes")
    @Expose
    private List<ServingSize> servingSizes;
    @SerializedName("servingsPerContainer")
    @Expose
    private Double servingsPerContainer;

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

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

    public String getKnownAs() {
        return knownAs;
    }

    public void setKnownAs(String knownAs) {
        this.knownAs = knownAs;
    }

    public Nutrients__1 getNutrients() {
        return nutrients;
    }

    public void setNutrients(Nutrients__1 nutrients) {
        this.nutrients = nutrients;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategoryLabel() {
        return categoryLabel;
    }

    public void setCategoryLabel(String categoryLabel) {
        this.categoryLabel = categoryLabel;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFoodContentsLabel() {
        return foodContentsLabel;
    }

    public void setFoodContentsLabel(String foodContentsLabel) {
        this.foodContentsLabel = foodContentsLabel;
    }

    public List<ServingSize> getServingSizes() {
        return servingSizes;
    }

    public void setServingSizes(List<ServingSize> servingSizes) {
        this.servingSizes = servingSizes;
    }

    public Double getServingsPerContainer() {
        return servingsPerContainer;
    }

    public void setServingsPerContainer(Double servingsPerContainer) {
        this.servingsPerContainer = servingsPerContainer;
    }

}
