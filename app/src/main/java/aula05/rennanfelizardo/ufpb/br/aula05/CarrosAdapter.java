package aula05.rennanfelizardo.ufpb.br.aula05;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import static aula05.rennanfelizardo.ufpb.br.aula05.R.id.text_item;


/**
 * Created by rennanfelizardo on 09/09/16.
 *
 * Classe utilizada para manipular os carros na lista
 */
public class CarrosAdapter extends BaseAdapter{

    private List<Carro> carros;
    private Context context;
    private CarrosApplication application;

    public CarrosAdapter(Context context) {
        //context posso manipular qualquer activity
        this.context = context;

        //recuperar a application
        this.application = (CarrosApplication) context.getApplicationContext();

        //apos recuperar a application, posso utilizar os seus métodos
        this.carros = application.getCarros();

    }

    //retorna a quantidade de elementos que tem na lista
    @Override
    public int getCount() {
        return carros.size();
    }

    //pega um objeto da lista
    @Override
    public Object getItem(int i) {
        return carros.get(i);
    }

    //implementa quando o objeto na lista tiver um id, como não tem nao colocaremos nada
    //quando tiver trabalhando com banco por exemplo
    @Override
    public long getItemId(int i) {
        return 0;
    }

    //inflar o layout
    //view - onde estara salvo a view q foi inflada

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //essa eh uma forma ineficiente por isso o android studio reclama, deve-se usar o padrão ViewHolder
        //que verá mais para frente

        View view1 = LayoutInflater.from(context).inflate(R.layout.item_list, viewGroup, false);

        ImageView imageView = (ImageView) view1.findViewById(R.id.ic_item);
        TextView textView = (TextView) view1.findViewById(R.id.text_item);

        Carro carro = carros.get(i);

        textView.setText(carro.getNome());
        Picasso.with(context) // Carrego o contexto onde será exibida a imagem
                .load(carro.getIdImage()) // Carrego a imagem
                .transform(new CircleTransform()) // Informo a forma de transformação da imagem
                .into(imageView); // Aplico a transformação a imagem a view de imagem do xml

        return view1;
    }
}
