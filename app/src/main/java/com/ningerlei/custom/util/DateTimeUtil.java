package com.ningerlei.custom.util;

/**
 * Description :
 * CreateTime : 2017/7/7 11:57
 *
 * @author ningerlei@danale.com
 * @version <v1.0>
 * @Editor : Administrator
 * @ModifyTime : 2017/7/7 11:57
 * @ModifyDescription :
 */

public class DateTimeUtil {

    public static String getTime(long offset){
        int hour = (int) (offset / 3600 % 24);
        int minute = (int) ((offset % 3600) / 60);
        int second = (int) ((offset % 3600) % 60);

        String hourString = hour < 10 ? "0" + hour : "" + hour;
        String minuteString = minute < 10 ? "0" + minute : "" + minute;
        String secString = second < 10 ? "0" + second : "" + second;
        return hourString + ":" + minuteString + ":" + secString;
    }
}
