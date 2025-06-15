package NSP_TECH.FACTURACION.DTO;

import java.util.Date;

import NSP_TECH.FACTURACION.model.facturacion;
import NSP_TECH.FACTURACION.model.pago;
import NSP_TECH.FACTURACION.model.pedido;
import NSP_TECH.FACTURACION.model.usuarios;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class FacturacionCOMPL {

    private Long ID_FACTURACION;
    private int NUMERO_DOCUMENTO;
    private Date FECHA_EMISION;
    private Date fecha_pago;
    private String tipo;
    private int iva;
    private int descuentos;
    private int total;
    private Long id_Pedido;
    private Long id_pago;
    private int subtotal;
    private String metodo_pago;
    private String nombre;
    private String apellido_paterno;
    private String correo;
    private Long id_usuario;

    public FacturacionCOMPL(facturacion facturacion) {
    
    this.ID_FACTURACION = facturacion.getID_FACTURACION();
    this.NUMERO_DOCUMENTO = facturacion.getNUMERO_DOCUMENTO();
    this.FECHA_EMISION = facturacion.getFECHA_EMISION();

        pago p = facturacion.getPagos();
        pedido pd = p.getPedidos();
        usuarios u = pd.getUsuarios();

    this.fecha_pago = p.getFecha_pago();
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
    
    }

}
