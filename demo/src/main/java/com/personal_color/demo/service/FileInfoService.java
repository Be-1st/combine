package com.personal_color.demo.service;

import com.personal_color.demo.dao.FileInfoDao;
import com.personal_color.demo.dto.FileInfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileInfoService {

    @Autowired(required = false)
    FileInfoDao dao;

    public int insertFile(FileInfoDto dto){
        return dao.insertFile(dto);
    }

}
