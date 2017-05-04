package com.zipcode.productmanagerlab;

/**
 * Created by vidyachandasekhar on 5/4/17.
 */
public class Books extends Product {
    private  String authorName;
    private  String publishingCompany;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public Books(String name, String id) {

        super(name, price, id, countOnHand);
        this.authorName = authorName;
        this.publishingCompany = publishingCompany;
    }



}
