package com.example.demo.EntityClass.Mapper;

import com.example.demo.EntityClass.UserEntity;
import com.example.demo.UserDTO.RegisterDTO;

public class MapperImp implements MapperInter {

	@Override
	public UserEntity userMapper(RegisterDTO dto) {
		UserEntity user = new UserEntity();
		user.setEmail(dto.getCommunicationdto().getEmail());
		user.setPassword(dto.getPassword());
		user.setUsername(dto.getUsername());
		return user;
	}

	@Override
	public RegisterDTO userMapper(UserEntity userEntity) {
		RegisterDTO dto = new RegisterDTO();
		dto.setPassword(userEntity.getPassword());
		dto.setUsername(userEntity.getUsername());
		com.example.demo.CommunicationDTO.CommunicationDTO comm = new com.example.demo.CommunicationDTO.CommunicationDTO();
		comm.setEmail(userEntity.getEmail());
		dto.setCommunicationdto(comm);

		return dto;
	}
}
