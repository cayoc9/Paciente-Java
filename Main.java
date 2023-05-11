class Main {
  public static void main(String[] args) {
      Paciente[] pacientes = new Paciente[3];
      pacientes[0] = new Paciente("Leticia", 32);
      pacientes[1] = new Paciente("João", 45);
      pacientes[2] = new Paciente("Ana", 18);

      for (Paciente paciente : pacientes) {
          System.out.println(paciente);
      }
  }
}
