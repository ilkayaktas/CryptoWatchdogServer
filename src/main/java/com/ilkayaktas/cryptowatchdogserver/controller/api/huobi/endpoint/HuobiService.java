package com.ilkayaktas.cryptowatchdogserver.controller.api.huobi.endpoint;

import com.ilkayaktas.cryptowatchdogserver.controller.api.huobi.model.HuobiTicker;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by ilkayaktas on 19.02.2018 at 15:10.
 */

public interface HuobiService {
    @GET("market/detail/merged")
    Observable<HuobiTicker> getCurrentCurrency(@Query("symbol") String symbolPair);
}
