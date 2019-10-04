package vsamarin.service.adapter;

import org.apache.commons.lang.StringUtils;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeAdapter {

    public static ZonedDateTime parseDateTime(String date) {
        return StringUtils.isEmpty(date) ? null : ZonedDateTime.parse(date, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    }

    public static String printDateTime(ZonedDateTime date) {
        return date == null ? null : date.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    }
}
