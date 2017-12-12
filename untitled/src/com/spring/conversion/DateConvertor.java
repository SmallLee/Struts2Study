package com.spring.conversion;

import com.opensymphony.xwork2.ActionContext;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.util.ServletContextAware;
import org.apache.struts2.util.StrutsTypeConverter;
import sun.awt.SunHints;

import javax.servlet.ServletContext;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class DateConvertor extends StrutsTypeConverter {
    private SimpleDateFormat simpleDateFormat;

    public DateConvertor(){
        System.out.println("DateConvertor constructor");
//        //获取全局参数
//        ServletContext context = ServletActionContext.getServletContext();
//        String pattern = context.getInitParameter("pattern");
//        simpleDateFormat = new SimpleDateFormat(pattern);
    }

    /**
     * 避免首次加载时ServletContext还没有初始化导致的空指针
     * @return
     */
    private DateFormat getDateFormat (){
        if (simpleDateFormat == null) {
            //获取全局参数
            ServletContext context = ServletActionContext.getServletContext();
            String pattern = context.getInitParameter("pattern");
            simpleDateFormat = new SimpleDateFormat(pattern);
        }
        return simpleDateFormat;
    }

    @Override
    public Object convertFromString(Map map, String[] strings, Class aClass) {
        System.out.println(strings);
        if (aClass == Date.class) {
            if (strings != null && strings.length > 0) {
                String value = strings[0];
                try {
//                    return simpleDateFormat.parse(value);
                    return getDateFormat().parse(value);
                } catch (ParseException e) {
                    e.printStackTrace();
                    throw new IllegalArgumentException("非法的日期字符串");
                }
            }
        }
        return strings;
    }

    @Override
    public String convertToString(Map map, Object o) {
        System.out.println(o);
        if (o.getClass() == Date.class) {
            Date date = (Date) o;
            return getDateFormat().format(date);
//            return simpleDateFormat.format(date);
        }
        return null;
    }
}
