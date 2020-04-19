package com.lastone.domain_object.mainBody;

import com.lastone.domain_object.items.accessInfo.AccessInfo;
import com.lastone.domain_object.items.saleInfo.SaleInfo;
import com.lastone.domain_object.items.searchInfo.SearchInfo;
import com.lastone.domain_object.items.volumeInfo.VolumeInfo;

public class Item {

    private String kind;
    private String id;
    private String etag;
    private String selfLink;
    private VolumeInfo volumeInfo;
    private SaleInfo saleInfo;
    private AccessInfo accessInfo;
    private SearchInfo searchInfo;
}
