package NSP_TECH.FACTURACION.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="PAGO")
@AllArgsConstructor
@NoArgsConstructor

public class pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Pago;

    @ManyToOne
    @JoinColumn(name="id_pedido")
    private pedido pedidos;

    private Date fecha_pago;
    private String estadoPago;
    private String tipo;
    private int iva;
    private int Descuentos;
    private int total;


}
