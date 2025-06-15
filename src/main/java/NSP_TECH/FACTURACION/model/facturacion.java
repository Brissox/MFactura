package NSP_TECH.FACTURACION.model;

import java.util.Date;

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

    @Column(name="NUMERO_DOCUMENTO")
    private int NUMERO_DOCUMENTO;

    @Column(name="FECHA_EMISION")
    private Date FECHA_EMISION;


    @OneToOne
    @JoinColumn(name="id_pago")
    private pago pagos;

}



