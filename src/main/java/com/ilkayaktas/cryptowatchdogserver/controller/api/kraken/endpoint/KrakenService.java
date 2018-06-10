package com.ilkayaktas.cryptowatchdogserver.controller.api.kraken.endpoint;

import com.ilkayaktas.cryptowatchdogserver.controller.api.kraken.model.KrakenTicker;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by ilkayaktas on 21.02.2018 at 00:38.
 */

public interface KrakenService {
    // https://api.kraken.com/0/public/AssetPairs
    // https://api.kraken.com/0/public/OHLC?pair=BCHXBT

    @GET("Ticker")
    Observable<KrakenTicker> getCurrentCurrency(@Query("pair") String symbolPair);
}
