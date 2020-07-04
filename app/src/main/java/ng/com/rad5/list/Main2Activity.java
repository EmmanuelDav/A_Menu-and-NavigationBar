package ng.com.rad5.list;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Main2Activity  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.desgin);
        this.getSupportActionBar().hide();
    }


    public void ChangeFragment(View view) {
        Fragment fr;
        if (view == findViewById(R.id.button))
            fr = new fragment_one();
        else
            fr = new fragment_two();

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.frag,fr);
        transaction.commit();

    }
}
