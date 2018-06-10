package com.ilkayaktas.cryptowatchdogserver.controller.api.coinbase.endpoint;

import com.ilkayaktas.cryptowatchdogserver.controller.api.coinbase.model.CoinbaseTicker;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by aselsan on 14.12.2017 at 16:30.
 */

public interface CoinbaseService {
    @GET("exchange-rates")
    Observable<CoinbaseTicker> getCurrentCurrency(@Query("currency") String currency);

}
