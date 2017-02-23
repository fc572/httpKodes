package com;

import com.logic.Codes;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

public class CodesLogicTest {

    @Mock
    private Codes codesMock = new Codes();

    @Before
    public void init(){
        MockitoAnnotations.initMocks(codesMock);
    }

    @Test
    public void logicHappyPathTest(){
        String result = codesMock.workOutMeaningOfCode("202");
        assertThat(result, containsString("Accepted"));
    }

    @Test
    public void invalidCodeTest(){
        String result = codesMock.workOutMeaningOfCode("888");
        assertThat(result, containsString("nothing as it is not present in the list of valid HTTP codes"));
    }
}
