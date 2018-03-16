package com.bbp.showcase.excel.web.controller.entity;

/**
 * 包名：com.bbp.showcase.excel.web.controller.entity
 * <p>
 * 作者：mrbbp@qq.com
 * <p>
 * 创建时间：2018/3/14  9:17
 * <p>
 * 描述：
 *
 */
public enum ExcelDataType {

    csv("CSV"),
    excel2003("Excel 2003"),
    excel2003_sheet("Excel 2003 one sheet per workbook"),
    excel2003_xml("Excel 2003 XML存储"),
    excel2003_usermodel("Excel 2003 usermodel模型"),
    excel2007("Excel 2007");

    private final String info;

    private ExcelDataType(final String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
