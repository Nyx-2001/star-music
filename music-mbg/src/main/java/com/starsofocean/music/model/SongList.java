package com.starsofocean.music.model;

import java.io.Serializable;

public class SongList implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column song_list.id
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column song_list.title
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column song_list.pic
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    private String pic;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column song_list.introduction
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    private String introduction;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column song_list.style
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    private String style;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table song_list
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column song_list.id
     *
     * @return the value of song_list.id
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column song_list.id
     *
     * @param id the value for song_list.id
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column song_list.title
     *
     * @return the value of song_list.title
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column song_list.title
     *
     * @param title the value for song_list.title
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column song_list.pic
     *
     * @return the value of song_list.pic
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    public String getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column song_list.pic
     *
     * @param pic the value for song_list.pic
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column song_list.introduction
     *
     * @return the value of song_list.introduction
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column song_list.introduction
     *
     * @param introduction the value for song_list.introduction
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column song_list.style
     *
     * @return the value of song_list.style
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    public String getStyle() {
        return style;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column song_list.style
     *
     * @param style the value for song_list.style
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    public void setStyle(String style) {
        this.style = style;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table song_list
     *
     * @mbg.generated Thu Oct 27 23:49:07 HKT 2022
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", pic=").append(pic);
        sb.append(", introduction=").append(introduction);
        sb.append(", style=").append(style);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}