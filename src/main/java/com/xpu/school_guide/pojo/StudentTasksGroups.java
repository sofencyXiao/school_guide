package com.xpu.school_guide.pojo;

public class StudentTasksGroups {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_tasks_groups.id
     *
     * @mbg.generated Fri May 15 18:44:11 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_tasks_groups.open_id
     *
     * @mbg.generated Fri May 15 18:44:11 CST 2020
     */
    private String openId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_tasks_groups.task_id
     *
     * @mbg.generated Fri May 15 18:44:11 CST 2020
     */
    private Integer taskId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_tasks_groups.group_id
     *
     * @mbg.generated Fri May 15 18:44:11 CST 2020
     */
    private Integer groupId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_tasks_groups.is_delete
     *
     * @mbg.generated Fri May 15 18:44:11 CST 2020
     */
    private Boolean isDelete;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_tasks_groups.id
     *
     * @return the value of student_tasks_groups.id
     *
     * @mbg.generated Fri May 15 18:44:11 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_tasks_groups.id
     *
     * @param id the value for student_tasks_groups.id
     *
     * @mbg.generated Fri May 15 18:44:11 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_tasks_groups.open_id
     *
     * @return the value of student_tasks_groups.open_id
     *
     * @mbg.generated Fri May 15 18:44:11 CST 2020
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_tasks_groups.open_id
     *
     * @param openId the value for student_tasks_groups.open_id
     *
     * @mbg.generated Fri May 15 18:44:11 CST 2020
     */
    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_tasks_groups.task_id
     *
     * @return the value of student_tasks_groups.task_id
     *
     * @mbg.generated Fri May 15 18:44:11 CST 2020
     */
    public Integer getTaskId() {
        return taskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_tasks_groups.task_id
     *
     * @param taskId the value for student_tasks_groups.task_id
     *
     * @mbg.generated Fri May 15 18:44:11 CST 2020
     */
    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_tasks_groups.group_id
     *
     * @return the value of student_tasks_groups.group_id
     *
     * @mbg.generated Fri May 15 18:44:11 CST 2020
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_tasks_groups.group_id
     *
     * @param groupId the value for student_tasks_groups.group_id
     *
     * @mbg.generated Fri May 15 18:44:11 CST 2020
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_tasks_groups.is_delete
     *
     * @return the value of student_tasks_groups.is_delete
     *
     * @mbg.generated Fri May 15 18:44:11 CST 2020
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_tasks_groups.is_delete
     *
     * @param isDelete the value for student_tasks_groups.is_delete
     *
     * @mbg.generated Fri May 15 18:44:11 CST 2020
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }
}