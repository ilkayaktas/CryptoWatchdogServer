package com.ilkayaktas.cryptowatchdogserver.controller.api.centralbank.endpoint;

import com.ilkayaktas.cryptowatchdogserver.controller.api.centralbank.model.Tarih_Date;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by aselsan on 23.12.2017 at 14:46.
 */

public interface CentralBankService {
    @GET("today.xml")
    Call<Tarih_Date> getCurrentCurrency();

}
