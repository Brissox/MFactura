package NSP_TECH.FACTURACION.service;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import NSP_TECH.FACTURACION.repository.FacturacionRepository;
import NSP_TECH.FACTURACION.services.facturacionService;

public class facturacionServiceTest {

    @Mock
    private FacturacionRepository factrepository;
    
    @InjectMocks
    private facturacionService factservices;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }
/*
    @Test
    public void testBuscarTodo(){
    java.util.List<FacturacionCOMPL> lista = new  ArrayList<>();

    FacturacionCOMPL fact1 = new FacturacionCOMPL();
    FacturacionCOMPL fact2 = new FacturacionCOMPL();

    fact1.setId_facturacion(11L);
    fact1.setFecha_pago(null);
    fact1.setTipo("Boleta");
    fact1.setIva(123);
    fact1.setDescuentos(1231);
    fact1.setTotal(123123);
    fact1.setId_Pedido(11L);
    fact1.setId_pago(11L);
    fact1.setSubtotal(12312312);
    fact1.setMetodo_pago("Debito");
    fact1.setNombre("Bastian");
    fact1.setApellido_paterno("Rojas");
    fact1.setCorreo("xxxx@xxxx.xx");
    fact1.setId_usuario(11L);
    fact1.setEstado_Pago("Aceptado");

    fact2.setId_facturacion(12L);
    fact2.setFecha_pago(null);
    fact2.setTipo("Factura");
    fact2.setIva(1223);
    fact2.setDescuentos(2231);
    fact2.setTotal(223123);
    fact2.setId_Pedido(12L);
    fact2.setId_pago(12L);
    fact2.setSubtotal(22312312);
    fact2.setMetodo_pago("Credito");
    fact2.setNombre("Maryanne");
    fact2.setApellido_paterno("Rojas");
    fact2.setCorreo("xxxx@xxxx.xx");
    fact2.setId_usuario(12L);
    fact2.setEstado_Pago("Aceptado");

    lista.add(fact1);
    lista.add(fact2);
    when(factrepository.findAll()).thenReturn((List<facturacion>)(List<?>) lista);

    java.util.List<FacturacionCOMPL> resultadoBusqueda = factservices.listarFacturas();

    assertEquals(2,resultadoBusqueda.size());
    verify(factrepository, times(1)).findAll();

}

    @Test
    public void testBuscarunenvio(){
    FacturacionCOMPL fact1 = new FacturacionCOMPL();

    fact1.setId_facturacion(11L);
    fact1.setFecha_pago(null);
    fact1.setTipo("Boleta");
    fact1.setIva(123);
    fact1.setDescuentos(1231);
    fact1.setTotal(123123);
    fact1.setId_Pedido(11L);
    fact1.setId_pago(11L);
    fact1.setSubtotal(12312312);
    fact1.setMetodo_pago("Debito");
    fact1.setNombre("Bastian");
    fact1.setApellido_paterno("Rojas");
    fact1.setCorreo("xxxx@xxxx.xx");
    fact1.setId_usuario(11L);
    fact1.setEstado_Pago("Aceptado");

    when(Optional<FacturacionCOMPL> findById(11L);).thenReturn(Optional.of((facturacion) fact1));

    FacturacionCOMPL factbuscar = factservices.BuscarUnaFactura(11L);
    assertEquals(11L,factbuscar.getId_facturacion());
    verify(factrepository, times(1)).findById(11L);

    }*/







}
