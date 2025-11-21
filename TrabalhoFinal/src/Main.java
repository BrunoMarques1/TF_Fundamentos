public class Main {
    public static void main(String[] args) {
        Medico medico1 = new Medico(123, "Jorge", "Otorrino");
        //System.out.println(medico1);
        //System.out.println("----------------------");
        medico1.setNome("Janaina");
        //System.out.println(medico1);

        Paciente paciente1 = new Paciente(1,"Bruno");
        Data data1 = new Data(12,12,2022);
        Consulta consulta = new Consulta(data1,medico1,paciente1,12.12);

        System.out.println(consulta);

    }

}