package calendario;

/* Crie uma classe chamada Calendario e dentro dela, um método chamado converteMes(int mes).

Esse método deve se comportar da seguinte forma:
Ao receber um valor (11, por exemplo) deve retornar o nome “Novembro”.

Deve haver mais dois métodos:
◦ 1) converteDataParaTexto(int dia, int mes, int ano) que recebe uma entrada como (12,10,2021) e retorna: Doze de Outubro de dois
mil e vinte e um
◦ 2) converteDataParaNumero(String dia) que recebe um valor como “trinta e um” e converte para número (31)
IMPORTANTE: É CLARO que as exceções devem ser tratadas;
Fazer modelagem, cardinalidade e implementar */

public class Calendario {

    String[] unidade = {
        "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez",
        "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"
    };

    String[] dezenas = {
        "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"
    };

    String[] centenas = {
        "cem", "cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos"
    };

    public String converteMes(int mes) {
        switch (mes) {
            case 1: return "Janeiro";
            case 2: return "Fevereiro";
            case 3: return "Março";
            case 4: return "Abril";
            case 5: return "Maio";
            case 6: return "Junho";
            case 7: return "Julho";
            case 8: return "Agosto";
            case 9: return "Setembro";
            case 10: return "Outubro";
            case 11: return "Novembro";
            case 12: return "Dezembro";
            default: return "Mês inválido";
        }
    }

    public String converteDias(int dia) {
        if (dia < 1 || dia > 31) return "Dia inválido";
        if (dia <= 19) return unidade[dia - 1];
        int dez = dia / 10;
        int uni = dia % 10;
        String texto = dezenas[dez - 2];
        if (uni > 0) texto += " e " + unidade[uni - 1];
        return texto;
    }

    public String converteAnos(int ano) {
        if (ano < 1000 || ano > 9999) return "Ano inválido";

        int mil = ano / 1000;
        int cem = (ano % 1000) / 100;
        int dez = (ano % 100);

        StringBuilder sb = new StringBuilder();
        sb.append(unidade[mil - 1]).append(" mil");

        if (cem > 0) {
            if (cem == 1 && dez == 0) sb.append(" e ").append(centenas[0]);
            else sb.append(" e ").append(centenas[cem]);
        }

        if (dez > 0) {
            sb.append(" e ");
            if (dez <= 19) {
                sb.append(unidade[dez - 1]);
            } else {
                int dz = dez / 10;
                int un = dez % 10;
                sb.append(dezenas[dz - 2]);
                if (un > 0) sb.append(" e ").append(unidade[un - 1]);
            }
        }

        return sb.toString();
    }

    public String converteDataParaTexto(int dia, int mes, int ano) {
        try {
            return converteDias(dia) + " de " + converteMes(mes) + " de " + converteAnos(ano);
        } catch (Exception e) {
            return "Data inválida";
        }
    }

    public int converteDataParaNumero(String diaTexto) {
        diaTexto = diaTexto.toLowerCase().trim();
        for (int i = 0; i < 31; i++) {
            if (i < 19) {
                if (unidade[i].equals(diaTexto)) return i + 1;
            } else {
                int dez = i / 10;
                int uni = i % 10;
                String comp = dezenas[dez - 2];
                if (uni > 0) comp += " e " + unidade[uni - 1];
                if (comp.equals(diaTexto)) return i + 1;
            }
        }
        return -1; // dia inválido
    }
} 
