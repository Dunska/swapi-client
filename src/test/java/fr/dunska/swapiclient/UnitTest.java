package fr.dunska.swapiclient;


import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.time.Instant;

@DisplayName("Unit Test presentation")
public class UnitTest {

        @Test
        @DisplayName("Basic")
        void myFirstTest() {

            assertEquals(2, 1 + 1);
        }


}
