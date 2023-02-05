package ru.students.test_rest_service_urfu.service;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.students.test_rest_service_urfu.model.Response;

@Service
@RequiredArgsConstructor
@Qualifier("ModifyErrorMessage")
public class ModifyErrorMessage implements  MyModifyService {

    @Override
    public Response modify(Response response) {
        response.setErrorMessage("");
        return response;
    }
}
