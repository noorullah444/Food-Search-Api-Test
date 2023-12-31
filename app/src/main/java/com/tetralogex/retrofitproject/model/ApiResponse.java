
package com.tetralogex.retrofitproject.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class ApiResponse {

    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("parsed")
    @Expose
    private List<Parsed> parsed;
    @SerializedName("hints")
    @Expose
    private List<Hint> hints;
    @SerializedName("_links")
    @Expose
    private Links links;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Parsed> getParsed() {
        return parsed;
    }

    public void setParsed(List<Parsed> parsed) {
        this.parsed = parsed;
    }

    public List<Hint> getHints() {
        return hints;
    }

    public void setHints(List<Hint> hints) {
        this.hints = hints;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

}
