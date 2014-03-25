package com.springapp.persistence;

import com.springapp.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by plus on 14-3-21.
 */
@Repository
public interface UserMapper {

    @Select("SELECT USER_ID,NAME,EMAIL,PASSWORD,SEX FROM USER WHERE NAME = #{name}")
    User getUser(String name);

    @Insert("INSERT INTO USER (USER_ID,NAME,EMAIL,PASSWORD,SEX) VALUE (#{id},#{name},#{email},#{password},#{sex})")
    void insertUser(User user);
}
