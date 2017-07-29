package com.example.android.miwok;

/**
 * Created by Shashikant on 7/28/2017.
 */

public class Word {
    private String defaultTranslation;
    private String miwokTranslation;
    private final static int NOT_VALID_IMAGE = -1;
    private int imageId = NOT_VALID_IMAGE;
    private int musicID;

    public Word(String defaultTranslation, String miwokTranslation,int imageId,int musicId){
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.imageId = imageId;
        this.musicID = musicId;

    }
    public Word(String defaultTranslation, String miwokTranslation,int musicId){
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.musicID = musicId;
    }
    // getter methods
    public String getDefaultTranslation(){
        return this.defaultTranslation;
    }
    public String getMiwokTranslation(){
        return this.miwokTranslation;
    }
    public  int getImageId(){
        return this.imageId;
    }
    public int getMusicID(){ return this.musicID;}
    /**
     * method tho check whether the activity has an image
     */
    public boolean hasAnImage(){
        if(imageId != NOT_VALID_IMAGE){
            return true;
        }
        return false;
    }
}
