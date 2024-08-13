package programacion2.minirest.service

import org.springframework.stereotype.Service
import programacion2.minirest.model.Persona
import programacion2.minirest.repository.PersonaRepository

@Service
class PersonaService(private val personaRepository: PersonaRepository) {

    fun findAll(): List<Persona> {
        return personaRepository.findAll()
    }

    fun findById(id: Long): Persona {
        return personaRepository.findById(id).orElseThrow()
    }

    fun create(persona: Persona): Persona {
        return personaRepository.save(persona)
    }

    fun deleteById(id: Long) {
        personaRepository.deleteById(id)
    }

    fun update(id: Long, persona: Persona): Persona {
        return personaRepository.findById(id).map {
            var mensaje = persona.apellidoNombre()
            personaRepository.save(persona)
        }.orElseThrow()
    }

}