package com.ilkayaktas.cryptowatchdogserver.controller.api.btcturk.endpoint;

import com.ilkayaktas.cryptowatchdogserver.controller.api.btcturk.model.BTCTurkTicker;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by aselsan on 14.12.2017 at 15:58.
 */

public interface BTCTurkService {
    @GET("ticker")
    Observable<BTCTurkTicker[]> getCurrentCurrency(@Query("X-PCK") String xpck, @Query("X-Stamp") String xstamp, @Query("X-Signature") String xsignature);
}
