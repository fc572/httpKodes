package com;


import com.controller.CodesController;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.ui.Model;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class CodesControllerTest {

    @Mock
    private Model modelmock;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testRoot() throws Exception {
        CodesController codesController = new CodesController();
        String responseCode = codesController.codes("204", modelmock);
        assertThat(responseCode, containsString("codeDisplayPage"));
    }
}

/*
{
"message": "The code number 204 means No Content"
}
 */
