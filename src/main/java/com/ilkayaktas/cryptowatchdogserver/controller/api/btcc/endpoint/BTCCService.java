package com.ilkayaktas.cryptowatchdogserver.controller.api.btcc.endpoint;

import com.ilkayaktas.cryptowatchdogserver.controller.api.btcc.model.BTCCTicker;
import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by aselsan on 16.12.2017 at 13:50.
 */

public interface BTCCService {
    @GET("ticker?symbol=BTCUSD")
    Observable<BTCCTicker> getCurrentCurrency();

}
