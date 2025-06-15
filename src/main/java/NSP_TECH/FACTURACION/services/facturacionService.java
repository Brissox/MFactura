package NSP_TECH.FACTURACION.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import NSP_TECH.FACTURACION.DTO.FacturacionCOMPL;
import NSP_TECH.FACTURACION.model.facturacion;
import NSP_TECH.FACTURACION.repository.FacturacionRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
@SpringBootApplication


public class facturacionService {
@Autowired
    private FacturacionRepository frepository;

    public List<FacturacionCOMPL> listarFacturas() {
        return frepository.findAll().stream()
            .map(FacturacionCOMPL::new)
            .collect(Collectors.toList());
    }

    public facturacion BuscarUnaFactura(Long ID_FACTURACION){
        return frepository.findById(ID_FACTURACION).get();

    }
}
