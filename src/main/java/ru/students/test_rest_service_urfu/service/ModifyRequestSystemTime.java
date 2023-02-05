package ru.students.test_rest_service_urfu.service;

import org.springframework.core.ParameterizedTypeReference;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.students.test_rest_service_urfu.model.Request;
import java.util.Date;


@Service
public class ModifyRequestSystemTime  implements ModifyRequestService{

    @Override
    public void modifyRq(Request request){

      request.setSystemTime(new Date().toString());  //установить текущее время и преобразить в строку
        HttpEntity<Request> httpEntity = new HttpEntity<>(request);

        new RestTemplate().exchange("http://localhost:8080/feedback", HttpMethod.POST,
                httpEntity,
                new ParameterizedTypeReference<>() {
                });
    }
}
