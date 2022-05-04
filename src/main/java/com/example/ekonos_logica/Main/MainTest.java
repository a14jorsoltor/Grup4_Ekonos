package com.example.ekonos_logica.Main;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void comprovar() {


        var testBd= new Tauler();
        assertEquals(1, testBd.taulerEuropeu());
    }
}