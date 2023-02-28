package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.api.*;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;

public class ParisAPISampleTest implements IAbstractTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Test
    public void testGetUsers() {
        GetUserMethod getUserMethod = new GetUserMethod(1);
        getUserMethod.callAPIExpectSuccess();
        getUserMethod.validateResponse(JSONCompareMode.STRICT);
        getUserMethod.validateResponseAgainstSchema("api/users/_get/rs.schema");
    }




    @Test
    public void testPostUser() {
        PostUserMethod postUserMethod = new PostUserMethod();
        postUserMethod.addProperty("title", "Doctor");
        postUserMethod.addProperty("body", "Dr.Perry studied at Harvard University in 2002.");
        postUserMethod.addProperty("userId", 1);
        postUserMethod.callAPIExpectSuccess();
        postUserMethod.validateResponse(JSONCompareMode.STRICT);
        postUserMethod.validateResponseAgainstSchema("api/users/_post/rs.schema");
    }



    @Test
    public void testPutUser() {
        PutUserMethod putUserMethod = new PutUserMethod("Engineer", "Emily is a Civil Engineer.", 1);
        putUserMethod.callAPIExpectSuccess();
        putUserMethod.validateResponse(JSONCompareMode.STRICT);
        putUserMethod.validateResponseAgainstSchema("api/users/_put/rs.schema");
    }


    @Test
    public void testDeleteUserMethod() {
        DeleteUserMethod deleteUserMethod = new DeleteUserMethod();
        deleteUserMethod.callAPIExpectSuccess();
        deleteUserMethod.validateResponse(JSONCompareMode.STRICT);
    }



    @Test
    public void testPatchUser() {
        PatchUserMethod patchUserMethod = new PatchUserMethod();
        patchUserMethod.setProperties("api/users/user.properties");
        patchUserMethod.callAPIExpectSuccess();
        patchUserMethod.validateResponse(JSONCompareMode.STRICT);
        patchUserMethod.validateResponseAgainstSchema("api/users/_patch/rs.schema");
    }


}
