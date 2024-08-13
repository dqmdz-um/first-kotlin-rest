package programacion2.minirest.controller

import org.springframework.web.bind.annotation.*
import programacion2.minirest.model.Persona
import programacion2.minirest.service.PersonaService

@RestController
@RequestMapping("/api/simple/persona")
class PersonaController(private val service: PersonaService) {

    @GetMapping("/hello")
    fun hello() : String {
        return "Hello World"
    }

    @GetMapping("/")
    fun findAll(): List<Persona> {
        return service.findAll()
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): Persona {
        return service.findById(id)
    }

    @PostMapping("/")
    fun create(@RequestBody persona: Persona): Persona {
        return service.create(persona)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long) {
        service.deleteById(id)
    }

    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @RequestBody persona: Persona): Persona {
        return service.update(id, persona)
    }

}