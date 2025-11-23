public class Agenda {
    private Consulta consultas[];
    private int indice;


    public Agenda(){
        this.consultas = new Consulta[40];
        this.indice = 0;
    }

    public boolean adicionarConsulta(Consulta consulta){
        if(this.indice < 40){
            this.consultas[this.indice] = consulta;
            this.indice++;
            return true;
        }
        return false;
    }
    public boolean removerConsulta(int nro){
        int posicao = buscaPosicao(nro);
        if(posicao != -1){
            for (int i = posicao; i < this.indice-1; i++) {
                this.consultas[i] = this.consultas[i + 1];
            }
            this.consultas[this.indice - 1] = null;
            this.indice--;
            return true;
        }
        return false;
    }
    public Consulta buscarConsultaPorNro(int nro){
        for(int i=0; i < this.indice; i++){
            if(this.consultas[i].getNro() == nro){
                return this.consultas[i];
            }
        }
        return null;
    }
    public int buscaPosicao(int nro){
        for(int i=0; i<this.indice; i++){
            if(this.consultas[i].getNro() == nro){
                return i;
            }
        }
        return -1;
    }
    public Consulta[] buscarConsultaMedico(String nomeMedico){
        int total = 0;
        for(int i =0; i<this.indice; i++){
            if(this.consultas[i].getMedico().getNome().equals(nomeMedico)){
                total ++;
            }
        }
        Consulta consultasMedico[] = new Consulta[total];
        int j =0;
        for(int i=0; i<this.indice;i++){
            if(this.consultas[i].getMedico().getNome().equals(nomeMedico)){
                consultasMedico[j] = this.consultas[i];
                j++;
            }
        }
        return consultasMedico;
    }
    public Data buscarConsultaPaciente(int codigo){
        for(int i=0; i<this.indice; i++){
            if(this.consultas[i].getPaciente().getCodigo() == codigo){
                return this.consultas[i].getData();
            }
        }
        return null;
    }
    public Consulta[] buscarConsultaData(int dia, int mes, int ano){
        int total = 0;
        for(int i=0; i<this.indice; i++){
            Data data = this.consultas[i].getData();
            if(data.getDia()==dia && data.getMes()==mes && data.getAno()==ano){
                total ++;
            }
        }
        Consulta consultasData[] = new Consulta[total];
        int j = 0;
        for(int i=0; i<this.indice; i++){
            Data data = this.consultas[i].getData();
            if(data.getDia()==dia && data.getMes()==mes && data.getAno()==ano){
                consultasData[j] = this.consultas[i];
                j++;
            }
        }
        return consultasData;
    }
    public double buscarValorConsultasPorEspecialidadeMedica(String especialidade){
        double soma = 0;
        for(int i=0; i<this.indice; i++){
            if(this.consultas[i].getMedico().getEspecialidade().equals(especialidade)){
                soma += this.consultas[i].getValor();
            }
        }
        return soma;
    }
    public void alterarMedico(int nro, Medico medico){
        this.consultas[buscaPosicao(nro)].setMedico(medico);
    }
    public Consulta buscarConsultaMaisBarata(){
        Consulta menor = this.consultas[0];
        for(int i=0; i<this.indice; i++){
            if(this.consultas[i].getValor() < menor.getValor()){
                menor = this.consultas[i];
            }
        }
        return menor;
    }
    public void mostraAgenda(){
        for(int i=0; i < this.indice; i++){
            System.out.println("--------------------");
            System.out.println(this.consultas[i]);
        }
        System.out.println("--------------------");

    }
}
