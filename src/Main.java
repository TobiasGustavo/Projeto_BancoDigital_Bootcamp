import Clientes.*;
import Tipo_Contas.*;

public class Main {

        public static void main(String[] args) {

            Cliente Tobias = new PessoaFisica("Tobias","12345678910");
            Conta conta1 = new ContaCorrente(Tobias);
            Banco.adicionaConta(conta1, Tobias);
            Tobias.adicionaContato("tobiasgustavoh@gmail.com");
            Tobias.adicionaContato("(11) 99999-0000");


            //Deposita valores naa contas
            conta1.deposito(500);
            conta1.deposito(10000);

            //Faz tranferencia entre contas
            conta1.transferencia(conta1, 200);

            //Saca os valores
            conta1.saque(200);
            conta1.saque(500);


            //Imprime as infomações dos clientes
            Tobias.imprimeInformacoes();

            //Imprime as informações das contas dos bancos
            Banco.imprimeInfoContas();
        }
    }
