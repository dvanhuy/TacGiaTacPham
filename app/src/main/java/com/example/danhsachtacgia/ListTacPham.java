package com.example.danhsachtacgia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class ListTacPham extends AppCompatActivity {
    ListView lvitem;
    ArrayList<TacPham> tacPhams;
    AdapterTacPham adapterTacPham;
    String idtacgia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tac_pham);
        Intent intent = getIntent();
        idtacgia = intent.getStringExtra("idtacgia");
        ImageView buttonback = findViewById(R.id.buttonback);
        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        initData(idtacgia);

        lvitem=findViewById(R.id.listviewtacpham);
        adapterTacPham = new AdapterTacPham(this,R.layout.itemtacpham,tacPhams);
        lvitem.setAdapter(adapterTacPham);
        lvitem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(ListTacPham.this,ChiTietTacPham.class);
                Bundle bundle1 = new Bundle();
                bundle1.putSerializable("data",tacPhams.get(i));
                intent.putExtra("bundle",bundle1);
                startActivity(intent);
            }
        });
    }

    public void initData(String id){
        ArrayList<TacPham> tacphamtable = new ArrayList<>();
        tacphamtable.add(new TacPham("1","Trời mỗi ngày lại sáng","Trời mỗi ngày lại sáng\n" +
                "Như cơm trắng mỗi ngày.\n" +
                "Và cuộc đời mang nặng\n" +
                "Sự nghiệp những bàn tay",4));
        tacphamtable.add(new TacPham("1","Phù Đổng Thiên Vương","Anh viết bài thơ kể chuyện xưa\n" +
                "Tặng mừng muôn triệu em bây giờ\n" +
                "Chúng ta con cháu dòng Phù Đổng",3));
        tacphamtable.add(new TacPham("1","Hai bàn tay em","Hai bàn tay em\n" +
                "Như hoa đầu cành\n" +
                "Hoa hồng hồng nụ\n" +
                "Cánh tròn ngón xinh.",5));
        tacphamtable.add(new TacPham("2","Dòng họ ăn cỏ","Nội dung",4));
        tacphamtable.add(new TacPham("2","Bức tường biết hát","Nội dung",4));
        tacphamtable.add(new TacPham("2","Rừng xanh lá đỏ","Nội dung",2));
        tacphamtable.add(new TacPham("2","Cây tỏi nổi giận","Nội dung",2));
        tacphamtable.add(new TacPham("3","Thành phố tháng tư","Nội dung",1));
        tacphamtable.add(new TacPham("3","Trò chơi lãng mạn của tình yêu","Nội dung",4));
        tacphamtable.add(new TacPham("3","Chuyện cổ tích dành cho người lớn","Nội dung",4));
        tacphamtable.add(new TacPham("4","The Torrents of Spring","Nội dung",4));
        tacphamtable.add(new TacPham("4","Death in the Afternoon (Chết vào lúc xế trưa)","Nội dung",5));
        tacphamtable.add(new TacPham("4","C By-Line: Ernest Hemingway","Nội dung",3));
        tacphamtable.add(new TacPham("5","Antony and Cleopatra","Nội dung",4));
        tacphamtable.add(new TacPham("5","Love's Labour's Won","Nội dung",1));
        tacphamtable.add(new TacPham("5","The Comedy of Errors","Nội dung",4));

        tacPhams = new ArrayList<>();
        for (TacPham tacPham:tacphamtable) {
            if (tacPham.getIdtacgia().equals(idtacgia)){
                tacPhams.add(tacPham);
            }
        }
    }
}