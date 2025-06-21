package NSP_TECH.FACTURACION.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="FACTURACION")
@AllArgsConstructor
@NoArgsConstructor

public class facturacion {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID_FACTURACION")
    private Long ID_FACTURACION;

    @OneToOne
    @JoinColumn(name="id_pago")
    private pago pagos;

}



