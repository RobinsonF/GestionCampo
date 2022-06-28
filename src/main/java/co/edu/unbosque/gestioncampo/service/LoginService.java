package co.edu.unbosque.gestioncampo.service;

import co.edu.unbosque.gestioncampo.entity.Usuario;
import co.edu.unbosque.gestioncampo.repository.UsuarioRepository;
import co.edu.unbosque.gestioncampo.util.JWTUtil2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    private JWTUtil2 jwtUtil;

    public String login(Usuario usuario){
        Usuario usuarioLogueado = usuarioRepository.obtenerUsuarioPorCredenciales(usuario);
        if (usuarioLogueado != null) {
            String tokenJwt = jwtUtil.create(String.valueOf(usuarioLogueado.getIdUsuario()), usuarioLogueado.getCorreo());
            return tokenJwt;
        }else{
            return "FAIL";
        }
    }

    public String aumentarIntento(String correo){
        return usuarioRepository.aumentarIntento(correo);
    }

    public Integer obtenerIntentos(String correo){
        return usuarioRepository.obtenerIntentos(correo);
    }

    public void setearCeroIntentos(String correo){
    usuarioRepository.setearCeroIntentos(correo);
    }
}
