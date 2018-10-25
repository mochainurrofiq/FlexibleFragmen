package learning.rofiq.com.flexiblefragmen;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager mFragmenManager = getSupportFragmentManager();
        FragmentTransaction mfragmentTransaction = mFragmenManager.beginTransaction();
        HomeFragment mhomeFragment = new HomeFragment();

        mfragmentTransaction.add(R.id.frame_container, mhomeFragment, HomeFragment.class.getSimpleName());

        Log.d("MyFlexibelFragment", "Fragmen Name : " +HomeFragment.class.getSimpleName());
        mfragmentTransaction.commit();
    }
}
