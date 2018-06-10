package com.ilkayaktas.cryptowatchdogserver.controller.api.cexio.endpoint;

import com.ilkayaktas.cryptowatchdogserver.controller.api.cexio.model.CexioTicker;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by aselsan on 16.12.2017 at 13:50.
 */

public interface CexioService {
    @GET("tickers/{symbol1}/{symbol2}")
    Observable<CexioTicker> getCurrentCurrency(@Path("symbol1") String symbol1, @Path("symbol2") String symbol2);

}
