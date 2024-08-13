package programacion2.minirest.repository

import org.springframework.data.jpa.repository.JpaRepository
import programacion2.minirest.model.Persona

interface PersonaRepository : JpaRepository<Persona, Long>