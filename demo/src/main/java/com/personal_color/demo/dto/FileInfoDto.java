package com.personal_color.demo.dto;

import lombok.Data;

@Data
public class FileInfoDto {

    private int fileid;
    private String name;
    private String path;
    private long filesize;
    private String description;
}
