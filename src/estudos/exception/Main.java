package estudos.exception;

import io.github.musulaoeduardo.clientes.dominio.Cliente;
import io.github.musulaoeduardo.clientes.dominio.enums.TipoSexo;
import io.github.musulaoeduardo.clientes.dominio.exceptions.CpfInvalidoException;
import io.github.musulaoeduardo.clientes.logicanegocio.ValidadorCliente;

public class Main {
    public static void main(String[] args) {

        /*try{
            Cliente cliente = new Cliente();
            cliente.setSexo(TipoSexo.M);
            String descricao = cliente.getSexo().getDescricao();
            System.out.println(descricao);
        }catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("o tipo estava null");
        }catch (Exception e){
            System.out.println("Ocorreu um erro inexperado");
        }*/

        Cliente cliente = new Cliente();
        cliente.setCpf("01231048470");
        try {
            ValidadorCliente.validarCpf(cliente);
        } catch (CpfInvalidoException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("fui executado");
        }

    }
}
