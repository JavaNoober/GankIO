package team.gankio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.BaseExpandableListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {
    private ListView lvMenu ;
    private List<String> menuList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvMenu = (ListView) findViewById(R.id.lv_menu);
        menuList = new ArrayList<>();
        menuList.add("aaa");
        menuList.add("aaa");
        menuList.add("aaa");
        menuList.add("aaa");
        menuList.add("aaa");
        //222
        menuList.add("aaa");
        lvMenu.setAdapter(new MenuAdapter());
    }

    class MenuAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return menuList.size();
        }

        @Override
        public Object getItem(int position) {
            return menuList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = LayoutInflater.from(MainActivity.this).inflate(R.layout.item_menu,null);

            return convertView;
        }
    }
}
