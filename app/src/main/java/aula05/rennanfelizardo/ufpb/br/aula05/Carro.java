package aula05.rennanfelizardo.ufpb.br.aula05;

/**
 * Created by rennanfelizardo on 09/09/16.
 */
public class Carro {

    private int idImage;
    private String nome;

    public Carro(int idImage, String nome) {
        this.idImage = idImage;
        this.nome = nome;
    }

    public int getIdImage() {
        return idImage;
    }

    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
