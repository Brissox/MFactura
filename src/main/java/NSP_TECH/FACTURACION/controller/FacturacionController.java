package NSP_TECH.FACTURACION.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import NSP_TECH.FACTURACION.DTO.FacturacionCOMPL;
import NSP_TECH.FACTURACION.model.facturacion;
import NSP_TECH.FACTURACION.services.facturacionService;


@RestController
@RequestMapping("api/v1/Facturacion")
public class FacturacionController {
    @Autowired
    private facturacionService fservice;

    @GetMapping
    public ResponseEntity<List<FacturacionCOMPL>> listar() {
        return ResponseEntity.ok(fservice.listarFacturas());
    }

    @GetMapping("/{ID_FACTURACION}")
    public ResponseEntity<?> BuscarProducto(@PathVariable Long ID_FACTURACION){

        try {
            facturacion facturaBuscada = fservice.BuscarUnaFactura(ID_FACTURACION);
            return ResponseEntity.ok(facturaBuscada);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encuentran Producto");
        }
        
    }

}
