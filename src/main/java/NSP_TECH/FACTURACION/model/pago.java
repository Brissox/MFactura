package NSP_TECH.FACTURACION.model;

import java.time.LocalDateTime;


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
@Table(name="PAGOS")
@AllArgsConstructor
@NoArgsConstructor

public class pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Pago;

    @ManyToOne
    @JoinColumn(name="id_pedido")
    private pedido pedidos;

    private LocalDateTime fecha_pago;
    private String estado_Pago;
    private String tipo;
    private String metodo;
    private int iva;
    private int Descuentos;
    private int total;


}
