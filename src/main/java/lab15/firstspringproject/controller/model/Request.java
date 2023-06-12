package lab15.firstspringproject.controller.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Request {
    public String getUid() {
        return uid;
    }

    public String getOperationUid() {
        return operationUid;
    }

    public String getSystemTime() {
        return systemTime;
    }

    @NotBlank
    @Size(max =32)
    private String uid;

    @NotBlank
    @Size(max =32)
    private String operationUid;
    private String systemName;

    @NotBlank
    private String systemTime;
    private String source;
    private Integer communicationId;
    private Integer templateId;

    @Max(7)
    private Integer productCode;

    @Max(5)
    private Integer smsCode;
}
