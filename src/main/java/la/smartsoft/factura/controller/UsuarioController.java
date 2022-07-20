package la.smartsoft.factura.controller;

import la.smartsoft.factura.entity.UsuarioModel;
import la.smartsoft.factura.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping()
    public ArrayList<UsuarioModel> obtenerUsuarios() {
        return usuarioService.obtenerUsuarios();
    }

    @PostMapping()
    public UsuarioModel crearUsuario(@RequestBody UsuarioModel usuario) {
        return this.usuarioService.crearUsuario(usuario);
    }

    @PutMapping(path = "/{id}")
    public UsuarioModel actualizarUsuario(@PathVariable("id") Long id, @RequestBody UsuarioModel usuario) {
        usuario.setId(id);
        return this.usuarioService.actualizarUsuario(usuario);
    }

    @GetMapping(path = "/{id}")
    public Optional<UsuarioModel> obtenerUsuarioPorId(@PathVariable("id") Long id) {
        return this.usuarioService.obtenerPorId(id);
    }

    @GetMapping("/query")
    public ArrayList<UsuarioModel> obtenerUsuarioPorPeriodicidad(@RequestParam("periodicidad") Integer periodicidad) {
        return this.usuarioService.obtenerPorPeriodicidad((periodicidad));
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {
        boolean ok = this.usuarioService.eliminarUsuario(id);
        if (ok) {
            return "Se elimino el usuario con id = " + id;
        } else {
            return "No pudo eliminar el usuario con id = " + id;
        }
    }
}
