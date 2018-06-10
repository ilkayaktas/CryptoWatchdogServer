package com.ilkayaktas.cryptowatchdogserver.controller.api.paribu.endpoint;

import com.ilkayaktas.cryptowatchdogserver.controller.api.paribu.model.ParibuTicker;
import io.reactivex.Observable;
import retrofit2.http.GET;


/**
 * Created by aselsan on 14.12.2017 at 02:37.
 */

public interface ParibuService {
    @GET("ticker/")
    Observable<ParibuTicker> getCurrentCurrency();

}
