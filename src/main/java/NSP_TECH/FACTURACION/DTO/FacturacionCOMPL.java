package NSP_TECH.FACTURACION.DTO;

import java.util.Date;

import NSP_TECH.FACTURACION.model.facturacion;
import NSP_TECH.FACTURACION.model.pago;
import NSP_TECH.FACTURACION.model.pedido;
import NSP_TECH.FACTURACION.model.usuarios;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class FacturacionCOMPL {
    @Schema(description="identificador/numero unico de la factura o boleta",example="1")
    private Long id_facturacion;
    @Schema(description="fecha que se realizo el pago del pedido", example="")
    private Date fecha_pago;
    @Schema(description="tipo de venta", example="boleta o factura")
    private String tipo;
    @Schema(description="impuesto sobre el valo anadido",example="111" )
    private int iva;
    @Schema(description="rebaja al precio del producto", example="1231")
    private int descuentos;
    @Schema(description="total a pagar",example="12312")
    private int total;
    @Schema(description="identificador del pedido a pagar", example="1")
    private Long id_Pedido;
    @Schema(description="identificador del pago", example="123")
    private Long id_pago;
    @Schema(description="suma parcial", example="112")
    private int subtotal;
    @Schema(description="metodo de pago a utilizar", example="debido/credido/efectivo")
    private String metodo_pago;
    @Schema(description="nombre del usuario", example="Bastian")
    private String nombre;
    @Schema(description="apellido del usuario", example="Rojas")
    private String apellido_paterno;
    @Schema(description="correo asociado al usuario", example="aaaa222@xxxx.xx")
    private String correo;
    @Schema(description="identificador del usuario", example="1")
    private Long id_usuario;
    @Schema(description="estado del pago ", example="aprobado/rechazado")
    private String estado_Pago;
    

    public FacturacionCOMPL(facturacion facturacion) {
    
    this.id_facturacion = facturacion.getId_facturacion();

        pago p = facturacion.getPagos();
        pedido pd = p.getPedidos();
        usuarios u = pd.getUsuarios();

    this.fecha_pago = p.getFecha_pago();
    this.metodo_pago = p.getMetodo();
    this.tipo = p.getTipo();
    this.iva = p.getIva();
    this.descuentos = p.getDescuentos();
    this.total = p.getTotal();
    this.id_Pedido =pd.getId_Pedido();
    this.id_pago = p.getId_Pago();
    this.subtotal = pd.getSubtotal();
    this.metodo_pago = pd.getMetodoPago();
    this.nombre = u.getNombre();
    this.apellido_paterno =u.getApellido_paterno();
    this.correo = u.getCorreo();
    this.id_usuario = u.getId_usuario();
    this.estado_Pago=p.getEstado_Pago();
    
    }

}
