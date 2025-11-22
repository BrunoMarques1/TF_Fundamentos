public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Medico medico1 = new Medico(123, "Jorge", "Otorrino");
        //System.out.println(medico1);
        //System.out.println("----------------------");
        //medico1.setNome("Janaina");
        //System.out.println(medico1);
        //System.out.println("----------------------");
        //System.out.println("Consulta 1");
        Paciente paciente1 = new Paciente(1,"Bruno");
        Data data1 = new Data(12,12,2022);
        Consulta consulta1 = new Consulta(1,data1,medico1,paciente1,12.12);
        //System.out.println(consulta1);

        Medico medico2 = new Medico(123, "Marcia", "Dentista");
        //System.out.println("----------------------");
        //System.out.println("Consulta 2");
        Paciente paciente2 = new Paciente(2,"Jorge");
        Data data2 = new Data(11,11,2021);
        Consulta consulta2 = new Consulta(2,data2,medico2,paciente2,11.11);
        //System.out.println(consulta2);
        Paciente paciente3 = new Paciente(3,"Jorge");
        Data data3 = new Data(11,11,3021);
        Consulta consulta3 = new Consulta(3,data3,medico2,paciente3,15.13);

        agenda.adicionarConsulta(consulta1);
        agenda.adicionarConsulta(consulta2);
        agenda.adicionarConsulta(consulta3);
        //agenda.mostraAgenda();
        //agenda.removerConsulta(1);
        //System.out.println("==========");
//        agenda.mostraAgenda();
        Consulta vetorConsultasMedico[] = agenda.buscarConsultaMedico("Marcia");
        System.out.println("-----------------");
        //for(int i=0; i<vetorConsultasMedico.length ; i++){
        //    System.out.println(vetorConsultasMedico[i]);
        //    System.out.println("-----------------");
        //}
        //System.out.println(agenda.buscarConsultaPaciente(3));
//        System.out.println(agenda.buscarConsultaPorNro(3));
    }

}