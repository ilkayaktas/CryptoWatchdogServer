package com.ilkayaktas.cryptowatchdogserver.controller.api.bithumb.endpoint;

import com.ilkayaktas.cryptowatchdogserver.controller.api.bithumb.model.BithumbTicker;
import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by aselsan on 16.12.2017 at 13:50.
 */

public interface BithumbService {
    @GET("ticker/all")
    Observable<BithumbTicker> getCurrentCurrency();

}
