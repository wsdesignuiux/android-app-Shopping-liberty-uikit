package e.wolfsoft1.shopping_liberty_uikit;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import adapter.ViewPagerAdapter;



public class Shopping extends AppCompatActivity {
    private ViewPagerAdapter pagerAdapter;
    private ViewPager viewpager;
    ImageView leftNav, rightNav;

//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);


        viewpager = (ViewPager) findViewById(R.id.viewpager);

        leftNav = (ImageView) findViewById(R.id.left_nav);
        rightNav = (ImageView) findViewById(R.id.right_nav);
        pagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewpager.setAdapter(pagerAdapter);



// Images left navigation
        leftNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tab = viewpager.getCurrentItem();
                if (tab > 0) {
                    tab--;
                    viewpager.setCurrentItem(tab);
                } else if (tab == 0) {
                    viewpager.setCurrentItem(tab);
                }
            }
        });

        // Images right navigatin
        rightNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tab = viewpager.getCurrentItem();
                tab++;
                viewpager.setCurrentItem(tab);
            }
        });




    }
}