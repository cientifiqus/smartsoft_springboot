package la.smartsoft.factura.service;

import la.smartsoft.factura.entity.UsuarioModel;
import la.smartsoft.factura.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository UsuarioRepository;

    public ArrayList<UsuarioModel> obtenerUsuarios() {
        return (ArrayList<UsuarioModel>) UsuarioRepository.findAll();
    }

    public UsuarioModel crearUsuario(UsuarioModel usuario) {
        return UsuarioRepository.save(usuario);
    }

    public UsuarioModel actualizarUsuario(UsuarioModel usuario) {
        return UsuarioRepository.save(usuario);
    }

    public Optional<UsuarioModel> obtenerPorId(Long id) {
        return UsuarioRepository.findById(id);
    }

    public ArrayList<UsuarioModel> obtenerPorPeriodicidad(Integer periodicidad) {
        return UsuarioRepository.findByPeriodicidad(periodicidad);
    }

    public boolean eliminarUsuario(Long id) {
        try {
            UsuarioRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
