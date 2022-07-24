package com.example.languagetranslater;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.languagetranslater.Languages.Hindi;

import java.util.ArrayList;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    //implements LocaleListener
    //android.content.res.Resources res;
    ArrayList<Model> model= new ArrayList<>();
    RecyclerView recyclerView;
    RecyclerAdapter adapter;
    //Context context;
    //String[] numbers;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

  /*    //  res = getResources();
        //context = getApplicationContext();
//        adapter.setLocaleListener(this); // some change here
      //  numbers = res.getStringArray(R.array.abc);
*/
        button=findViewById(R.id.confirm);
        recyclerView = findViewById(R.id.recyclerview);
        //////////////////////////////////
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(adapter.getSelected().size() > 0) {
                    StringBuilder stringBuilder = new StringBuilder();

                    for( int i =0 ; i< adapter.getSelected().size(); i++){
                        stringBuilder.append(adapter.getSelected().get(i).getLanguage1());
                        stringBuilder.append(" \n ");
                        stringBuilder.append(adapter.getSelected().get(i).getLanguage2());
                        stringBuilder.append(" \n ");
                    }
                    ShowToast(stringBuilder.toString().trim());
                    Intent intent= new Intent(MainActivity.this,Hindi.class);
                    startActivity(intent);
                    //intent.putExtra("language1",adapter.getSelected().get().getLanguage1());
                }else
                    ShowToast("No Selection");
            }
        });
       // recyclerView.addItemDecoration(new DividerItemDecoration(this,LinearLayoutManager.VERTICAL));
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(3, LinearLayoutManager.VERTICAL));

        model.add(new Model("हिन्दी","Hindi"));
        model.add(new Model("राजस्थानी","Rajasthani"));
        model.add(new Model("ਪੰਜਾਬੀ","Punjabi"));
        model.add(new Model("ગુજરાતી","Gujarati"));
        model.add(new Model("हरियाणवी","Haryanvi"));
        model.add(new Model("भोजपुरी","Bhojpuri"));
        model.add(new Model("मराठी","Marathi"));
        model.add(new Model("বাংলা","Bengali"));
        model.add(new Model("অসমীয়া","Assamese"));
        model.add(new Model("മലയാളം","Malayalam"));
        model.add(new Model("ಕನ್ನಡ","Kannada"));
        model.add(new Model("اردو","Urdu"));
        model.add(new Model("తెలుగు","Telugu"));
        model.add(new Model("தமிழ்","Tamil"));
        model.add(new Model("ଓଡିଆ","Odia"));
        model.add(new Model("English","English"));

        adapter =new RecyclerAdapter(this,model);
        recyclerView.setAdapter(adapter);
    }
  /*  public void setLocale(String lang) {
        Locale myLocale = new Locale(lang);
        Resources res = context.getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = myLocale;
        res.updateConfiguration(conf, dm);

    } */

    private void ShowToast(String msg){
        Toast.makeText(this,msg, Toast.LENGTH_SHORT).show();
    }
}