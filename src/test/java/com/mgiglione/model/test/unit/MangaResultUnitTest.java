package com.mgiglione.model.test.unit;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mgiglione.model.MangaResult;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.lang.annotation.Annotation;

public class MangaResultUnitTest {

    @Test
    public void testAnnotations() throws Exception {
        MangaResult mangaResult = new MangaResult();
        Annotation[] declaredAnnotations = mangaResult.getClass().getDeclaredField("result").getAnnotations();
        assertThat(declaredAnnotations.length).isEqualTo(1);
        assertThat(declaredAnnotations[0].annotationType().isAssignableFrom(JsonProperty.class)).isEqualTo(true);
    }

}
