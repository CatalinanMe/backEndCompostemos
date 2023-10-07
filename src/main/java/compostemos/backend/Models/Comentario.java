package compostemos.backend.Models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data

public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long comentarioId;

    @NotNull
    @Column(name = "Comentarios")
    private String comentarioContenido;

    @NotNull
    @Column(name = "Fecha")
    private Integer comentarioFecha;




}
