package com.shresthabinod.functionalProgramming;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StudentInterfaceTest {
    @Test
    public void testDisplayName() {



        assertEquals("Jane Doe", Main.StudentInterface.displayName("Jane", "Doe"));
    }
}

