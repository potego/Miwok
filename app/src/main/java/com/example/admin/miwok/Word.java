package com.example.admin.miwok;

/**
 * Created by Pearly on 2017-01-06.
 */
public class Word {
    //the default translation for the word
    private String mDefaultTranslation;


    //the miwork translation of the word
    private String mMiwokTranslation;

    //Audio resource ID for the word
    private int mAudioResourceId;

    //the image path resource ID
    private int mImageResourceID = NO_IMAGE_PROVIDED;

    //
    private static final int NO_IMAGE_PROVIDED = -1;


    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    //Get the default translation of th word
    public String getDefaultTranslation(){

        return mDefaultTranslation;
    }

    //Get the default translation of th word
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    //Get the default translation of th word
    public int getmImageResourceID(){
        return mImageResourceID;
    }

    public boolean hasImage(){
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }

    // Return the audio resource ID of the word
    public int getAudioResourceId(){ return mAudioResourceId; }
}

