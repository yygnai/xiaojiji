package com.yy.mapper;

import com.yy.entity.User;
import org.springframework.stereotype.Repository;


/**
 * @author 595703420@qq.com
 * @date 2018/1/18 0018 下午 4:35
 */
@Repository
public class UserMapper {
   // @Insert("insert into users (name,password) values (#{name},#{password})")
    public void insert(User user){
        System.out.println(user.getName()+"__"+user.getPassword());
    };

}
