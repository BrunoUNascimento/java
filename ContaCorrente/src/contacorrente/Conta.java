package contacorrente;


public class Conta {
   //artibutos
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    //metodo construtor 
    public Conta(){
        this.saldo = 0;
        this.status = false;    
    }
    
    //Estado atual do objeto
    public void estadoAtual(){
        System.out.println("--------------------------");
        System.out.println("Conta: "+this.getNumConta());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Status: "+this.getStatus());
        System.out.println("Saldo: R$"+this.getSaldo());
    }
          
    
    //Metodos Setters 
    public void setNumConta(int n){
        this.numConta = n;
    }
    public void setTipo(String t){
        this.tipo = t;
    }
    public void setDono(String d){
        this.dono = d;
    }
    public void setSaldo(double s){
     this.saldo = s;   
    }
    public void setStatus(boolean st){
        this.status = st;
    }
    
    
    //Metodos Getters
    public int getNumConta(){
        return this.numConta;
    }
    public String getTipo(){
        return this.tipo;
    }
    public String getDono(){
        return this.dono;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public boolean getStatus(){
        return this.status;
    }
    
    //Metodo de abertura de conta 
    public void abrirConta(String t){
        setTipo(t);
        setStatus(true);
        if (t.equals("cc")){
            saldo = 50;
        }else{
            saldo = 150;
        }
            System.out.println("Conta aberta com sucesso!");
    }
        
    //Metodo de fechamento de conta
        public void fecharConta(){
            if (this.getSaldo() > 0){
                System.out.println("Erro, Você ainda possui saldo em sua conta verifique!");
            }else if (getSaldo() < 0 ){
                System.out.println("Erro, Você possui debitos inadimplentes, verifique! ");
            }else{
                setStatus(false);
                System.out.println("Conta encerrada com sucesso!");
            }
        }
        
        
        //metodo de deposito
        public void depositar(double v){
            if (this.getStatus()){
                this.setSaldo(getSaldo()+v);
            }else {
                System.out.println("Erro.Conta inexistente");
            }
        }
    
        //metodo para sacar
        public void sacar(double v){
            if(getStatus()){
                if (this.getSaldo()>=v){
                    this.setSaldo(this.getSaldo()-v);
                    System.out.println("Saque realizado na conta de "+ this.getDono());
                }else{
                System.out.println("Erro. Saldo insuficiente");
            }
            }else{
                System.out.println("Impossivel sacar de uma conta fechada!");
            }
        
        }
        
        //metodo para pagar mensalidade
        public void pagarMesal(){
            double v;
            if (getTipo().equals("cc")){
                v = 12;
            }else{
                v = 20;
            }
            if (this.getStatus()){
                if (getSaldo()>v){
                    saldo = -v;
                }else{
                    System.out.println("Saldo insuficiente");
                }
            }else{
                System.out.println("Impossivel pagar");
            }
        }
        
        
    }
  

