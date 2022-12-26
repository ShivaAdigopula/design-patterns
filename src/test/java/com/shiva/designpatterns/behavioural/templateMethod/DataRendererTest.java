package com.shiva.designpatterns.behavioural.templateMethod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class DataRendererTest {

    @Nested
    class WhenXMLDataRendererTypeCreated {
        DataRenderer renderer = new XMLDataRenderer();
        @Test
        public void shouldReturnXMLProcessedData() {
            Assertions.assertEquals("Processed XML Data", renderer.render());
        }

    }

    @Nested
    class WhenCSVDataRendererTypeCreated {
        DataRenderer renderer = new CSVDataRenderer();
        @Test
        public void shouldReturnCSVProcessedData() {
            Assertions.assertEquals("Processed CSV Data", renderer.render());
        }

    }
}