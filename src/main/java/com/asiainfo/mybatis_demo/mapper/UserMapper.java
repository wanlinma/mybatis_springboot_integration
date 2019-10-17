package com.asiainfo.mybatis_demo.mapper;

import com.asiainfo.mybatis_demo.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
//    @Select("select * from tb_user")  //  注解开发和xml 开发只能选一种
    List<User> findAllUser();
    
    List<User> findUserById(@Param("userId") Integer id);
}
