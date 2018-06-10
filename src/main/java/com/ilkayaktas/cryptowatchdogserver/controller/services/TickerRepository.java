package com.ilkayaktas.cryptowatchdogserver.controller.services;

import com.ilkayaktas.cryptowatchdogserver.model.app.Ticker;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by ilkayaktas on 10.06.2018 at 12:31.
 */

public interface TickerRepository extends MongoRepository<Ticker,String> {
}
