package com.example.android.tnp_marks;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    List<String> ChildList;
    Map<String, List<String>> ParentListItems;
    ExpandableListView expandablelistView;

    // Assign Parent list items here.
    List<String> ParentList = new ArrayList<String>();

    {
        ParentList.add("B.Tech(1st Year)");
        ParentList.add("B.Tech(CSE)");
        ParentList.add("B.Tech(IT)");
        ParentList.add("B.Tech(ECE)");
        ParentList.add("B.Tech(MAE)");
        ParentList.add("B.Arch");
        ParentList.add("MCA");
        ParentList.add("M.Tech(ISM)");
        ParentList.add("M.Tech(MPC)");
        ParentList.add("M.Tech(RA)");
        ParentList.add("M.Tech(VLSI)");
    }

    // Assign children list element using string array.
    String[] year_1 = {"Semester 1", "Semester 2"};
    String[] CSE = {"CSE - Semester 3", "CSE - Semester 4", "CSE - Semester 5", "CSE - Semester 6", "CSE - Semester 7", "CSE - Semester 8"};
    String[] IT = {"IT - Semester 3", "IT - Semester 4", "IT - Semester 5", "IT - Semester 6", "IT - Semester 7", "IT - Semester 8"};
    String[] ECE = {"ECE - Semester 3", "ECE - Semester 4", "ECE - Semester 5", "ECE - Semester 6", "ECE - Semester 7", "ECE - Semester 8"};
    String[] MAE = {"MAE - Semester 3", "MAE - Semester 4", "MAE - Semester 5", "MAE - Semester 6", "MAE - Semester 7", "MAE - Semester 8"};
    String[] Barch = {"B.Arch - Semester 1", "B.Arch - Semester 2", "B.Arch - Semester 3", "B.Arch - Semester 4", "B.Arch - Semester 5", "B.Arch - Semester 6", "B.Arch - Semester 7",
            "B.Arch - Semester 8", "B.Arch - Semester 9", "B.Arch - Semester 10"};
    String[] MCA = {"MCA - Semester 1", "MCA - Semester 2", "MCA - Semester 3", "MCA - Semester 4", "MCA - Semester 5", "MCA - Semester 6"};
    String[] ISM = {"ISM - Semester 1", "ISM - Semester 2", "ISM - Semester 3", "ISM - Semester 4"};
    String[] RA = {"RA - Semester 1", "RA - Semester 2", "RA - Semester 3", "RA - Semester 4"};
    String[] VLSI = {"VLSI - Semester 1", "VLSI - Semester 2", "VLSI - Semester 3", "VLSI - Semester 4"};
    String[] MPC = {"MPC - Semester 1", "MPC - Semester 2", "MPC - Semester 3", "MPC - Semester 4"};
    String[] by = {"This is not right"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ParentListItems = new LinkedHashMap<String, List<String>>();

        for (String HoldItem : ParentList) {
            if (HoldItem.equals("B.Tech(1st Year)")) {
                loadChild(year_1);
            } else if (HoldItem.equals("B.Tech(CSE)"))
                loadChild(CSE);
            else if (HoldItem.equals("B.Tech(IT)"))
                loadChild(IT);
            else if (HoldItem.equals("B.Tech(ECE)"))
                loadChild(ECE);
            else if (HoldItem.equals("B.Tech(MAE)"))
                loadChild(MAE);
            else if (HoldItem.equals("B.Arch"))
                loadChild(Barch);
            else if (HoldItem.equals("MCA"))
                loadChild(MCA);
            else if (HoldItem.equals("M.Tech(ISM)"))
                loadChild(ISM);
            else if (HoldItem.equals("M.Tech(VLSI)"))
                loadChild(VLSI);
            else if (HoldItem.equals("M.Tech(MPC)"))
                loadChild(MPC);
            else if (HoldItem.equals("M.Tech(RA)"))
                loadChild(RA);

            else
                loadChild(by);

            ParentListItems.put(HoldItem, ChildList);
        }

        expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
        final ExpandableListAdapter expListAdapter = new MyListAdapter(this, ParentList, ParentListItems);
        expandablelistView.setAdapter(expListAdapter);

        expandablelistView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                // TODO Auto-generated method stub

                final String selected = (String) expListAdapter.getChild(
                        groupPosition, childPosition);

                // Switch case to open selected child element activity on child element selection.

                Intent intent;
                switch (selected) {
                    case "Semester 1":
                        intent = new Intent(MainActivity.this, Sem1.class);
                        startActivity(intent);
                        break;
                    case "Semester 2":
                        startActivity(new Intent(MainActivity.this, Sem2.class));
                        break;
                    case "CSE - Semester 3":
                        startActivity(new Intent(MainActivity.this, CSESem3.class));
                        break;
                    case "CSE - Semester 4":
                        startActivity(new Intent(MainActivity.this, CSESem4.class));
                        break;
                    case "CSE - Semester 5":
                        startActivity(new Intent(MainActivity.this, CSESem5.class));
                        break;
                    case "CSE - Semester 6":
                        startActivity(new Intent(MainActivity.this, ISMSem1.class));
                        break;
                    case "CSE - Semester 7":
                        startActivity(new Intent(MainActivity.this, CSESem7.class));
                        break;
                    case "CSE - Semester 8":
                        startActivity(new Intent(MainActivity.this, CSESem8.class));
                        break;
                    case "IT - Semester 3":
                        startActivity(new Intent(MainActivity.this, ITSem3.class));
                        break;
                    case "IT - Semester 4":
                        startActivity(new Intent(MainActivity.this, ITSem4.class));
                        break;
                    case "IT - Semester 5":
                        startActivity(new Intent(MainActivity.this, ITSem5.class));
                        break;
                    case "IT - Semester 6":
                        startActivity(new Intent(MainActivity.this, ITSem6.class));
                        break;
                    case "IT - Semester 7":
                        startActivity(new Intent(MainActivity.this, ITSem7.class));
                        break;
                    case "IT - Semester 8":
                        startActivity(new Intent(MainActivity.this, ITSem8.class));
                        break;
                    case "ECE - Semester 3":
                        startActivity(new Intent(MainActivity.this, ECESem3.class));
                        break;
                    case "ECE - Semester 4":
                        startActivity(new Intent(MainActivity.this, ECESem4.class));
                        break;
                    case "ECE - Semester 5":
                        startActivity(new Intent(MainActivity.this, ECESem5.class));
                        break;
                    case "ECE - Semester 6":
                        startActivity(new Intent(MainActivity.this, ECESem6.class));
                        break;
                    case "ECE - Semester 7":
                        startActivity(new Intent(MainActivity.this, ECESem7.class));
                        break;
                    case "ECE - Semester 8":
                        startActivity(new Intent(MainActivity.this, ECESem8.class));
                        break;
                    case "MAE - Semester 3":
                        startActivity(new Intent(MainActivity.this, MAESem3.class));
                        break;
                    case "MAE - Semester 4":
                        startActivity(new Intent(MainActivity.this, MAESem4.class));
                        break;
                    case "MAE - Semester 5":
                        startActivity(new Intent(MainActivity.this, MAESem5.class));
                        break;
                    case "MAE - Semester 6":
                        startActivity(new Intent(MainActivity.this, MAESem6.class));
                        break;
                    case "MAE - Semester 7":
                        startActivity(new Intent(MainActivity.this, MAESem7.class));
                        break;
                    case "MAE - Semester 8":
                        startActivity(new Intent(MainActivity.this, MAESem8.class));
                        break;
                    case "MCA - Semester 1":
                        startActivity(new Intent(MainActivity.this, mca_sem_1.class));
                        break;
                    case "MCA - Semester 2":
                        startActivity(new Intent(MainActivity.this, mca_sem_2.class));
                        break;
                    case "MCA - Semester 3":
                        startActivity(new Intent(MainActivity.this, mca_sem_3.class));
                        break;
                    case "MCA - Semester 4":
                        startActivity(new Intent(MainActivity.this, mca_sem_4.class));
                        break;
                    case "MCA - Semester 5":
                        startActivity(new Intent(MainActivity.this, mca_sem_5.class));
                        break;
                    case "MCA - Semester 6":
                        startActivity(new Intent(MainActivity.this, mca_sem_6.class));
                        break;
                    case "B.Arch - Semester 1":
                        startActivity(new Intent(MainActivity.this, BARCHSem1.class));
                        break;
                    case "B.Arch - Semester 2":
                        startActivity(new Intent(MainActivity.this, BARCHSem2.class));
                        break;
                    case "B.Arch - Semester 3":
                        startActivity(new Intent(MainActivity.this, BARCHSem3.class));
                        break;
                    case "B.Arch - Semester 4":
                        startActivity(new Intent(MainActivity.this, BARCHSem4.class));
                        break;
                    case "B.Arch - Semester 5":
                        startActivity(new Intent(MainActivity.this, BARCHSem5.class));
                        break;
                    case "ISM - Semester 1":
                        startActivity(new Intent(MainActivity.this, ISMSem1.class));
                        break;
                    case "ISM - Semester 2":
                        startActivity(new Intent(MainActivity.this, ISMSem2.class));
                        break;
                    case "ISM - Semester 3":
                        startActivity(new Intent(MainActivity.this, ISMSem3.class));
                        break;
                    case "ISM - Semester 4":
                        startActivity(new Intent(MainActivity.this, ISMSem4.class));
                        break;
                    case "RA - Semester 1":
                        startActivity(new Intent(MainActivity.this, RASem1.class));
                        break;
                    case "RA - Semester 2":
                        startActivity(new Intent(MainActivity.this, RASem2.class));
                        break;
                    case "RA - Semester 3":
                        startActivity(new Intent(MainActivity.this, RASem3.class));
                        break;
                    case "RA - Semester 4":
                        startActivity(new Intent(MainActivity.this, RASem4.class));
                        break;
                    case "MPC - Semester 1":
                        startActivity(new Intent(MainActivity.this, MPCSem1.class));
                        break;
                    case "MPC - Semester 2":
                        startActivity(new Intent(MainActivity.this, MPCSem2.class));
                        break;
                    case "MPC - Semester 3":
                        startActivity(new Intent(MainActivity.this, MPCSem3.class));
                        break;
                    case "MPC - Semester 4":
                        startActivity(new Intent(MainActivity.this, MPCSem4.class));
                        break;
                    case "VLSI - Semester 1":
                        startActivity(new Intent(MainActivity.this, VLSISem1.class));
                        break;
                    case "VLSI - Semester 2":
                        startActivity(new Intent(MainActivity.this, VLSISem2.class));
                        break;
                    case "VLSI - Semester 3":
                        startActivity(new Intent(MainActivity.this, VLSISem3.class));
                        break;
                    case "VLSI - Semester 4":
                        startActivity(new Intent(MainActivity.this, VLSISem4.class));
                        break;


                }

                return true;
            }
        });
    }

    private void loadChild(String[] ParentElementsName) {
        ChildList = new ArrayList<String>();
        for (String model : ParentElementsName)
            ChildList.add(model);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_page, menu);

        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.cu:
                Intent i1 = new Intent(this, contact.class);
                startActivity(i1);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}