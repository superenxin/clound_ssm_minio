package edu.dgut.domain;

import java.io.Serializable;
import java.util.Date;

public class PrivateDO implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pribucket.id
     *
     * @mbg.generated Sat Sep 12 15:45:17 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pribucket.user_name
     *
     * @mbg.generated Sat Sep 12 15:45:17 CST 2020
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pribucket.picture_name
     *
     * @mbg.generated Sat Sep 12 15:45:17 CST 2020
     */
    private String pictureName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pribucket.create_time
     *
     * @mbg.generated Sat Sep 12 15:45:17 CST 2020
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pribucket.id
     *
     * @return the value of pribucket.id
     *
     * @mbg.generated Sat Sep 12 15:45:17 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pribucket.id
     *
     * @param id the value for pribucket.id
     *
     * @mbg.generated Sat Sep 12 15:45:17 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pribucket.user_name
     *
     * @return the value of pribucket.user_name
     *
     * @mbg.generated Sat Sep 12 15:45:17 CST 2020
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pribucket.user_name
     *
     * @param userName the value for pribucket.user_name
     *
     * @mbg.generated Sat Sep 12 15:45:17 CST 2020
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pribucket.picture_name
     *
     * @return the value of pribucket.picture_name
     *
     * @mbg.generated Sat Sep 12 15:45:17 CST 2020
     */
    public String getPictureName() {
        return pictureName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pribucket.picture_name
     *
     * @param pictureName the value for pribucket.picture_name
     *
     * @mbg.generated Sat Sep 12 15:45:17 CST 2020
     */
    public void setPictureName(String pictureName) {
        this.pictureName = pictureName == null ? null : pictureName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pribucket.create_time
     *
     * @return the value of pribucket.create_time
     *
     * @mbg.generated Sat Sep 12 15:45:17 CST 2020
     */
    public Date getcreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pribucket.create_time
     *
     * @param createTime the value for pribucket.create_time
     *
     * @mbg.generated Sat Sep 12 15:45:17 CST 2020
     */
    public void setcreateTime(Date createTime) {
        this.createTime = createTime;
    }
}