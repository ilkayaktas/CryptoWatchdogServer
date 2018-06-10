package com.ilkayaktas.cryptowatchdogserver.controller.api.okex.endpoint;

import com.ilkayaktas.cryptowatchdogserver.controller.api.okex.model.OkexTicker;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by aselsan on 16.12.2017 at 13:50.
 */

public interface OkexService {
    @GET("ticker.do")
    Observable<OkexTicker> getCurrentCurrency(@Query("symbol") String symbol);

}
