package NSP_TECH.FACTURACION.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import NSP_TECH.FACTURACION.Assambler.facturacionModelAssambler;
import NSP_TECH.FACTURACION.DTO.FacturacionCOMPL;
import NSP_TECH.FACTURACION.services.facturacionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;


@RestController
@RequestMapping("api/v1/Facturacion")
public class FacturacionController {
    @Autowired
    private facturacionService fservice;
    @Autowired
    private facturacionModelAssambler assambler;



    // ENDPOINT PARA BUSCAR TODAS LAS FACTURAS/BOLETAS

    @GetMapping
    @Operation(summary = "FACTURAS/BOLETAS", description = "Operacion que lista todas las boletas/facturas")
    @ApiResponses (value = {
        @ApiResponse(responseCode = "200", description = "Se listaron correctamente las boletas/facturas", content = @Content(mediaType = "application/json", schema = @Schema(implementation = FacturacionCOMPL.class))), 
        @ApiResponse(responseCode = "404", description = "No se encontro ninguna boletas/facturas", content = @Content(mediaType = "application/json", schema = @Schema(type = "string", example = "No se encuentran Datos")))

    })

        public ResponseEntity<?> listaAF() {
        List<FacturacionCOMPL> inventarios = fservice.listarFacturas();
        if (inventarios.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encuentran datos");
        } else {
            return ResponseEntity.ok(assambler.toCollectionModel(inventarios));
        }

}

    // ENDPOINT PARA BUSCAR UNA BOLETA/FACTURA
    @GetMapping("/{ID_FACTURACION}")
    @Operation(summary = "FACTURA/BOLETA", description = "Operacion que lista una Factura/Boleta")
    @Parameters (value = {
        @Parameter (name="ID_FACTURACION", description= "ID del Factura/Boleta que se buscara", in = ParameterIn.PATH, required= true)

    })
    @ApiResponses (value = {
        @ApiResponse(responseCode = "200", description = "Se lista correctamente la Factura/Boleta ", content = @Content(mediaType = "application/json", schema = @Schema(implementation = FacturacionCOMPL.class))), 
        @ApiResponse(responseCode = "404", description = "No se encontro ninguna Factura/Boleta", content = @Content(mediaType = "application/json", schema = @Schema(type = "string", example = "No se encuentran Datos")))
    })

    public ResponseEntity<?> BuscarFactura(@PathVariable Long ID_FACTURACION){

        try {
            FacturacionCOMPL facturaBuscada = fservice.BuscarUnaFactura(ID_FACTURACION);
            return ResponseEntity.ok(assambler.toModel(facturaBuscada));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encuentran Facturas/Boletas");
        }
        
    }

}
