package com.ilkayaktas.cryptowatchdogserver.model.utils;

import java.text.DecimalFormat;

/**
 * Created by aselsan on 20.12.2017 at 00:35.
 */

public class PriceUtils {
    public static String formatPrice(Double price){
        if(price > 0 && price < 10){
            return new DecimalFormat("#.########").format(price);
        }
        else if(price >= 10 && price < 100){
            return new DecimalFormat("###.######").format(price);
        }
        else{
            return new DecimalFormat("######.###").format(price);
        }
    }

    public static String formatPrice(String price){
        return formatPrice(Double.valueOf(price));
    }
}
