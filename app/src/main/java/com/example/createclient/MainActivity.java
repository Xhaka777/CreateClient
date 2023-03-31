package com.example.createclient;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.createclient.api.ApiService;
import com.example.createclient.deviceNumber.DeviceNumber;
import com.example.createclient.deviceNumber.DeviceNumberResponse;
import com.example.createclient.postClient.ClientData;
import com.example.createclient.postClient.ClientPostObject;
import com.google.android.material.tabs.TabLayout;

import javax.inject.Inject;

import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    @Inject
    ApiService apiService;

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private FragmentPagerAdapter adapter;
    private EditText nameEditText;
    private EditText fiscalEditText;
    private Button button;

    ClientData client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set up the TabLayout and ViewPager
        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.view_pager);

        //
        nameEditText = findViewById(R.id.name_edit_text);
        fiscalEditText = findViewById(R.id.fiscal_edit_text);
        button = findViewById(R.id.shtoKlient_button);

        adapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @NonNull
            @Override
            public Fragment getItem(int position) {
                switch (position) {
                    case 0:
                        return new ClientAddressFragment();
                    case 1:
                        return new BankInfoFragment();
                    case 2:
                        return new OptionsInfoFragment();
                    default:
                        return null;
                }
            }

            @Override
            public int getCount() {
                return 3;
            }

            @Nullable
            @Override
            public CharSequence getPageTitle(int position) {
                switch (position) {
                    case 0:
                        return "Address";
                    case 1:
                        return "Bank Info";
                    case 2:
                        return "Options";
                    default:
                        return null;
                }
            }
        };
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //per token dhe user_id...
                postClient();
                //me dal nga Klasa e Klientit
                //kthu back ne MainActivity...
                finish();
            }
        });
    }

    private void postClient() {

        if (client != null) {

            client.setIsCompany("1");
            client.setName(nameEditText.getText().toString().trim());
            client.setNumberFiscal(fiscalEditText.getText().toString().trim());

        }
        apiService.getDeviceNumber(new DeviceNumber("4c3d4a18ce4e77c6efb00b9256d4c761b5cc762eb7a772d6d3b6aff4b7561841", "2476", "2247"))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<DeviceNumberResponse>() {
                    @Override
                    public void call(DeviceNumberResponse deviceNumberResponse) {
                        if (deviceNumberResponse.getSuccess()) {

                            ClientPostObject clientPostObject = new ClientPostObject();
                            clientPostObject.setDeviceToken(deviceNumberResponse.getData().getDeviceToken());
                            clientPostObject.setDeviceNumber(deviceNumberResponse.getData().getDeviceNumber());
                            clientPostObject.setClient(client);

                            apiService.postClient(clientPostObject)
                                    .subscribeOn(Schedulers.io())
                                    .observeOn(AndroidSchedulers.mainThread())
                                    .subscribe(clientUploadResponse -> {
                                        if (clientUploadResponse.getSuccess()) {
                                            Toast.makeText(getApplicationContext(), "Klienti esht ruajtur", Toast.LENGTH_SHORT).show();
                                        } else {
                                            Toast.makeText(getApplicationContext(), "Klienti esht ruajtur por nuk esht sinkronizuar!!!", Toast.LENGTH_SHORT).show();
                                        }
                                        //TODO: me rujt klientin ne db
                                        //qitu duhet me rujt klientin ne realm db...
                                        //realmHelper.saveClient(client);
                                    }, throwable -> {
                                        throwable.printStackTrace();
                                        //realmHelper.saveClient(client);
                                        Toast.makeText(getApplicationContext(), "Klienti esht ruajtur por nuk esht sinkronizuar!!!", Toast.LENGTH_SHORT).show();
                                    });
                        } else {
                            Toast.makeText(getApplicationContext(), "deviceNumber error...=====>", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }

}