package com.dwyanewang.charpter02;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TUserMapper {
    @Select("select t_id as tId,t_name as tName,t_age as tAge,t_address as tAddress from t_user")
    List<TUser> listUsers();

    @Insert("insert into t_user(t_id, t_name, t_age, t_address) VALUES (#{tId},#{tName},#{tAge},#{tAddress})")
    int addUser(TUser user);

    @Update("update t_user set t_name = #{username} where t_id = #{id}")
    void updateUserName(@Param("username") String name,@Param("id") int id);

    @Delete("delete from t_user where t_id = #{id}")
    void deleteUser(int id);
}
