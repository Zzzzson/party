package com.springapp.persistence;

import com.springapp.domain.Function;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by plus on 14-3-21.
 */
@Repository
public interface FunctionMapper {
      @Select("SELECT NAME,INTRODUCTION,ADDRESS FROM FUNCTION WHERE function_id = #{id}")
      Function getFunction(int id);

      @Select("SELECT * FROM FUNCTION")
      List<Function> getAll();

      @Insert("INSERT INTO FUNCTION(NAME ,INTRODUCTION,ADDRESS) VALUE (#{name},#{introduction},#{address})")
      void insertFunction(Function function);

      @Update("UPDATE FUNCTION  SET ADDRESS = #{address} WHERE FUNCTION_ID = #{id}")
      void update(Function function);
}
