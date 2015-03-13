package com.digitallumens.pocketae.classes;

/**
 * Created by ysmith on 3/12/15.
 */
public class Project {
    private int mProjID;
    private String mProjName;
    private String[] mMilestones;
    private String mPartner;
    private String mProjType;
    private String mCustomer;
    private Artifacts[] mArtifacts;

    //still need to add constructors

    public String getProjName() {
        return mProjName;
    }

    public void setProjName(String projName) {
        mProjName = projName;
    }

    public String[] getMilestones() {
        return mMilestones;
    }

    public void setMilestones(String[] milestones) {
        mMilestones = milestones;
    }

    public String getPartner() {
        return mPartner;
    }

    public void setPartner(String partner) {
        mPartner = partner;
    }

    public String getProjType() {
        return mProjType;
    }

    public void setProjType(String projType) {
        mProjType = projType;
    }

    public String getCustomer() {
        return mCustomer;
    }

    public void setCustomer(String customer) {
        mCustomer = customer;
    }

    public Artifacts[] getArtifacts() {
        return mArtifacts;
    }

    public void setArtifacts(Artifacts[] artifacts) {
        mArtifacts = artifacts;
    }

    public int getProjID() {
        return mProjID;
    }

    /*each project will have a randomly generated project ID number. Need
    to figure out how to link this to to the user who generated it. Should I pass in the userID?
    It won't be a new user each time this is called, so it should be declared outside of the methods.
    Maybe in a constructor?
     */
    public void setProjID(int projID) {
        mProjID = projID;

    }

}
