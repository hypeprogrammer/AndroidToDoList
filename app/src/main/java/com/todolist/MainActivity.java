package com.todolist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // TAG 상수 추가
    private static final String TAG = "MainActivity";

    // Fragment 변수 선언
    Fragment mainFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Fragment 객체 할당
        mainFragment = new MainFragment();

        // FragmentManager를 이용하여 FrameLayout에 Fragment 추가
        getSupportFragmentManager().beginTransaction().replace(R.id.container, mainFragment).commit();

        // saveButton 클릭 이벤트 설정
        Button saveButton = findViewById(R.id.saveButton);
        saveButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // ToDo 저장 메서드 호출
                saveToDo();
                // Toast 메시지 출력
                Toast.makeText(getApplicationContext(), "추가되었습니다.", Toast.LENGTH_SHORT).show();
            }
        });
    }

    // saveToDo 메서드 정의
    private void saveToDo() {
        // ToDo 저장 로직
        // 데이터베이스 저장 로직은 여기에 구현 예정
    }
}
