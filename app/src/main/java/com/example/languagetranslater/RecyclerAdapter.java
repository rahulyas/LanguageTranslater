package com.example.languagetranslater;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.languagetranslater.Languages.Hindi;

import java.util.ArrayList;
import java.util.Locale;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    int row_index =0;
    private LocaleListener mListener;  //some change here

    Context context;
    ArrayList<Model> model;

    public RecyclerAdapter(Context context, ArrayList<Model> model) {
        this.context = context;
        this.model = model;
    }

    @NonNull
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.list_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        /*    Model model1=(Model) model.get(position);
        holder.language1.setText(model1.language1);
        holder.language2.setText(model1.language2);
*/

        /*  switch(position){
            case 0:
                holder.language1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "हिन्दी", Toast.LENGTH_SHORT).show();
                    }
                });
                holder.language2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "Hindi", Toast.LENGTH_SHORT).show();
                    }
                });
                holder.cardview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "हिन्दी" +"\n" +"Hindi" , Toast.LENGTH_SHORT).show();
//                        mListener.setLocale("hi");//calling function
                        Intent intent = new Intent(context, Hindi.class);
                        intent.putExtra("language1",model1.language1);
                        context.startActivity(intent);
                        row_index=position;
                        notifyDataSetChanged();

                        // setLanguage(this,"hi");


                    }
                });
                break;
            case 1:
                holder.language1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "राजस्थानी", Toast.LENGTH_SHORT).show();
                    }
                });
                holder.language2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "Rajasthani", Toast.LENGTH_SHORT).show();
                    }
                });
                holder.cardview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "राजस्थानी" +"\n" +"Rajasthani" , Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, Hindi.class);
                        intent.putExtra("language1",model1.language1);
                        context.startActivity(intent);
                        row_index=position;
                        notifyDataSetChanged();
                    }
                });
                break;
            case 2:
                holder.language1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "ਪੰਜਾਬੀ", Toast.LENGTH_SHORT).show();
                    }
                });
                holder.language2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "Punjabi", Toast.LENGTH_SHORT).show();
                    }
                });
                holder.cardview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "ਪੰਜਾਬੀ" +"\n" +"Punjabi" , Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, Hindi.class);
                        intent.putExtra("language1",model1.language1);
                        context.startActivity(intent);
                        row_index=position;
                        notifyDataSetChanged();
                    }
                });
                break;
            case 3:
                holder.language1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "ગુજરાતી", Toast.LENGTH_SHORT).show();
                    }
                });
                holder.language2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "Gujarati", Toast.LENGTH_SHORT).show();
                    }
                });
                holder.cardview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "ગુજરાતી" +"\n" +"Gujarati" , Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, Hindi.class);
                        intent.putExtra("language1",model1.language1);
                        context.startActivity(intent);
                        row_index=position;
                        notifyDataSetChanged();
                    }
                });
                break;
            case 4:
                holder.language1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "हरियाणवी", Toast.LENGTH_SHORT).show();
                    }
                });
                holder.language2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "Haryanvi", Toast.LENGTH_SHORT).show();
                    }
                });
                holder.cardview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "हरियाणवी" +"\n" +"Haryanvi" , Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, Hindi.class);
                        intent.putExtra("language1",model1.language1);
                        context.startActivity(intent);
                        row_index=position;
                        notifyDataSetChanged();
                    }
                });
                break;
            case 5:
                holder.language1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "भोजपुरी", Toast.LENGTH_SHORT).show();
                    }
                });
                holder.language2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "Bhojpuri", Toast.LENGTH_SHORT).show();
                    }
                });
                holder.cardview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "भोजपुरी" +"\n" +"Bhojpuri" , Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, Hindi.class);
                        intent.putExtra("language1",model1.language1);
                        context.startActivity(intent);
                        row_index=position;
                        notifyDataSetChanged();
                    }
                });
                break;
            case 6:
                holder.language1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "मराठी", Toast.LENGTH_SHORT).show();
                    }
                });
                holder.language2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "Marathi", Toast.LENGTH_SHORT).show();
                    }
                });
                holder.cardview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "मराठी" +"\n" +"Marathi" , Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, Hindi.class);
                        intent.putExtra("language1",model1.language1);
                        context.startActivity(intent);
                        row_index=position;
                        notifyDataSetChanged();
                    }
                });
                break;
            case 7:
                holder.language1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "বাংলা", Toast.LENGTH_SHORT).show();
                    }
                });
                holder.language2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "Bengali", Toast.LENGTH_SHORT).show();
                    }
                });
                holder.cardview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "বাংলা" +"\n" +"Bengali" , Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, Hindi.class);
                        intent.putExtra("language1",model1.language1);
                        context.startActivity(intent);
                        row_index=position;
                        notifyDataSetChanged();
                    }
                });
                break;
            case 8:
                holder.language1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "অসমীয়া", Toast.LENGTH_SHORT).show();
                    }
                });
                holder.language2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "Assamese", Toast.LENGTH_SHORT).show();
                    }
                });
                holder.cardview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "অসমীয়া" +"\n" +"Assamese" , Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, Hindi.class);
                        intent.putExtra("language1",model1.language1);
                        context.startActivity(intent);
                        row_index=position;
                        notifyDataSetChanged();
                    }
                });
                break;
            case 9:
                holder.language1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "മലയാളം", Toast.LENGTH_SHORT).show();
                    }
                });
                holder.language2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "Malayalam", Toast.LENGTH_SHORT).show();
                    }
                });
                holder.cardview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "മലയാളം" +"\n" +"Malayalam" , Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, Hindi.class);
                        intent.putExtra("language1",model1.language1);
                        context.startActivity(intent);
                        row_index=position;
                        notifyDataSetChanged();
                    }
                });
                break;
            case 10:
                holder.language1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "हಕನ್ನಡ", Toast.LENGTH_SHORT).show();
                    }
                });
                holder.language2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "Kannada", Toast.LENGTH_SHORT).show();
                    }
                });
                holder.cardview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "हಕನ್ನಡ" +"\n" +"Kannada" , Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, Hindi.class);
                        intent.putExtra("language1",model1.language1);
                        context.startActivity(intent);
                        row_index=position;
                        notifyDataSetChanged();
                    }
                });
                break;
            case 11:
                holder.language1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "اردو", Toast.LENGTH_SHORT).show();
                    }
                });
                holder.language2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "Urdu", Toast.LENGTH_SHORT).show();
                    }
                });
                holder.cardview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "اردو" +"\n" +"Urdu" , Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, Hindi.class);
                        intent.putExtra("language1",model1.language1);
                        context.startActivity(intent);
                        row_index=position;
                        notifyDataSetChanged();
                    }
                });
                break;
            case 12:
                holder.language1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "తెలుగు", Toast.LENGTH_SHORT).show();
                    }
                });
                holder.language2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "Telugu", Toast.LENGTH_SHORT).show();
                    }
                });
                holder.cardview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "తెలుగు" +"\n" +"Telugu" , Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, Hindi.class);
                        intent.putExtra("language1",model1.language1);
                        context.startActivity(intent);
                        row_index=position;
                        notifyDataSetChanged();
                    }
                });
                break;
            case 13:
                holder.language1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "தமிழ்", Toast.LENGTH_SHORT).show();
                    }
                });
                holder.language2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "Tamil", Toast.LENGTH_SHORT).show();
                    }
                });
                holder.cardview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "தமிழ்" +"\n" +"Tamil" , Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, Hindi.class);
                        intent.putExtra("language1",model1.language1);
                        context.startActivity(intent);
                        row_index=position;
                        notifyDataSetChanged();
                    }
                });
                break;
            case 14:
                holder.language1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "ଓଡିଆ", Toast.LENGTH_SHORT).show();
                    }
                });
                holder.language2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "Odia", Toast.LENGTH_SHORT).show();
                    }
                });
                holder.cardview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "ଓଡିଆ" +"\n" +"Odia" , Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, Hindi.class);
                        intent.putExtra("language1",model1.language1);
                        context.startActivity(intent);
                        row_index=position;
                        notifyDataSetChanged();
                    }
                });
                break;
            case 15:
                holder.language1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "English", Toast.LENGTH_SHORT).show();
                    }
                });
                holder.language2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "English", Toast.LENGTH_SHORT).show();
                    }
                });
                holder.cardview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "English" +"\n" +"English" , Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, Hindi.class);
                        intent.putExtra("language1",model1.language1);
                        context.startActivity(intent);
                        row_index=position;
                        notifyDataSetChanged();
                    }
                });
                break;
            default:
        }  */

        /* if(row_index==position){
            holder.cardview.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
            holder.language1.setTextColor(Color.parseColor("#FF000000"));
            holder.language2.setTextColor(Color.parseColor("#8C8C8C"));
        }
        else
        {
            holder.cardview.setBackgroundColor(Color.parseColor("#131217"));
            holder.language1.setTextColor(Color.parseColor("#ffffff"));
            holder.language2.setTextColor(Color.parseColor("#ffffff"));
        } */

        holder.bind(model.get(position));

    }

    @Override
    public int getItemCount() {
        return model.size();
    }

  /*  public void setLocaleListener(LocaleListener mainActivity) {
        mListener = mainActivity;
    } */

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView language1,language2;
        CardView cardview;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            language1=itemView.findViewById(R.id.language1);
            language2=itemView.findViewById(R.id.language2);
            cardview=itemView.findViewById(R.id.cardview);
        }
    void bind(final Model model){
        language1.setText(model.language1);
        language2.setText(model.language2);
        cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                model.setSelected(!model.isSelected());
                if(model.isSelected()){
                    cardview.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
                    language1.setTextColor(Color.parseColor("#FF000000"));
                    language2.setTextColor(Color.parseColor("#8C8C8C"));
                }else{
                    cardview.setBackgroundColor(Color.parseColor("#131217"));
                    language1.setTextColor(Color.parseColor("#ffffff"));
                    language2.setTextColor(Color.parseColor("#ffffff"));
                }
            }
        });
    }
}

/*
    public void setLanguage(View.OnClickListener context , String language){
        Locale locale = new Locale(language);
        Resources res = context.getResources();
        Configuration conf = res.getConfiguration();
        conf.setLocale(locale);
        res.updateConfiguration(conf,res.getDisplayMetrics());
    } */

    //Getting All Items Selected
   public ArrayList<Model> getAll(){ return model;}

    //Getting selected when btn clicked
   public ArrayList<Model> getSelected(){
       ArrayList<Model> selected = new ArrayList<>();
       for( int i=0; i< model.size() ; i++){
           if(model.get(i).isSelected()){
               selected.add(model.get(i));
           }
       }
       return selected;
   }

}
