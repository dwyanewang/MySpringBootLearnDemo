package com.deyanewang.chapter04.dao;

import com.deyanewang.chapter04.entity.TUser;
import org.apache.ibatis.jdbc.SQL;

public class SQLProvider {
    public String select(final TUser user) {
        return new SQL() {{
            //  必须将columns中的字段添加别名为实体类中的属性
            SELECT("t_id as tId,t_name as tName,t_age as tAge,t_address as tAddress");
            FROM("t_user");
            if (user.gettId() != null) {
                System.out.println(user.gettId());
                WHERE("t_id=#{tId}");
            }
            if (user.gettName() != null) {
                System.out.println(user.gettName());
                WHERE("t_name=#{tName}");
            }
            if (user.gettAge() != null) {
                System.out.println(user.gettAge());
                WHERE("t_age=#{tAge}");
            }
            if (user.gettAddress() != null) {
                System.out.println(user.gettAddress());
                WHERE("t_address=#{tAddress}");
            }
        }}.toString();
    }

    public String insert(TUser user) {
        return new SQL() {{
            INSERT_INTO("t_user");
            INTO_COLUMNS("t_id", "t_name", "t_age", "t_address");
            INTO_VALUES("#{tId}", "#{tName}", "#{tAge}", "#{tAddress}");
        }}.toString();
    }

    public String update(TUser user) {
        return new SQL() {{
            UPDATE("t_user");
            if (user.gettName() != null) {
                System.out.println(user.gettName());
                SET("t_name=#{tName}");
            }
            if (user.gettAge() != null) {
                System.out.println(user.gettAge());
                SET("t_age=#{tAge}");
            }
            if (user.gettAddress() != null) {
                System.out.println(user.gettAddress());
                SET("t_address=#{tAddress}");
            }
            WHERE("t_id=#{tId}");
        }}.toString();
    }

    public String delete(TUser user) {
        return new SQL() {{
            DELETE_FROM("t_user");
            WHERE("t_id=#{tId}");
        }}.toString();
    }
}
