package com.ilkayaktas.cryptowatchdogserver.controller.api.hitbtc.endpoint;

import com.ilkayaktas.cryptowatchdogserver.controller.api.hitbtc.model.HitBTCTicker;
import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by aselsan on 16.12.2017 at 13:50.
 */

public interface HitBTCService {
    @GET("ticker")
    Observable<HitBTCTicker[]> getCurrentCurrency();

}
