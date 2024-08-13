package programacion2.minirest.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Persona(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    var nombre: String = "",
    var apellido: String = "",
    var edad: Int = 0

) {
    fun apellidoNombre(): String {
        return "$apellido, $nombre"
    }
}
