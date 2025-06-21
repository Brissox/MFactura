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
    @Schema(description="aaaaa")
    private Long ID_FACTURACION;
    @Schema(description="aaaaa")
    private Date fecha_pago;
    @Schema(description="aaaaa")
    private String tipo;
    @Schema(description="aaaaa")
    private int iva;
    @Schema(description="aaaaa")
    private int descuentos;
    @Schema(description="aaaaa")
    private int total;
    @Schema(description="aaaaa")
    private Long id_Pedido;
    @Schema(description="aaaaa")
    private Long id_pago;
    @Schema(description="aaaaa")
    private int subtotal;
    @Schema(description="aaaaa")
    private String metodo_pago;
    @Schema(description="aaaaa")
    private String nombre;
    @Schema(description="aaaaa")
    private String apellido_paterno;
    @Schema(description="aaaaa")
    private String correo;
    @Schema(description="aaaaa")
    private Long id_usuario;
    @Schema(description="aaaaa")
    private String estado_Pago;
    

    public FacturacionCOMPL(facturacion facturacion) {
    
    this.ID_FACTURACION = facturacion.getID_FACTURACION();

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
