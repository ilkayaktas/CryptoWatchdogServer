package com.ilkayaktas.cryptowatchdogserver.controller.api.koineks.endpoint;

import com.ilkayaktas.cryptowatchdogserver.controller.api.koineks.model.KoineksTicker;
import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by aselsan on 16.12.2017 at 13:50.
 */

public interface KoineksService {
    @GET("ticker")
    Observable<KoineksTicker> getCurrentCurrency();

}
