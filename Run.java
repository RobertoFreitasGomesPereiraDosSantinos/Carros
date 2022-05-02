package ultima_semana_abril.ultima_aula_abril;

import javax.swing.JOptionPane;

/* Nalberth */
public class Run {
    public static void main(String... args) {
        Carro c1 = new Carro();
        Carro c2 = new Carro();
        Carro c3 = new Carro();
        Carro c4 = new Carro();
        String[] cor = {"Amarelo", "Azul", "Verde", "Vermelho", "Branco", "Preto", "Cinza", "Prata"};
        String[] modelo = {"Onix", "Gol", "Uno", "Argo", "Voyage", "Cronos", "Palio", "HB20"};
        String[] pot = {"70", "150", "200"};
        String[] MS = {"5.6", "3.2", "4.0", "6.1", "7.2", "4.6", "2.2", "5.0"};
        String[] cbKM_L = {"15.6", "14.3", "12.5", "10.2", "8.8", "6.4","4.4","2.8"};
        String[] km = {"160", "180", "200", "220", "240", "260","280","300"};


        // c1.setCor((String) JOptionPane.showInputDialog(null, "Escolha a cor do carro", "Consecionaria", JOptionPane.QUESTION_MESSAGE, null, cor, cor[0]));
        // c1.setModelo((String) JOptionPane.showInputDialog(null, "Escolha o modelo do carro", "Consecionaria", JOptionPane.QUESTION_MESSAGE, null, modelo, modelo[0]));
        // c1.setPotencia(Integer.parseInt((String) JOptionPane.showInputDialog(null, "Escolha a potência do carro em CV", "Consecionaria", JOptionPane.QUESTION_MESSAGE, null, pot, pot[0])));
        // c1.setAceleracaoMS(Float.parseFloat((String) JOptionPane.showInputDialog(null, "Escolha a aceleração do carro em metros por segundo quadrado", "Consecionaria", JOptionPane.QUESTION_MESSAGE, null, MS, MS[0])));
        // c1.setPlaca(JOptionPane.showInputDialog(null,  "Digite a placa a seu gosto", "Consecionaria", JOptionPane.QUESTION_MESSAGE));
        // c1.setChassi(JOptionPane.showInputDialog(null, "Digite o chassi a seu gosto", "Consecionaria", JOptionPane.QUESTION_MESSAGE));
        // c1.setCb((String) JOptionPane.showInputDialog(null, "Escolha o consumo de combustivel em km/L", "Consecionaria", JOptionPane.QUESTION_MESSAGE, null, cbKM_L, cbKM_L[0]));
        // c1.setKm(Float.parseFloat((String) JOptionPane.showInputDialog(null, "Escolha a quilometragem limite do carro", "Consecionaria", JOptionPane.QUESTION_MESSAGE, null, km, km[0])));
        c1.setNome(JOptionPane.showInputDialog(null,  "Digite o nome d seu carro a seu gosto", "Consecionaria", JOptionPane.QUESTION_MESSAGE));

        // c2.setCor((String) JOptionPane.showInputDialog(null, "Escolha a cor do carro", "Consecionaria", JOptionPane.QUESTION_MESSAGE, null, cor, cor[0]));
        // c2.setModelo((String) JOptionPane.showInputDialog(null, "Escolha o modelo do carro", "Consecionaria", JOptionPane.QUESTION_MESSAGE, null, modelo, modelo[0]));
        // c2.setPotencia(Integer.parseInt((String) JOptionPane.showInputDialog(null, "Escolha a potência do carro em CV", "Consecionaria", JOptionPane.QUESTION_MESSAGE, null, pot, pot[0])));
        // c2.setAceleracaoMS(Float.parseFloat((String) JOptionPane.showInputDialog(null, "Escolha a aceleração do carro em metros por segundo quadrado", "Consecionaria", JOptionPane.QUESTION_MESSAGE, null, MS, MS[0])));
        // c2.setPlaca(JOptionPane.showInputDialog(null,  "Digite a placa a seu gosto", "Consecionaria", JOptionPane.QUESTION_MESSAGE));
        // c2.setChassi(JOptionPane.showInputDialog(null, "Digite o chassi a seu gosto", "Consecionaria", JOptionPane.QUESTION_MESSAGE));
        // c2.setCb((String) JOptionPane.showInputDialog(null, "Escolha o consumo de combustivel em km/L", "Consecionaria", JOptionPane.QUESTION_MESSAGE, null, cbKM_L, cbKM_L[0]));
        // c2.setKm(Float.parseFloat((String) JOptionPane.showInputDialog(null, "Escolha a quilometragem limite do carro", "Consecionaria", JOptionPane.QUESTION_MESSAGE, null, km, km[0])));
        c2.setNome(JOptionPane.showInputDialog(null,  "Digite o nome d seu carro a seu gosto", "Consecionaria", JOptionPane.QUESTION_MESSAGE));

        // c3.setCor((String) JOptionPane.showInputDialog(null, "Escolha a cor do carro", "Consecionaria", JOptionPane.QUESTION_MESSAGE, null, cor, cor[0]));
        // c3.setModelo((String) JOptionPane.showInputDialog(null, "Escolha o modelo do carro", "Consecionaria", JOptionPane.QUESTION_MESSAGE, null, modelo, modelo[0]));
        // c3.setPotencia(Integer.parseInt((String) JOptionPane.showInputDialog(null, "Escolha a potência do carro em CV", "Consecionaria", JOptionPane.QUESTION_MESSAGE, null, pot, pot[0])));
        // c3.setAceleracaoMS(Float.parseFloat((String) JOptionPane.showInputDialog(null, "Escolha a aceleração do carro em metros por segundo quadrado", "Consecionaria", JOptionPane.QUESTION_MESSAGE, null, MS, MS[0])));
        // c3.setPlaca(JOptionPane.showInputDialog(null,  "Digite a placa a seu gosto", "Consecionaria", JOptionPane.QUESTION_MESSAGE));
        // c3.setChassi(JOptionPane.showInputDialog(null, "Digite o chassi a seu gosto", "Consecionaria", JOptionPane.QUESTION_MESSAGE));
        // c3.setCb((String) JOptionPane.showInputDialog(null, "Escolha o consumo de combustivel em km/L", "Consecionaria", JOptionPane.QUESTION_MESSAGE, null, cbKM_L, cbKM_L[0]));
        // c3.setKm(Float.parseFloat((String) JOptionPane.showInputDialog(null, "Escolha a quilometragem limite do carro", "Consecionaria", JOptionPane.QUESTION_MESSAGE, null, km, km[0])));
        c3.setNome(JOptionPane.showInputDialog(null,  "Digite o nome d seu carro a seu gosto", "Consecionaria", JOptionPane.QUESTION_MESSAGE));

        // c4.setCor((String) JOptionPane.showInputDialog(null, "Escolha a cor do carro", "Consecionaria", JOptionPane.QUESTION_MESSAGE, null, cor, cor[0]));
        // c4.setModelo((String) JOptionPane.showInputDialog(null, "Escolha o modelo do carro", "Consecionaria", JOptionPane.QUESTION_MESSAGE, null, modelo, modelo[0]));
        // c4.setPotencia(Integer.parseInt((String) JOptionPane.showInputDialog(null, "Escolha a potência do carro em CV", "Consecionaria", JOptionPane.QUESTION_MESSAGE, null, pot, pot[0])));
        // c4.setAceleracaoMS(Float.parseFloat((String) JOptionPane.showInputDialog(null, "Escolha a aceleração do carro em metros por segundo quadrado", "Consecionaria", JOptionPane.QUESTION_MESSAGE, null, MS, MS[0])));
        // c4.setPlaca(JOptionPane.showInputDialog(null,  "Digite a placa a seu gosto", "Consecionaria", JOptionPane.QUESTION_MESSAGE));
        // c4.setChassi(JOptionPane.showInputDialog(null, "Digite o chassi a seu gosto", "Consecionaria", JOptionPane.QUESTION_MESSAGE));
        // c4.setCb((String) JOptionPane.showInputDialog(null, "Escolha o consumo de combustivel em km/L", "Consecionaria", JOptionPane.QUESTION_MESSAGE, null, cbKM_L, cbKM_L[0]));
        // c4.setKm(Float.parseFloat((String) JOptionPane.showInputDialog(null, "Escolha a quilometragem limite do carro", "Consecionaria", JOptionPane.QUESTION_MESSAGE, null, km, km[0])));
        c4.setNome(JOptionPane.showInputDialog(null,  "Digite o nome d seu carro a seu gosto", "Consecionaria", JOptionPane.QUESTION_MESSAGE));

        // c1.ligar();
        // c1.acelerar(18);

        // c2.ligar();
        // c2.acelerar(10);
        // c2.desligar();
        // c2.frear(12);

        // c3.ligar();
        // c3.acelerar(60);
        // c3.frear(30);

        // c4.acelerar(20);
        // c4.ligar();
        // c4.acelerar(20);
        // c4.pxMao();

        String[] opt01 = {c1.getNome(),c2.getNome(),c3.getNome(), c4.getNome()};
        
        int esc01 = JOptionPane.showOptionDialog(null, "escolha um de seus carros", "garagem", JOptionPane.CLOSED_OPTION, JOptionPane.QUESTION_MESSAGE, null, opt01, opt01[0]);
        switch (esc01) {
            case 0:
                String[] esc02 = {"Acelerar","Frear","Puxar freio de mão","Ligar","Desligar"};
                if (JOptionPane.showOptionDialog(null, "O que você deseja fazer?", c1.getNome(), JOptionPane.CLOSED_OPTION, JOptionPane.QUESTION_MESSAGE,null,esc02, esc02[0]) == 0) {
                    
                }
                break;
        
            default:
                break;
        }
    }
}
