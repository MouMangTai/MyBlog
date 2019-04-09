package com.mmt.myblog.bean;

import java.util.Date;

public class Article {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.Id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.art_title
     *
     * @mbg.generated
     */
    private String artTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.art_post_time
     *
     * @mbg.generated
     */
    private Date artPostTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.art_category
     *
     * @mbg.generated
     */
    private String artCategory;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.art_visitor
     *
     * @mbg.generated
     */
    private Integer artVisitor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.art_context
     *
     * @mbg.generated
     */
    private String artContext;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.Id
     *
     * @return the value of article.Id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.Id
     *
     * @param id the value for article.Id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.art_title
     *
     * @return the value of article.art_title
     *
     * @mbg.generated
     */
    public String getArtTitle() {
        return artTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.art_title
     *
     * @param artTitle the value for article.art_title
     *
     * @mbg.generated
     */
    public void setArtTitle(String artTitle) {
        this.artTitle = artTitle == null ? null : artTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.art_post_time
     *
     * @return the value of article.art_post_time
     *
     * @mbg.generated
     */
    public Date getArtPostTime() {
        return artPostTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.art_post_time
     *
     * @param artPostTime the value for article.art_post_time
     *
     * @mbg.generated
     */
    public void setArtPostTime(Date artPostTime) {
        this.artPostTime = artPostTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.art_category
     *
     * @return the value of article.art_category
     *
     * @mbg.generated
     */
    public String getArtCategory() {
        return artCategory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.art_category
     *
     * @param artCategory the value for article.art_category
     *
     * @mbg.generated
     */
    public void setArtCategory(String artCategory) {
        this.artCategory = artCategory == null ? null : artCategory.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.art_visitor
     *
     * @return the value of article.art_visitor
     *
     * @mbg.generated
     */
    public Integer getArtVisitor() {
        return artVisitor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.art_visitor
     *
     * @param artVisitor the value for article.art_visitor
     *
     * @mbg.generated
     */
    public void setArtVisitor(Integer artVisitor) {
        this.artVisitor = artVisitor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.art_context
     *
     * @return the value of article.art_context
     *
     * @mbg.generated
     */
    public String getArtContext() {
        return artContext;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.art_context
     *
     * @param artContext the value for article.art_context
     *
     * @mbg.generated
     */
    public void setArtContext(String artContext) {
        this.artContext = artContext == null ? null : artContext.trim();
    }
}