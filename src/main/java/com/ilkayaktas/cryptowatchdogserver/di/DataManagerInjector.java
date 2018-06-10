package com.ilkayaktas.cryptowatchdogserver.di;

import com.ilkayaktas.cryptowatchdogserver.controller.DataManager;
import com.ilkayaktas.cryptowatchdogserver.controller.IDataManager;
import com.ilkayaktas.cryptowatchdogserver.controller.api.ApiHelper;
import com.ilkayaktas.cryptowatchdogserver.controller.api.IApiHelper;
import com.ilkayaktas.cryptowatchdogserver.controller.db.DbHelper;
import com.ilkayaktas.cryptowatchdogserver.controller.db.IDbHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ilkayaktas on 25.03.2018 at 15:57.
 */
@Configuration
public class DataManagerInjector {

    @Bean
    public IDataManager provideDataManager(){
        return new DataManager();
    }

    @Bean
    public IDbHelper provideDbHelper(){
        return new DbHelper();
    }

    @Bean
    public IApiHelper provideApiHelper(){
        return new ApiHelper();
    }

    @Bean Logger provideLogger(){
        return LoggerFactory.getLogger("CryptoWatchdogServer");
    }
}
