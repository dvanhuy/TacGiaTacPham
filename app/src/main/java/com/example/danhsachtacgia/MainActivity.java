package com.example.danhsachtacgia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvitem;
    ArrayList<Tacgia> arrayItem;
    AdapterTacGia adapterTacGia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initdata();
        lvitem=findViewById(R.id.listviewtacgia);
        adapterTacGia = new AdapterTacGia(this,R.layout.tacgiaitem,arrayItem);
        lvitem.setAdapter(adapterTacGia);
        lvitem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, ListTacPham.class);
                intent.putExtra("idtacgia",arrayItem.get(i).getId());
                Log.d("TAG", arrayItem.get(i).getId());
                startActivity(intent);
            }
        });
    }

    public void initdata(){
        arrayItem = new ArrayList<>();
        //id, ten, tyoi, gioi tinh, img, mota
        arrayItem.add(new Tacgia("1","Huy Cận", "Cù Huy Cận không chỉ là một nhà thơ. Ông là một nhà văn hóa, nhà hoạt động chính trị-xã hội với những dấu ấn quan trọng", R.drawable.img_huycan, 4));
        arrayItem.add(new Tacgia("2","Mạc Ngôn", "Mạc Ngôn là một nhà văn người Trung Quốc xuất thân từ nông dân. Ông đã từng được thế giới biết đến", R.drawable.img_macgon, 5));
        arrayItem.add(new Tacgia("3","Nhật Ánh", "Nguyễn Nhật Ánh là một nhà văn, nhà thơ, bình luận viên Việt Nam.", R.drawable.img_nhatanh, 4));
        arrayItem.add(new Tacgia("4","HemingWay", "Ernest Miller Hemingway là một tiểu thuyết gia người Mỹ, nhà văn viết truyện ngắn và là một nhà báo", R.drawable.img_hemingway, 5));
        arrayItem.add(new Tacgia("5","ShakeSpare", "William Shakespeare là một nhà văn và nhà viết kịch Anh, được coi là nhà văn vĩ đại nhất của Anh", R.drawable.img_shakespare, 4));
    }
}