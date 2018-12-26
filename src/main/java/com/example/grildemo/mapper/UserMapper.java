package com.example.grildemo.mapper;

import com.example.grildemo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
    User Sel(int id);
}
