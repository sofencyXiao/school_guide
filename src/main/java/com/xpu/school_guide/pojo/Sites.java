package com.xpu.school_guide.pojo;

public class Sites {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sites.id
     *
     * @mbg.generated Sat Jun 27 23:57:02 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sites.site_lo
     *
     * @mbg.generated Sat Jun 27 23:57:02 CST 2020
     */
    private String siteLo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sites.site_io
     *
     * @mbg.generated Sat Jun 27 23:57:02 CST 2020
     */
    private String siteIo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sites.site_name
     *
     * @mbg.generated Sat Jun 27 23:57:02 CST 2020
     */
    private String siteName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sites.is_delete
     *
     * @mbg.generated Sat Jun 27 23:57:02 CST 2020
     */
    private Boolean isDelete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sites.creator
     *
     * @mbg.generated Sat Jun 27 23:57:02 CST 2020
     */
    private String creator;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sites.id
     *
     * @return the value of sites.id
     *
     * @mbg.generated Sat Jun 27 23:57:02 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sites.id
     *
     * @param id the value for sites.id
     *
     * @mbg.generated Sat Jun 27 23:57:02 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sites.site_lo
     *
     * @return the value of sites.site_lo
     *
     * @mbg.generated Sat Jun 27 23:57:02 CST 2020
     */
    public String getSiteLo() {
        return siteLo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sites.site_lo
     *
     * @param siteLo the value for sites.site_lo
     *
     * @mbg.generated Sat Jun 27 23:57:02 CST 2020
     */
    public void setSiteLo(String siteLo) {
        this.siteLo = siteLo == null ? null : siteLo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sites.site_io
     *
     * @return the value of sites.site_io
     *
     * @mbg.generated Sat Jun 27 23:57:02 CST 2020
     */
    public String getSiteIo() {
        return siteIo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sites.site_io
     *
     * @param siteIo the value for sites.site_io
     *
     * @mbg.generated Sat Jun 27 23:57:02 CST 2020
     */
    public void setSiteIo(String siteIo) {
        this.siteIo = siteIo == null ? null : siteIo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sites.site_name
     *
     * @return the value of sites.site_name
     *
     * @mbg.generated Sat Jun 27 23:57:02 CST 2020
     */
    public String getSiteName() {
        return siteName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sites.site_name
     *
     * @param siteName the value for sites.site_name
     *
     * @mbg.generated Sat Jun 27 23:57:02 CST 2020
     */
    public void setSiteName(String siteName) {
        this.siteName = siteName == null ? null : siteName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sites.is_delete
     *
     * @return the value of sites.is_delete
     *
     * @mbg.generated Sat Jun 27 23:57:02 CST 2020
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sites.is_delete
     *
     * @param isDelete the value for sites.is_delete
     *
     * @mbg.generated Sat Jun 27 23:57:02 CST 2020
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sites.creator
     *
     * @return the value of sites.creator
     *
     * @mbg.generated Sat Jun 27 23:57:02 CST 2020
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sites.creator
     *
     * @param creator the value for sites.creator
     *
     * @mbg.generated Sat Jun 27 23:57:02 CST 2020
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }
}