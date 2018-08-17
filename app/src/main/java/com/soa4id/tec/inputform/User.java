package com.soa4id.tec.inputform;

public class User {
    private String mFullName;
    private String mEmail;
    private String mAge;
    private String mPhone;

    /**
     * Constructor
     * @param mFullName
     * @param mEmail
     * @param mAge
     * @param mPhone
     */
    public User(String mFullName, String mEmail, String mAge, String mPhone) {
        this.mFullName = mFullName;
        this.mEmail = mEmail;
        this.mAge = mAge;
        this.mPhone = mPhone;
    }

    /**
     *
     * @return
     */
    public String getmFullName() {
        return mFullName;
    }

    /**
     *
     * @param mFullName
     */
    public void setmFullName(String mFullName) {
        this.mFullName = mFullName;
    }

    /**
     *
     * @return
     */
    public String getmEmail() {
        return mEmail;
    }

    /**
     *
     * @param mEmail
     */
    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    /**
     *
     * @return
     */
    public String getmAge() {
        return mAge;
    }

    /**
     *
     * @param mAge
     */
    public void setmAge(String mAge) {
        this.mAge = mAge;
    }

    /**
     *
     * @return
     */
    public String getmPhone() {
        return mPhone;
    }

    /**
     *
     * @param mPhone
     */
    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }
}
