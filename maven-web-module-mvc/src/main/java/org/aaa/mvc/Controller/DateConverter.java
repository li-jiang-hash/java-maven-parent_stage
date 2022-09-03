package org.aaa.mvc.Controller;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author:江Sir
 * @Date:03 2022/09/03 18:56
 * @description: Exercise
 * @Version 1.0.0
 */
public class DateConverter implements Converter<String,Date> {
    public Date convert(String dateStr) {
//将日期字符串转换成日期对象 返回
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = format.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

}
