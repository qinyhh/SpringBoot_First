package com.xxxx.server.converter;

import org.springframework.core.convert.converter.Converter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @Description 日期转换
 * @Author qinyh
 * @date 2022/1/8
 */
public class DateConverter implements Converter<String, LocalDate> {
    @Override
    public LocalDate convert(String source) {
        try {
            return LocalDate.parse(source, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
