package com.example.demo.EntityClass.Mapper;

import com.example.demo.EntityClass.UserEntity;
import com.example.demo.UserDTO.RegisterDTO;

public interface MapperInter {

	UserEntity userMapper(RegisterDTO dto);
	RegisterDTO userMapper(UserEntity userEntity);
}
