package com.example.spinner;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView imagem;
    Spinner data;
    private TextView capital,idh,populacao,pib;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        capital = (TextView) findViewById(R.id.capital);
        idh = (TextView) findViewById(R.id.idh);
        populacao = (TextView) findViewById(R.id.populacao);
        pib = (TextView) findViewById(R.id.pib);
        data = (Spinner) findViewById(R.id.data);
        imagem = (ImageView) findViewById(R.id.imagem);
        //Construir um array com as opçoes//
        final List<String> datas = new ArrayList<String>();

        //Add itens no array
        datas.add("Acre");
        datas.add("Alagoas");
        datas.add("Amazonas");
        datas.add("Bahia");
        datas.add("Ceará");
        datas.add("Espirito Santo");
        datas.add("Goiás");
        datas.add("Maranhão");
        datas.add("Mato Grosso");
        datas.add("Mato Grosso do Sul");
        datas.add("Minas Gerais");
        datas.add("Pará");
        datas.add("Paraíba");
        datas.add("Paraná");
        datas.add("Pernambuco");
        datas.add("Piauí");
        datas.add("Rio De Janeiro");
        datas.add("Rio Grande do Norte");
        datas.add("Rio Grande do Sul");
        datas.add("Rondônia");
        datas.add("Roraima");
        datas.add("Santa Catarina");
        datas.add("São Paulo");
        datas.add("Sergipe");
        datas.add("Tocantins");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,datas);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        data.setAdapter(adapter);


        data.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {


                //Toast.makeText(getBaseContext(), datas.get(position), Toast.LENGTH_SHORT).show();
                if(data.getSelectedItem().equals(("Acre"))){
                    imagem.setImageResource(R.drawable.acre);
                    capital.setText("Rio Branco");
                    idh.setText("0,727");
                    populacao.setText("790 101 milhões 2021");
                    pib.setText("R$ 15.630 ");
                }else if(data.getSelectedItem().equals("Alagoas")){
                    imagem.setImageResource(R.drawable.alagoas);
                    capital.setText("Maceió");
                    idh.setText(" 0,634");
                    populacao.setText("3.365.351 milhões 2021 (");
                    pib.setText("R$ 58,964 ");
                }else if(data.getSelectedItem().equals("Amapá")){
                    imagem.setImageResource(R.drawable.amapa);
                    capital.setText("Macapá");
                    idh.setText("0,780");
                    populacao.setText("877.613 ");
                    pib.setText(" R$ 17,4");
                }else if(data.getSelectedItem().equals("Amazonas")){
                    imagem.setImageResource(R.drawable.amazonas);
                    capital.setText("Manaus");
                    idh.setText("0,737");
                    populacao.setText(" 29,6 milhões");
                    pib.setText("R$ 126,31 bi");
                }else if(data.getSelectedItem().equals("Bahia")){
                    imagem.setImageResource(R.drawable.bahia);
                    capital.setText("Salvador");
                    idh.setText("0,742. 20°");
                    populacao.setText("14.985.284 mi");
                    pib.setText(" R$ 84,7 bi");
                }else if(data.getSelectedItem().equals("Ceará")){
                    imagem.setImageResource(R.drawable.ceara);
                    capital.setText("Fortaleza");
                    idh.setText(" 0,735");
                    populacao.setText(" 9.240.580");
                    pib.setText("R$ 40.688,1 ");
                }else if(data.getSelectedItem().equals("Espirito Santo")){
                    imagem.setImageResource(R.drawable.espiritosanto);
                    capital.setText("Vitória");
                    idh.setText("0,740");
                    populacao.setText("4.108.508");
                    pib.setText("R$ 39,9 bi");
                }else if(data.getSelectedItem().equals("Goiás")){
                    imagem.setImageResource(R.drawable.goias);
                    capital.setText("Goiânia");
                    idh.setText(" 0,735");
                    populacao.setText("7 206 589");
                    pib.setText("R$ 31,4 bi");
                }else if(data.getSelectedItem().equals("Maranhão")){
                    imagem.setImageResource(R.drawable.maranhao);
                    capital.setText("São Luís");
                    idh.setText("0,768");
                    populacao.setText("7.153.262 ");
                    pib.setText("R$ 97,340 bi");
                }else if(data.getSelectedItem().equals("Mato Grosso")) {
                    imagem.setImageResource(R.drawable.matogrosso);
                    capital.setText(" Cuiabá");
                    idh.setText("0.773");
                    populacao.setText("3 567 234");
                    pib.setText("R$ 965 bi");
                }else if(data.getSelectedItem().equals("Mato Grosso do Sul")){
                    imagem.setImageResource(R.drawable.matogrossosul);
                    capital.setText("Campo Grande");
                    idh.setText("0,762");
                    populacao.setText("2.839.188");
                    pib.setText("R$ 30,2 bi");
                }else if(data.getSelectedItem().equals("Minas Gerais")){
                    imagem.setImageResource(R.drawable.minasgerais);
                    capital.setText("Belo Horizonte");
                    idh.setText("0,731");
                    populacao.setText("2 530 701");
                    pib.setText("R$ 805,5 bi");
                }else if(data.getSelectedItem().equals("Pará")){
                    imagem.setImageResource(R.drawable.para);
                    capital.setText("Belém");
                    idh.setText("0,755");
                    populacao.setText("213,3 mi");
                    pib.setText("R$ 8,7 tri");
                }else if(data.getSelectedItem().equals("Paraiba")){
                    imagem.setImageResource(R.drawable.paraiba);
                    capital.setText("João Pessoa");
                    idh.setText(" 0,718");
                    populacao.setText(" 4.059.905");
                    pib.setText("67.986");
                }else if(data.getSelectedItem().equals("Paraná")){
                    imagem.setImageResource(R.drawable.parana);
                    capital.setText("Curitiba");
                    idh.setText(" 0,761 ");
                    populacao.setText(" 11.597.484 ");
                    pib.setText("R$ 132,84 bi");
                }else if(data.getSelectedItem().equals("Pernambuco")){
                    imagem.setImageResource(R.drawable.pernambuco);
                    capital.setText("Recife");
                    idh.setText("0,772");
                    populacao.setText("9.674.73 ");
                    pib.setText("R$ 233,4 bi");
                }else if(data.getSelectedItem().equals("Piauí")){
                    imagem.setImageResource(R.drawable.piaui);
                    capital.setText("Teresina ");
                    idh.setText("0,713");
                    populacao.setText(" 3.289.290");
                    pib.setText("R$ 52,7 bi");
                }else if(data.getSelectedItem().equals("Rio de Janeiro")){
                    imagem.setImageResource(R.drawable.riojaneiro);
                    capital.setText("Rio de Janeiro");
                    idh.setText("0,832");
                    populacao.setText("17 463 349");
                    pib.setText("R$ 769,38 bi");
                }else if(data.getSelectedItem().equals("Rio Grande do Sul")){
                    imagem.setImageResource(R.drawable.riograndesul);
                    capital.setText("Porto Alegre");
                    idh.setText("0,661");
                    populacao.setText("10.693.929");
                    pib.setText("R$ 50.840,40");
                }else if(data.getSelectedItem().equals("Rio Grande do Norte")){
                    imagem.setImageResource(R.drawable.riograndenorte);
                    capital.setText("Natal ");
                    idh.setText("0,684");
                    populacao.setText("3.560.903 ");
                    pib.setText(" R$ 85 543 679 mil.");
                }else if(data.getSelectedItem().equals("Rondônia")){
                    imagem.setImageResource(R.drawable.rondonia);
                    capital.setText("SAJKhdiuoas");
                    idh.setText("saiodhjoiasjdio");
                    populacao.setText("KSÇJDOPA");
                    pib.setText("ASOIDjhaiowsjd");
                }else if(data.getSelectedItem().equals("Roraima")){
                    imagem.setImageResource(R.drawable.roraima);
                    capital.setText("Boa Vista");
                    idh.setText("0,752");
                    populacao.setText("652 713");
                    pib.setText("R$ 14,3 bi");
                }else if(data.getSelectedItem().equals("Santa Catarina")){
                    imagem.setImageResource(R.drawable.santacatarina);
                    capital.setText("São Francisco do Sul");
                    idh.setText("0,674");
                    populacao.setText(" 7.338.443");
                    pib.setText("R$ 323,3 bi");
                }else if(data.getSelectedItem().equals("São Paulo")){
                    imagem.setImageResource(R.drawable.saopaulo);
                    capital.setText("São Paulo");
                    idh.setText(" 0,783");
                    populacao.setText("350 mil");
                    pib.setText(" R$ 8,7 tri");
                }else if(data.getSelectedItem().equals("Sergipe")){
                    imagem.setImageResource(R.drawable.sergipe);
                    capital.setText("Aracaju");
                    idh.setText("0,665");
                    populacao.setText("2,338 milhões ");
                    pib.setText("R$ 44.689 mi");
                }else if(data.getSelectedItem().equals("Tocantins")){
                    imagem.setImageResource(R.drawable.tocantins);
                    capital.setText("Palmas");
                    idh.setText("0,699");
                    populacao.setText("1,6 milhão");
                    pib.setText("R$ 2 257,7 bi");
                }



            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}