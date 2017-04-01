package com.ruihu.web.i18n;

import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;
import java.util.Locale;
/**
 * Created by Administrator on 2017/4/1.
 */
@Service
public class I18NService {
    @Autowired
    private MessageSource messageSource;

    public String getMessage(String messageId){
        Locale local = LocaleContextHolder.getLocale();
        return getMessage(messageId,local);
    }

    public String getMessage(String messageId, Locale locale){
        return messageSource.getMessage(messageId,null,locale);
    }
}
