
package com.ilkayaktas.cryptowatchdogserver.controller.api.kraken.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Result {

    @SerializedName("a")
    @Expose
    public List<String> a = null;
    @SerializedName("b")
    @Expose
    public List<String> b = null;
    @SerializedName("c")
    @Expose
    public List<String> c = null;
    @SerializedName("v")
    @Expose
    public List<String> v = null;
    @SerializedName("p")
    @Expose
    public List<String> p = null;
    @SerializedName("t")
    @Expose
    public List<Integer> t = null;
    @SerializedName("l")
    @Expose
    public List<String> l = null;
    @SerializedName("h")
    @Expose
    public List<String> h = null;
    @SerializedName("o")
    @Expose
    public String o;

}
