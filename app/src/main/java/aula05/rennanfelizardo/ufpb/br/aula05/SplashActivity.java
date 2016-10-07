package aula05.rennanfelizardo.ufpb.br.aula05;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SplashActivity extends AppCompatActivity implements Runnable{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        int TIME = 2000;


        hideNavigationBar();

        new Handler().postDelayed(this, TIME);
    }

    @Override
    public void run() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    //ocultar a barra de navegacao e barra de status, fazendo a aplicação ser executada
    //momentanamente em tela cheia
    //@TargetApi -> isso define que esse método só será executada a partir dessa versão do android
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void hideNavigationBar(){
        //pega as views de decoração
        View decorView = getWindow().getDecorView();

        //utiliza constantes para saber se será ocultada ou n
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
    }
}
