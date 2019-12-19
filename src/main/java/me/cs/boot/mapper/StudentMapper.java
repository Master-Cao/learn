package me.cs.boot.mapper;

import me.cs.boot.po.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface StudentMapper {
    @Insert("insert into student(sno.sname.ssex) values (#{sno},#{sname},#{ssex})")
    int add(Student student);
    @Update("update student set ssex=#{ssex},sname=#{sname} where sno=#{sno}")
    int update(Student student);
    @Delete("delete from student where sno=#{sno}")
    int deleteById(String sno);
    @Select("select * from student where sno=#{sno}")
    @Results(id="student",value = {
            @Result(property = "sno",column = "sno",javaType = String.class),
            @Result(property = "sname",column = "sname",javaType = String.class),
            @Result(property = "ssex",column = "ssex",javaType = String.class)
    })
    Student queryById(String sno);
}
