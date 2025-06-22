package NSP_TECH.FACTURACION.model;

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
@Table(name="PEDIDOS")
@AllArgsConstructor
@NoArgsConstructor


public class pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Pedido;

    @ManyToOne
    @JoinColumn(name="id_usuario")
    private usuarios usuarios;

    
    private int subtotal;
    private String metodoPago;

}
