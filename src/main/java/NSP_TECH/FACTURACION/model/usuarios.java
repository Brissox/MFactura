package NSP_TECH.FACTURACION.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="USUARIOS")
@Entity

public class usuarios {
    @Id
    private Long id_usuario;

    private String nombre;
    private String apellido_paterno;
    private String correo;
    private Long Run;
    private String dv;

}
