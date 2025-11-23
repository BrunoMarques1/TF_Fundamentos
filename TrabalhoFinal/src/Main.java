public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Medico medico1 = new Medico(1, "Bob", "Otorrino");
        Medico medico2 = new Medico(2, "Patrick", "Oftalmo");
        Medico medico3 = new Medico(3, "Sandy", "Dentista");

        Paciente paciente1 = new Paciente(1,"Alan");
        Paciente paciente2 = new Paciente(2,"Abel");
        Paciente paciente3 = new Paciente(3,"Jorge");

        Data data1 = new Data(12,12,2022);
        Data data2 = new Data(11,11,3021);
        Data data3 = new Data(10,10,3000);

        Consulta consulta1 = new Consulta(1,data1,medico1,paciente1,12.12);
        Consulta consulta2 = new Consulta(2,data2,medico2,paciente2,11.11);
        Consulta consulta3 = new Consulta(3,data3,medico3,paciente3,15.13);

        agenda.adicionarConsulta(consulta1);
        agenda.adicionarConsulta(consulta2);
        agenda.adicionarConsulta(consulta3);

        //agenda.mostraAgenda();
        System.out.println("--------------");

        System.out.println(agenda.buscarConsultaMaisBarata());





    }

}