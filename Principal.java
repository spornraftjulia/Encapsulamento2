public class Principal {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Julia");
        System.out.println(pessoa.getNome());

        pessoa.setIdade(17);
        System.out.println(pessoa.getIdade());


        pessoa.setCelular("(18)99746-7201");
        System.out.println(pessoa.getCelular());
        
        pessoa.setCpf("451.776.108-88");
       System.out.println(pessoa.getCpf());
    }
}