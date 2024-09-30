package app.ubu.clothes03;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.clothes03.model.smarthome;

import java.util.ArrayList;
import java.util.List;

public class Product extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        String roomType = getIntent().getStringExtra("roomType");

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        List<smarthome> smarthomes = new ArrayList<>();

        if ("t-shirt".equals(roomType)) {
            smarthome smarthome1 = new smarthome();
            smarthome1.setSmarthome_name("สีขาาว");
            smarthome1.setSmarthome_image("https://i.pinimg.com/originals/b6/fc/95/b6fc956f065eb4a7d07dd98f7208f97c.jpg");
            smarthome1.setSmarthome_detail("ร้านขายเสื้อยืด");
            smarthome1.setSmarthome_price("1000");
            smarthomes.add(smarthome1);

            smarthome smarthome2 = new smarthome();
            smarthome2.setSmarthome_name("สีดำ");
            smarthome2.setSmarthome_image("https://i.pinimg.com/originals/6e/57/78/6e5778ec258ebdc7f7e4a5721e903180.jpg");
            smarthome2.setSmarthome_detail("ร้านขายเสื้อยืด");
            smarthome2.setSmarthome_price("900");
            smarthomes.add(smarthome2);

            smarthome smarthome3 = new smarthome();
            smarthome3.setSmarthome_name("สีน้ำเงิน");
            smarthome3.setSmarthome_image("https://i.pinimg.com/originals/65/eb/17/65eb177ff9497dc7f527e9a92db2df4b.png");
            smarthome3.setSmarthome_detail("ร้านขายเสื้อยืด");
            smarthome3.setSmarthome_price("1500");
            smarthomes.add(smarthome3);

        } else if ("Crop".equals(roomType)) {
            smarthome smarthome1 = new smarthome();
            smarthome1.setSmarthome_name("ขาว");
            smarthome1.setSmarthome_image("https://i.pinimg.com/originals/4c/c0/d9/4cc0d9be407e69860fffa50ab52d61d5.jpg");
            smarthome1.setSmarthome_detail("ร้านขายเสื้อผ้ามินิมอล");
            smarthome1.setSmarthome_price("900");
            smarthomes.add(smarthome1);

            smarthome smarthome2 = new smarthome();
            smarthome2.setSmarthome_name("น้ำเงิน");
            smarthome2.setSmarthome_image("https://i.pinimg.com/originals/47/da/72/47da72c52e4fce025cd3ba139c9d707b.jpg");
            smarthome2.setSmarthome_detail("ร้านขายเสื้อผ้ามินิมอล");
            smarthome2.setSmarthome_price("500");
            smarthomes.add(smarthome2);

            smarthome smarthome3 = new smarthome();
            smarthome3.setSmarthome_name("ดำ");
            smarthome3.setSmarthome_image("https://i.pinimg.com/originals/65/64/06/65640623eb906b67b392d4628bdb5dbc.jpg");
            smarthome3.setSmarthome_detail("ร้านขายเสื้อผ้ามินิมอล");
            smarthome3.setSmarthome_price("1500");
            smarthomes.add(smarthome3);

        } else if ("Hoodie".equals(roomType)) {
            smarthome smarthome1 = new smarthome();
            smarthome1.setSmarthome_name("สีเขียว");
            smarthome1.setSmarthome_image("https://i.pinimg.com/originals/9c/31/c5/9c31c5624f291924450529e33a4cc494.jpg");
            smarthome1.setSmarthome_detail("ร้านขายฮู้ด");
            smarthome1.setSmarthome_price("1500");
            smarthomes.add(smarthome1);

            smarthome smarthome2 = new smarthome();
            smarthome2.setSmarthome_name("สีเทา");
            smarthome2.setSmarthome_image("https://i.pinimg.com/originals/24/4c/0f/244c0fa3a16eabe08e9f2d953f14b876.jpg");
            smarthome2.setSmarthome_detail("ร้านขายฮู้ด");
            smarthome2.setSmarthome_price("1020");
            smarthomes.add(smarthome2);

            smarthome smarthome3 = new smarthome();
            smarthome3.setSmarthome_name("สีขาว");
            smarthome3.setSmarthome_image("https://zipyhoodie.com/cdn/shop/files/CasualEssentialHoodie_6_477x483.webp?v=1704736112");
            smarthome3.setSmarthome_detail("ร้านขายฮู้ด");
            smarthome3.setSmarthome_price("1700");
            smarthomes.add(smarthome3);

        } else if ("Jacket".equals(roomType)) {
            smarthome smarthome1 = new smarthome();
            smarthome1.setSmarthome_name("สีฟ้า");
            smarthome1.setSmarthome_image("https://www.kkboxly.com/cdn/shop/files/936b0ad07efca80460c2b1cfc38d1e3c_1024x1024.jpg?v=1695626719");
            smarthome1.setSmarthome_detail("ร้านเสื้อแขนยาว");
            smarthome1.setSmarthome_price("2000");
            smarthomes.add(smarthome1);

            smarthome smarthome2 = new smarthome();
            smarthome2.setSmarthome_name("สีดำ");
            smarthome2.setSmarthome_image("https://majesda.com/cdn/shop/products/majesda-solid-color-stand-collar-winter-coat-outfit-ideas-streetwear-fashion-2.jpg?v=1677157309&width=700");
            smarthome2.setSmarthome_detail("ร้านเสื้อแขนยาว");
            smarthome2.setSmarthome_price("1000");
            smarthomes.add(smarthome2);

            smarthome smarthome3 = new smarthome();
            smarthome3.setSmarthome_name("สีขาว");
            smarthome3.setSmarthome_image("https://i.pinimg.com/originals/6a/32/03/6a3203b98f245437510768d60bfe8fb6.jpg");
            smarthome3.setSmarthome_detail("ร้านเสื้อแขนยาว");
            smarthome3.setSmarthome_price("5000");
            smarthomes.add(smarthome3);
        }

        mAdapter = new MyAdptersmar(smarthomes, this);
        recyclerView.setAdapter(mAdapter);
    }
}