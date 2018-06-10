package com.ilkayaktas.cryptowatchdogserver.controller.api.bitflyer.endpoint;

import com.ilkayaktas.cryptowatchdogserver.controller.api.bitflyer.model.BitflyerTicker;
import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by aselsan on 16.12.2017 at 13:50.
 */

public interface BitflyerService {
    @GET("ticker")
    Observable<BitflyerTicker> getCurrentCurrency();

}
