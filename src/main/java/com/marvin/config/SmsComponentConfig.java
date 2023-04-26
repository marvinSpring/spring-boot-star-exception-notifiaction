package com.marvin.config;

import com.marvin.client.Client;
import com.marvin.component.SmsNoticeSendComponent;
import com.marvin.model.CalmaNotice;
import com.marvin.util.CalmaValueResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(prefix = "calma.sms", name = "enable", havingValue = "true")
@Slf4j
public class SmsComponentConfig {

    @Bean
    @ConditionalOnMissingBean
    public SmsNoticeSendComponent<CalmaNotice> smsNoticeComponent(CalmaValueResolver<CalmaNotice> resolver,
                                                                  Client client) {
        if (log.isDebugEnabled()) {
            log.info("-----------------》》》》》短信通知开启《《《《《《《-------------------------");
        }
        return new SmsNoticeSendComponent<>(resolver, client);
    }
}