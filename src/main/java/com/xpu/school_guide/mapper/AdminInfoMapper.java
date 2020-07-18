package com.xpu.school_guide.mapper;

import com.xpu.school_guide.pojo.AdminInfo;
import com.xpu.school_guide.pojo.AdminInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Component;

@Component
public interface AdminInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_info
     *
     * @mbg.generated Sat Jun 20 21:50:09 CST 2020
     */
    long countByExample(AdminInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_info
     *
     * @mbg.generated Sat Jun 20 21:50:09 CST 2020
     */
    int deleteByExample(AdminInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_info
     *
     * @mbg.generated Sat Jun 20 21:50:09 CST 2020
     */
    int deleteByPrimaryKey(String admin);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_info
     *
     * @mbg.generated Sat Jun 20 21:50:09 CST 2020
     */
    int insert(AdminInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_info
     *
     * @mbg.generated Sat Jun 20 21:50:09 CST 2020
     */
    int insertSelective(AdminInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_info
     *
     * @mbg.generated Sat Jun 20 21:50:09 CST 2020
     */
    List<AdminInfo> selectByExampleWithRowbounds(AdminInfoExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_info
     *
     * @mbg.generated Sat Jun 20 21:50:09 CST 2020
     */
    List<AdminInfo> selectByExample(AdminInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_info
     *
     * @mbg.generated Sat Jun 20 21:50:09 CST 2020
     */
    AdminInfo selectByPrimaryKey(String admin);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_info
     *
     * @mbg.generated Sat Jun 20 21:50:09 CST 2020
     */
    int updateByExampleSelective(@Param("record") AdminInfo record, @Param("example") AdminInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_info
     *
     * @mbg.generated Sat Jun 20 21:50:09 CST 2020
     */
    int updateByExample(@Param("record") AdminInfo record, @Param("example") AdminInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_info
     *
     * @mbg.generated Sat Jun 20 21:50:09 CST 2020
     */
    int updateByPrimaryKeySelective(AdminInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_info
     *
     * @mbg.generated Sat Jun 20 21:50:09 CST 2020
     */
    int updateByPrimaryKey(AdminInfo record);
}