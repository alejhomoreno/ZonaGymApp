package zona_Gym.datos;

import zona_Gym.dominio.Cliente;

import java.util.List;

public interface IClienteDAO {
    List<Cliente> listarCliente();
    boolean buscarClientePorId (Cliente cliente);
    boolean agregarCliente(Cliente cliente);
    boolean modificarCliente(Cliente cliente);
    boolean eliminarCliente(Cliente cliente);

}
