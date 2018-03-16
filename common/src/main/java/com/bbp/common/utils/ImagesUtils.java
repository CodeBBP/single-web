/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.bbp.common.utils;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.ArrayUtils;

/**
 * 包名：com.bbp.common.utils
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/10  22:16
 * <p>
 * 描述：
 *
 */
public class ImagesUtils {

    private static final String[] IMAGES_SUFFIXES = {
            "bmp", "jpg", "jpeg", "gif", "png", "tiff"
    };

    /**
     * 是否是图片附件
     *
     * @param filename
     * @return
     */
    public static boolean isImage(String filename) {
        if (filename == null || filename.trim().length() == 0) return false;
        return ArrayUtils.contains(IMAGES_SUFFIXES, FilenameUtils.getExtension(filename).toLowerCase());
    }

}
