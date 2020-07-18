package com.xpu.school_guide.mapper;

import com.xpu.school_guide.pojo.Groups;
import com.xpu.school_guide.pojo.GroupsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Component;

@Component
public interface GroupsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbg.generated Fri May 15 18:44:11 CST 2020
     */
    long countByExample(GroupsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbg.generated Fri May 15 18:44:11 CST 2020
     */
    int deleteByExample(GroupsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbg.generated Fri May 15 18:44:11 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbg.generated Fri May 15 18:44:11 CST 2020
     */
    int insert(Groups record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbg.generated Fri May 15 18:44:11 CST 2020
     */
    int insertSelective(Groups record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbg.generated Fri May 15 18:44:11 CST 2020
     */
    List<Groups> selectByExampleWithRowbounds(GroupsExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbg.generated Fri May 15 18:44:11 CST 2020
     */
    List<Groups> selectByExample(GroupsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbg.generated Fri May 15 18:44:11 CST 2020
     */
    Groups selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbg.generated Fri May 15 18:44:11 CST 2020
     */
    int updateByExampleSelective(@Param("record") Groups record, @Param("example") GroupsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbg.generated Fri May 15 18:44:11 CST 2020
     */
    int updateByExample(@Param("record") Groups record, @Param("example") GroupsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbg.generated Fri May 15 18:44:11 CST 2020
     */
    int updateByPrimaryKeySelective(Groups record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbg.generated Fri May 15 18:44:11 CST 2020
     */
    int updateByPrimaryKey(Groups record);
}