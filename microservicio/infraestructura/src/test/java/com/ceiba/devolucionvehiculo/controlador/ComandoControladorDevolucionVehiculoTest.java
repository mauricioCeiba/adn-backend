package com.ceiba.devolucionvehiculo.controlador;

import com.ceiba.ApplicationMock;
import com.ceiba.devolucionvehiculo.comando.ComandoDevolucionVehiculo;
import com.ceiba.devolucionvehiculo.testdatabuilder.ComandoDevolucionVehiculoTestDataBuilder;
import com.ceiba.usuario.comando.ComandoUsuario;
import com.ceiba.usuario.controlador.ComandoControladorUsuario;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes= ApplicationMock.class)
@WebMvcTest(ComandoControladorDevolucionVehiculo.class)
public class ComandoControladorDevolucionVehiculoTest {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private MockMvc mocMvc;

    @Test
    public void crear() throws Exception{
        // arrange
        ComandoDevolucionVehiculo comandoDevolucionVehiculo = new ComandoDevolucionVehiculoTestDataBuilder().conPorcentajeDeDano(10).build();

        // act - assert
        mocMvc.perform(post("/devoluciones")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(comandoDevolucionVehiculo)))
                .andExpect(status().isOk())
                .andExpect(content().json("{'valor': 2}"));
    }

    @Test
    public void actualizar() throws Exception{
        // arrange
        Long id = 2L;
        ComandoDevolucionVehiculo comandoDevolucionVehiculo = new ComandoDevolucionVehiculoTestDataBuilder().build();

        // act - assert
        mocMvc.perform(put("/devoluciones/{id}",id)
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(comandoDevolucionVehiculo)))
                .andExpect(status().isOk());
    }

    @Test
    public void eliminar() throws Exception {
        // arrange
        Long id = 2L;

        // act - assert
        mocMvc.perform(delete("/devoluciones/{id}",id)
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}
