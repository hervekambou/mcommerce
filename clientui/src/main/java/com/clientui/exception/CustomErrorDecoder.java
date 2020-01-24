package com.clientui.exception;

import feign.Response;
import feign.codec.ErrorDecoder;

public class CustomErrorDecoder implements ErrorDecoder {

    private final ErrorDecoder defaultErrorDecoder = new Default();

    @Override
    public Exception decode(String methodeKey, Response response) {
        if(response.status() == 400 ) {
            return new ProductBadRequestException("Requête incorrecte ");
        }
        if(response.status() == 404){
            return new ProductNotFoundException("Produit Non trouvé");
        }
        return defaultErrorDecoder.decode(methodeKey, response);
    }
}
