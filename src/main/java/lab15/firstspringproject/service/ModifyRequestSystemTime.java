package lab15.firstspringproject.service;

import lab15.firstspringproject.model.Request;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.stereotype.Service;


@Service
public class ModifyRequestSystemTime implements ModifyRequestSerice {

    @Override
    public void modifyRq(Request request){
        request.setSystemTime("test"); //Установить текущее время и преобразовать в строку
        HttpEntity<Request> httpEntity = new HttpEntity<>(request);
        new RestTemplate().exchange("http//localhost:8082/feedback",
                HttpMethod.POST,
                httpEntity,
        new ParameterizedTypeReference<>(){
        });
    }
}
