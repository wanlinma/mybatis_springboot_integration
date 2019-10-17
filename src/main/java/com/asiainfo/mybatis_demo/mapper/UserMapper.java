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
    
    List<User> findUserById(@Param("userId") Integer id);// 用 @Param 可以  select * from tb_user where user_id=#{userId} 此处 的 #{userId} 就是 @Param("userId") 所指定的，不加 @Param 那么，sql  的 参数需要 和 方法参数名一样
}
