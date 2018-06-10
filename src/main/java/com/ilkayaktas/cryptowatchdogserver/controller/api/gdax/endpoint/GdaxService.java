package com.ilkayaktas.cryptowatchdogserver.controller.api.gdax.endpoint;

import com.ilkayaktas.cryptowatchdogserver.controller.api.gdax.model.GdaxTicker;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by aselsan on 16.12.2017 at 13:50.
 */

public interface GdaxService {
    @GET("products/{productID}/ticker")
    Observable<GdaxTicker> getCurrentCurrency(@Path("productID") String productID);

}
