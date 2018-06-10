package com.ilkayaktas.cryptowatchdogserver.controller.api.bittrex.endpoint;

import com.ilkayaktas.cryptowatchdogserver.controller.api.bittrex.model.BittrexTicker;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by aselsan on 16.12.2017 at 13:50.
 */

public interface BittrexService {
    @GET("getticker")
    Observable<BittrexTicker> getCurrentCurrency(@Query("market") String market);
}
