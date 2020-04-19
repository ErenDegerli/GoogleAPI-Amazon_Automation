package com.lastone.domain_object.items.saleInfo;

import java.util.List;

public class SaleInfo {

    private String country;
    private String saleability;
    private boolean isEbook;
    private ListPrice listPrice;
    private RetailPrice retailPrice;
    private String buyLink;
    private List<Offer> offers = null;

}
