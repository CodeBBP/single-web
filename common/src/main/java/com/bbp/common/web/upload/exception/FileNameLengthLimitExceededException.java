/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.common.web.upload.exception;

import org.apache.commons.fileupload.FileUploadException;

/**
 * 包名：com.bbp.common.web.upload.exception
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/10  22:34
 * <p>
 * 描述：文件名超长
 *
 */
public class FileNameLengthLimitExceededException extends FileUploadException {

    private int length;
    private int maxLength;
    private String filename;

    public FileNameLengthLimitExceededException(String filename, int length, int maxLength) {
        super("file name : [" + filename + "], length : [" + length + "], max length : [" + maxLength + "]");
        this.length = length;
        this.maxLength = maxLength;
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    public int getLength() {
        return length;
    }


    public int getMaxLength() {
        return maxLength;
    }

}
