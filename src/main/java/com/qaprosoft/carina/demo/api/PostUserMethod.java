package com.qaprosoft.carina.demo.api;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.RequestTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.Configuration;

@Endpoint(url = "${base_url}/posts", methodType = HttpMethodType.POST)
@RequestTemplatePath(path = "api/users/_post/rq.json")
@ResponseTemplatePath(path = "api/users/_post/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.CREATED_201)
public class PostUserMethod extends AbstractApiMethodV2 {

    public PostUserMethod(){
        super("api/users/_post/rq.json", "api/users/_post/rs.json");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
        setHeaders("Content-Type=application/json; charset=UTF-8");
    }
}
