package co.com.sofka.model.product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private String id;
    private String nombre;
    private String categoria;
    private String descripcion;
    private Double precio;
    private Date fechaCreacion;
}
