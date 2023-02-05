package ru.students.test_rest_service_urfu.service;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.students.test_rest_service_urfu.model.Response;

@Service
@Qualifier
public class ModifyUid implements MyModifyService {

    @Override
    public Response modify(Response response) {
        response.setUid("New Uid");
        return response;
    }


}
