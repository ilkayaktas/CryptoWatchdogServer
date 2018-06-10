package com.ilkayaktas.cryptowatchdogserver.controller.api.bitstamp.endpoint;

import com.ilkayaktas.cryptowatchdogserver.controller.api.bitstamp.model.BitstampTicker;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by aselsan on 16.12.2017 at 13:50.
 */

public interface BitstampService {
    @GET("ticker/{currency_pair}")
    Observable<BitstampTicker> getCurrentCurrency(@Path("currency_pair") String currency_pair);

}
