package com.lastone.pojo.items.saleInfo;

public class Offer {

    private int finskyOfferType;
    private ListPrice listPrice;
    private RetailPrice retailPrice;

    public int getFinskyOfferType() {
        return finskyOfferType;
    }
    public void setFinskyOfferType(int finskyOfferType) {
        this.finskyOfferType = finskyOfferType;
    }

    public ListPrice getListPrice() {
        return listPrice;
    }
    public void setListPrice(ListPrice listPrice) {
        this.listPrice = listPrice;
    }

    public RetailPrice getRetailPrice() {
        return retailPrice;
    }
    public void setRetailPrice(RetailPrice retailPrice) {
        this.retailPrice = retailPrice;
    }

}
