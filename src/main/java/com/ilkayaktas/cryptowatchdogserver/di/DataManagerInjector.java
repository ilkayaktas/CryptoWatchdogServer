package com.ilkayaktas.cryptowatchdogserver.di;

import com.ilkayaktas.cryptowatchdogserver.controller.DataManager;
import com.ilkayaktas.cryptowatchdogserver.controller.IDataManager;
import com.ilkayaktas.cryptowatchdogserver.controller.api.ApiHelper;
import com.ilkayaktas.cryptowatchdogserver.controller.api.IApiHelper;
import com.ilkayaktas.cryptowatchdogserver.controller.api.binance.endpoint.BinanceService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.bitfinex.endpoint.BitfinexService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.bitflyer.endpoint.BitflyerService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.bithumb.endpoint.BithumbService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.bitstamp.endpoint.BitstampService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.bittrex.endpoint.BittrexService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.btcc.endpoint.BTCCService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.btcturk.endpoint.BTCTurkService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.cexio.endpoint.CexioService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.coinbase.endpoint.CoinbaseService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.coinmarketcap.endpoint.CoinmarketcapService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.gdax.endpoint.GdaxService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.hitbtc.endpoint.HitBTCService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.huobi.endpoint.HuobiService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.koineks.endpoint.KoineksService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.koinim.endpoint.KoinimService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.kraken.endpoint.KrakenService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.okex.endpoint.OkexService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.paribu.endpoint.ParibuService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.poloniex.endpoint.PoloniexService;
import com.ilkayaktas.cryptowatchdogserver.controller.db.DbHelper;
import com.ilkayaktas.cryptowatchdogserver.controller.db.IDbHelper;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.concurrent.TimeUnit;

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
    @Qualifier(value = "DB")
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

    @Bean
    ParibuService provideParibuService(){
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        // set your desired log level
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okClient = new OkHttpClient.Builder()
                .addInterceptor(logging)
                .build();

        Retrofit retrofitApi = new Retrofit.Builder()
                .baseUrl("https://www.paribu.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okClient)
                .build();

        return retrofitApi.create(ParibuService.class);
    }

    @Bean
    BTCTurkService provideBTCTurkService(){
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        // set your desired log level
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okClient = new OkHttpClient.Builder()
                .readTimeout(15, TimeUnit.SECONDS)
                .connectTimeout(15, TimeUnit.SECONDS)
                .addInterceptor(logging)
                .build();


        Retrofit retrofitApi = new Retrofit.Builder()
                .baseUrl("https://www.btcturk.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okClient)
                .build();

        return retrofitApi.create(BTCTurkService.class);
    }

    @Bean
    PoloniexService providePoloniexService(){
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        // set your desired log level
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okClient = new OkHttpClient.Builder()
                .addInterceptor(logging)
                .build();

        Retrofit retrofitApi = new Retrofit.Builder()
                .baseUrl("https://poloniex.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okClient)
                .build();

        return retrofitApi.create(PoloniexService.class);
    }

    @Bean
    CoinmarketcapService provideCoinmarketcapService(){
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        // set your desired log level
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okClient = new OkHttpClient.Builder()
                .addInterceptor(logging)
                .build();

        Retrofit retrofitApi = new Retrofit.Builder()
                .baseUrl("https://api.coinmarketcap.com/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okClient)
                .build();

        return retrofitApi.create(CoinmarketcapService.class);
    }

    @Bean
    BitstampService provideBitstampService(){
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        // set your desired log level
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okClient = new OkHttpClient.Builder()
                .addInterceptor(logging)
                .build();

        Retrofit retrofitApi = new Retrofit.Builder()
                .baseUrl("https://www.bitstamp.net/api/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okClient)
                .build();

        return retrofitApi.create(BitstampService.class);
    }

    @Bean
    BithumbService provideBithumbService(){
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        // set your desired log level
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okClient = new OkHttpClient.Builder()
                .addInterceptor(logging)
                .build();

        Retrofit retrofitApi = new Retrofit.Builder()
                .baseUrl("https://api.bithumb.com/public/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okClient)
                .build();

        return retrofitApi.create(BithumbService.class);
    }

    @Bean
    BitflyerService provideBitflyerService(){
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        // set your desired log level
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okClient = new OkHttpClient.Builder()
                .addInterceptor(logging)
                .build();

        Retrofit retrofitApi = new Retrofit.Builder()
                .baseUrl("https://api.bitflyer.jp/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okClient)
                .build();

        return retrofitApi.create(BitflyerService.class);
    }

    @Bean
    BTCCService provideBTCCService(){
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        // set your desired log level
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okClient = new OkHttpClient.Builder()
                .addInterceptor(logging)
                .build();

        Retrofit retrofitApi = new Retrofit.Builder()
                .baseUrl("https://spotusd-data.btcc.com/data/pro/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okClient)
                .build();

        return retrofitApi.create(BTCCService.class);
    }

    @Bean
    BittrexService provideBittrexService(){
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        // set your desired log level
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okClient = new OkHttpClient.Builder()
                .addInterceptor(logging)
                .build();

        Retrofit retrofitApi = new Retrofit.Builder()
                .baseUrl("https://bittrex.com/api/v1.1/public/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okClient)
                .build();

        return retrofitApi.create(BittrexService.class);
    }

    @Bean
    BitfinexService provideBitfinexService(){
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        // set your desired log level
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okClient = new OkHttpClient.Builder()
                .addInterceptor(logging)
                .build();

        Retrofit retrofitApi = new Retrofit.Builder()
                .baseUrl("https://api.bitfinex.com/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okClient)
                .build();

        return retrofitApi.create(BitfinexService.class);
    }

    @Bean
    GdaxService provideGdaxService(){
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        // set your desired log level
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okClient = new OkHttpClient.Builder()
                .addInterceptor(logging)
                .build();

        Retrofit retrofitApi = new Retrofit.Builder()
                .baseUrl("https://api.gdax.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okClient)
                .build();

        return retrofitApi.create(GdaxService.class);
    }


    @Bean
    HitBTCService provideHitBTCService(){
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        // set your desired log level
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okClient = new OkHttpClient.Builder()
                .addInterceptor(logging)
                .build();

        Retrofit retrofitApi = new Retrofit.Builder()
                .baseUrl("https://api.hitbtc.com/api/2/public/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okClient)
                .build();

        return retrofitApi.create(HitBTCService.class);
    }

    @Bean
    CoinbaseService provideCoinbaseService(){
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        // set your desired log level
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okClient = new OkHttpClient.Builder()
                .addInterceptor(logging)
                .build();

        Retrofit retrofitApi = new Retrofit.Builder()
                .baseUrl("https://api.coinbase.com/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okClient)
                .build();

        return retrofitApi.create(CoinbaseService.class);
    }

    @Bean
    BinanceService provideBinanceService(){
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        // set your desired log level
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okClient = new OkHttpClient.Builder()
                .addInterceptor(logging)
                .build();

        Retrofit retrofitApi = new Retrofit.Builder()
                .baseUrl("https://api.binance.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okClient)
                .build();

        return retrofitApi.create(BinanceService.class);
    }

    @Bean
    KoineksService provideKoineksService(){
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        // set your desired log level
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okClient = new OkHttpClient.Builder()
                .addInterceptor(logging)
                .build();

        Retrofit retrofitApi = new Retrofit.Builder()
                .baseUrl("https://koineks.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okClient)
                .build();

        return retrofitApi.create(KoineksService.class);
    }

    @Bean
    KoinimService provideKoinimService(){
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        // set your desired log level
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okClient = new OkHttpClient.Builder()
                .addInterceptor(logging)
                .build();

        Retrofit retrofitApi = new Retrofit.Builder()
                .baseUrl("https://koinim.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okClient)
                .build();

        return retrofitApi.create(KoinimService.class);
    }

    @Bean
    CexioService provideCexioService(){
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        // set your desired log level
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okClient = new OkHttpClient.Builder()
                .addInterceptor(logging)
                .build();

        Retrofit retrofitApi = new Retrofit.Builder()
                .baseUrl("https://cex.io/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okClient)
                .build();

        return retrofitApi.create(CexioService.class);
    }

    @Bean
    OkexService provideOkexService(){
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        // set your desired log level
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okClient = new OkHttpClient.Builder()
                .addInterceptor(logging)
                .build();

        Retrofit retrofitApi = new Retrofit.Builder()
                .baseUrl("https://www.okex.com/api/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okClient)
                .build();

        return retrofitApi.create(OkexService.class);
    }

    @Bean
    HuobiService provideHuobiService(){
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        // set your desired log level
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okClient = new OkHttpClient.Builder()
                .addInterceptor(logging)
                .build();

        Retrofit retrofitApi = new Retrofit.Builder()
                .baseUrl("https://api.huobi.pro/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okClient)
                .build();

        return retrofitApi.create(HuobiService.class);
    }

    @Bean
    KrakenService provideKrakenService(){
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        // set your desired log level
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okClient = new OkHttpClient.Builder()
                .addInterceptor(logging)
                .build();

        Retrofit retrofitApi = new Retrofit.Builder()
                .baseUrl("https://api.kraken.com/0/public/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okClient)
                .build();

        return retrofitApi.create(KrakenService.class);
    }
}
