package com.bkacad.nnt.lab1listviewd02k11;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lvCountry;
    private List<Country> listCountry;
    private MyAdapter myAdapter;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.main_menu_action1:
                Toast.makeText(MainActivity.this, "Action 1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.main_menu_action2:
                // Đưa ra các hành động khác - tuỳ chọn
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvCountry = findViewById(R.id.lv_main_country);

        // Fake dữ liệu
        listCountry = new ArrayList<>();
        listCountry.add(new Country("https://thuvienvector.com/upload/images/thumbs/vector-la-co-quoc-ky-viet-nam-tung-bay-562.webp",
                "Việt Nam","Ha Nội", "Việt Nam, tên gọi chính thức là Cộng hòa Xã hội chủ nghĩa Việt Nam, là quốc gia nằm ở cực Đông của bán đảo Đông Dương thuộc khu vực Đông Nam Á, giáp với Lào, Campuchia, Trung Quốc, biển Đông và vịnh Thái Lan."));

        listCountry.add(new Country("https://evaair.biz.vn/Img.ashx?635349590550010000.jpg","Hoa Kỳ", "Washington D.C","Hoa Kỳ, hay còn được gọi là Mỹ, tên đầy đủ là Hợp chúng quốc Hoa Kỳ, là một quốc gia cộng hòa lập hiến liên bang thuộc châu Mỹ. Quốc gia này nằm tại Tây Bán cầu, lãnh thổ bao gồm 50 tiểu bang và 1 đặc khu liên bang, thủ đô là Washington, D.C., thành phố lớn nhất là New York"));

        // Set adapter cho listview
        myAdapter = new MyAdapter(this, listCountry);
        lvCountry.setAdapter(myAdapter);

        // Xử lý sự kiện khi click vào từng item của listview
        lvCountry.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Gửi cả 1 object sang bên Details Activity
                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                intent.putExtra("country", listCountry.get(position));
                startActivity(intent);
            }
        });


    }
}