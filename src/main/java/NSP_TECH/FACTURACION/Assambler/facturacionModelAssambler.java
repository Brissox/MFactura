package NSP_TECH.FACTURACION.Assambler;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
import org.springframework.stereotype.Component;

import NSP_TECH.FACTURACION.DTO.FacturacionCOMPL;
import NSP_TECH.FACTURACION.controller.FacturacionController;

@Component
public class facturacionModelAssambler implements RepresentationModelAssembler<FacturacionCOMPL, EntityModel<FacturacionCOMPL>>{

    @Override
    public EntityModel<FacturacionCOMPL> toModel(FacturacionCOMPL facturaBuscada) {
        return EntityModel.of(
            facturaBuscada,
            linkTo(methodOn(FacturacionController.class).BuscarFactura(facturaBuscada.getId_facturacion())).withRel("LINKS"),
            linkTo(methodOn(FacturacionController.class).listaAF()).withRel("todas-los-productos")
        );

}}
