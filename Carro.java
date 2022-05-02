package ultima_semana_abril.ultima_aula_abril;

import javax.swing.JOptionPane;
/* Nalberth */
public class Carro implements Painel{

    private String cor;
    private int potencia;
    private String modelo;
    private String nome;
    private String chassi;
    private String placa;
    private short ano;
    private float km;
    private String cb;
    private float velocidadeMS = 0;
    private boolean status = false;
    private float aceleracaoMS;

    Carro() {}
    Carro(String cor, int potencia, String modelo, String nome, String chassi, String placa, short ano, float km,
            String cb, float aceleracaoMS) {
        this.cor = cor;
        this.potencia = potencia;
        this.modelo = modelo;
        this.nome = nome;
        this.chassi = chassi;
        this.placa = placa;
        this.ano = ano;
        this.km = km;
        this.cb = cb;
        this.setAceleracaoMS(aceleracaoMS);
    }

    @Override
    public void ligar() {
        if (status == false) {
            status = !status;
            JOptionPane.showMessageDialog(null, "O carro foi ligado!");
        } else {
            JOptionPane.showMessageDialog(null, "Já está ligado!");
        }        
    }
    @Override
    public void desligar() {
        if (velocidadeMS == 0){
            if (status == true) {
                status = !status;
                JOptionPane.showMessageDialog(null, "O carro foi desligado!");
            } else {
                JOptionPane.showMessageDialog(null, "Já está desligado!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "você precisa zerar a velocidade primeiro");
        } 
    }
    @Override
    public void acelerar(float segundos) {
        if (status == true) {
            float[] frame = new float[(int) segundos];
            for (int i = 0; i < frame.length; i++) {
                this.velocidadeMS += this.aceleracaoMS;
                if ((this.velocidadeMS * 3.6) > km) {
                    this.velocidadeMS -= this.aceleracaoMS;
                    i = frame.length;
                    JOptionPane.showMessageDialog(null, "Velocidade limite atingida!");
                }
                JOptionPane.showMessageDialog(null, (this.velocidadeMS * 3.6)+"km/h", "acelerando...",JOptionPane.INFORMATION_MESSAGE);
            } 
        } else {
            JOptionPane.showMessageDialog(null, "O carro está desligado seu imbecil!");
        }         
    }
    @Override
    public void frear(float segundos) {
        if (status == true) {
            float[] frame = new float[(int) segundos];
            for (int i = 0; i < frame.length; i++) {
                this.velocidadeMS -= this.aceleracaoMS;
                if (this.velocidadeMS < 0) {
                    this.velocidadeMS = 0;
                    i = frame.length;
                    JOptionPane.showMessageDialog(null, "Velocidade zerada!");
                }
            JOptionPane.showMessageDialog(null, (this.velocidadeMS * 3.6)+"km/h", "freando...",JOptionPane.INFORMATION_MESSAGE);
            } 
        } else {
            JOptionPane.showMessageDialog(null, "O carro está desligado seu imbecil!");
        }        
    }
    @Override
    public void pxMao() {
        JOptionPane.showMessageDialog(null, "Freio de Mão Ativado!"); 
        aceleracaoMS = 0;       
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public short getAno() {
        return ano;
    }
    public void setAno(short ano) {
        this.ano = ano;
    }
    public float getKm() {
        return km;
    }
    public void setKm(float km) {
        this.km = km;
    }
    public String getCb() {
        return cb;
    }
    public void setCb(String cb) {
        this.cb = cb;
    }   
    public float getAceleracaoMS() {
        return aceleracaoMS;
    }
    public void setAceleracaoMS(float aceleracaoMS) {
        this.aceleracaoMS = aceleracaoMS;
    }
    public void print() {
        JOptionPane.showMessageDialog(null, "Aceleração em m/s²" + aceleracaoMS + ", ano=" + ano + ", cb=" + cb + ", chassi=" + chassi + ", cor="
                + cor + ", km=" + km + ", modelo=" + modelo + ", nome=" + nome + ", placa=" + placa + ", potencia="
                + potencia + ", status=" + status + ", velocidadeMS=" + velocidadeMS + "]");
    }
    
}
