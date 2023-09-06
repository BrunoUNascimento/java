/**
 * 29/07/2023 data da criação 
 * @Bruno U. nascimento
 */
package projetocolaborador;
import java.util.Scanner;

    public class ProjetoColaborador{
        public static void main(String[] args){
            
            int matri = 00;//numero da matricula, que é acrecentado +1 a cada vez que cadastrado um novo colaborador 
            String setor;
            float salario;
            
            
            
            Scanner teclado = new Scanner(System.in);//objeto teclado para capitar o que for digitado 
            Colaborador colaborador = new Colaborador();
            
            
            //tela de login
            String usuario,senha;
            System.out.println("Olá, Seja Bem Vindo!");
            
            
            
            
            
            //Condição para acessar o programa/login
            do{
            System.out.println("Digite Suas Credencias:");
            System.out.print("Usuario:");
            usuario = teclado.nextLine();
            System.out.print("Senha:");
            senha = teclado.nextLine();
            if (usuario.equals("bruno") && senha.equals("1234")){
                break;
            }
            System.out.println("Usuario ou senha invalidos! Tente novamente. ");
            }while((!usuario.equals("bruno") || !senha.equals("32")));
            
            
            
            int men = 0;//variavel para a condição, enquanto men for igual a zero o menu vai ser repetido 
            do{
            //menu
            System.out.println("Seja bem vindo " + usuario);
            System.out.println("Escolha a opção desejada:");
            System.out.println("1-CADASTRAR COLABORADOR");
            System.out.println("2-CONSULTAR COLABORADOR");
            //System.out.println("3-REMOVER COLABORADOR");
            //System.out.println("4-SAIR");
            String opcao = teclado.nextLine();
            
            //Cadastrar colaborador
            if (opcao.equals("1")){
                System.out.println("Você escolheu a opção 'CADASTRAR COLABORADOR'");
                System.out.print("Matricula:");
                matri++;
                System.out.println(matri);
                
                //Instancia um objeto da classe colaborador 
                colaborador = new Colaborador();
                colaborador.setMatricula(matri);
                
                
                System.out.print("Digite o nome do colaborador: ");
                String name = teclado.nextLine();
                colaborador.setNome(name);
                
                
                System.out.print("Digite o setor:");
                setor = teclado.nextLine();
                colaborador.setSetor(setor);
                
                
                System.out.print("Digite o salario:");
                salario = teclado.nextFloat();
                colaborador.setSalario(salario);
                
                
                System.out.print("Você deseja voltar ao menu principal? Se sim digite 'sim':");
                String SimOuNa = teclado.next();
                if (!SimOuNa.equals("sim")){
                    break;
                }
            }
            
            //Consulta de funcionario
            if (opcao.equals("2")){
                System.out.println("Você escolheu a opção 'CONSULTAR COLABORADOR'");
                System.out.print("Nome:");
                colaborador.mostrarnome();
                System.out.print("Matricula:");
                colaborador.mostrarmatricula();
                System.out.print("Setor:");
                colaborador.mostrarsetor();
                System.out.print("Salario:");
                colaborador.mostrarsalario();
            
            System.out.print("Você deseja voltar ao menu principal? Se sim digite 'sim':");
            
            String SimOuNa = teclado.nextLine();
            if (!SimOuNa.equals("sim")){
                break;
            }
            }
            }while (men == 0);
            
            
        
        
        
                    
        }
    }