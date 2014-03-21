package com.springapp.dao;

import com.springapp.domain.Function;

/**
 * Created by plus on 14-3-21.
 */
public interface FunctionMapper {
      Function getFunction(String id);

      void InsertFunction(Function function);

      void update(Function function);
}
