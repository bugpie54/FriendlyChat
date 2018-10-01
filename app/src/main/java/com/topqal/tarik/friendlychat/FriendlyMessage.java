package com.topqal.tarik.friendlychat;

public class FriendlyMessage {

    private String text;
    private String name;
    private String photoUrl;

    /**
     * Pass a custom Java object to the firebase database, if the class that defines it
     * has a default constructor that takes no arguments and has public getters
     * for the properties to be assigned.
     */

    // Default constructor required for calls to DataSnapshot.getValue(FriendlyMessage.class)
    public FriendlyMessage() {
    }

    public FriendlyMessage(String text, String name, String photoUrl) {
        this.text = text;
        this.name = name;
        this.photoUrl = photoUrl;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
