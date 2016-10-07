package aula05.rennanfelizardo.ufpb.br.aula05;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rennanfelizardo on 09/09/16.
 *
 *
 */
public class CarrosApplication extends Application {

    //Funciona como um singleton, ela eh iniciada sempre q sua aplicacao eh aberta
    //e sempre que for fechada ela termina
    //Funciona como um controller, concentrando todos os metodos de remover, buscar, adicionar etc
    //Usa apenas uma instância para evitar que não use muita memória, já que será usada em várias classes



    private List<Carro> carros;

    @Override
    public void onCreate() {
        super.onCreate();
        carros = new ArrayList<>();
        criarCarros();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    private void criarCarros(){
        carros.add(new Carro(R.drawable.bmw_720, "BMW 720"));
        carros.add(new Carro(R.drawable.camaro, "Camaro"));
        carros.add(new Carro(R.drawable.corvette, "Corvette"));
        carros.add(new Carro(R.drawable.ct6, "CT 6"));
        carros.add(new Carro(R.drawable.db77, "DB77"));
        carros.add(new Carro(R.drawable.gallardo, "Gallardo"));
        carros.add(new Carro(R.drawable.mustang, "Mustang"));
        carros.add(new Carro(R.drawable.paganni_zonda, "Parganni Zonda"));
        carros.add(new Carro(R.drawable.porsche_911, "Porsche 911"));
        carros.add(new Carro(R.drawable.vyron, "Vyron"));
    }

    public List<Carro> getCarros() {
        return carros;
    }
}
