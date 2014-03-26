package com.springapp.persistence;

import com.springapp.domain.Function;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by plus on 14-3-21.
 */
@Repository
public interface FunctionMapper {
      /*根据id查找function，但是没有关联到user*/
      @Select("SELECT FUNCTION_ID AS FUNCTIONID,TITTLE,INTRODUCTION,ADDRESS FROM FUNCTION WHERE function_id = #{id}")
      Function getFunction(int id);

      @Select("SELECT FUNCTION_ID AS FUNCTIONID,TITTLE,INTRODUCTION,ADDRESS FROM FUNCTION")
      List<Function> getAll();

      @Insert("INSERT INTO FUNCTION(TITTLE ,INTRODUCTION,ADDRESS) VALUE (#{tittle},#{introduction},#{address})")
      void insertFunction(Function function);

      @Update("UPDATE FUNCTION  SET USER = #{address} WHERE FUNCTION_ID = #{id}")
      void update(Function function);

      @Insert("INSERT INTO USER_FUNCTION(USER_ID,FUNCTION_ID) VALUE(#{userId},#{functionId})")
      void addUserToFunction(Map<String,Object> userAndFunction);

      /*确认此用户是否已经参加该活动*/
      @Select("SELECT COUNT(*) FROM USER_FUNCTION WHERE USER_ID = #{userId} and FUNCTION_ID = #{functionId}")
      int existUserInFunction(Map<String,Object> userAndFunction);

      @Select("SELECT FUN.FUNCTION_ID AS FUNCTIONID,FUN.TITTLE," +
              "FUN.ADDRESS,FUN.INTRODUCTION,USER.USER_ID AS USERID,USER.NAME FROM FUNCTION FUN " +
              "LEFT JOIN USER_FUNCTION USR_FUN ON FUN.FUNCTIONID = USR_FUN.FUNCTION_ID " +
              "LEFT JOIN USER ON USER.USER_ID = USER_FUN.USER_ID " +
              "WHERE FUNCTIONID = #{id}")
      Function getFunctionAndUser(int id);

}
