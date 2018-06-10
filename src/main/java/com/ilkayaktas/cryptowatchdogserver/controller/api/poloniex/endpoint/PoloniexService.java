package com.ilkayaktas.cryptowatchdogserver.controller.api.poloniex.endpoint;

import com.ilkayaktas.cryptowatchdogserver.controller.api.poloniex.model.ticker.PoloniexTicker;
import com.ilkayaktas.cryptowatchdogserver.controller.api.poloniex.model.volume24.PoloniexVolume24;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by aselsan on 14.12.2017 at 16:30.
 */

public interface PoloniexService {
    @GET("public")
    Observable<PoloniexTicker> getCurrentCurrency(@Query("command") String returnTicker);

    @GET("public")
    Observable<PoloniexVolume24> get24Volume(@Query("command") String returnTicker);

}
