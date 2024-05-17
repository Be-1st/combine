package com.personal_color.demo.dao;

import com.personal_color.demo.dto.FileInfoDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
public interface FileInfoDao {

    int insertFile(FileInfoDto fileDto);



}
