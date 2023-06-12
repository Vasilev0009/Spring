package lab15.firstspringproject.controller.model.service;


import lab15.firstspringproject.controller.model.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Qualifier("ModifySystemTime")
public class ModifySystemTime implements MyModifyService {
    @Override
    public Response modify(Response response){
        response.setSystemTime("Data");
        return response;
    }
}
