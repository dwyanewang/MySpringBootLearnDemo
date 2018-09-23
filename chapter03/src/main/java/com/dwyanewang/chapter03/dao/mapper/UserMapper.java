package com.dwyanewang.chapter03.dao.mapper;

import com.dwyanewang.chapter03.dao.SQLProvider;
import com.dwyanewang.chapter03.entity.TUser;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select t_id as tId,t_name as tName,t_age as tAge,t_address as tAddress from t_user")
    List<TUser> listUsers();

    @SelectProvider(type = SQLProvider.class,method = "select")
    List<TUser> select(TUser user);

    @InsertProvider(type = SQLProvider.class, method = "insert")
    void insert(TUser user);

    @UpdateProvider(type = SQLProvider.class, method = "update")
    void update(TUser user);

    @DeleteProvider(type = SQLProvider.class, method = "delete")
    void delete(TUser user );
}
