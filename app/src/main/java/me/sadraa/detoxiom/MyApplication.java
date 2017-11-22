package me.sadraa.detoxiom;

import android.app.Application;

import me.sadraa.detoxiom.network.QuoteClient;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by sadra on 10/28/17.
 */

public class MyApplication extends Application {
    private static MyAppComponent appComponent;
    private static QuoteClient quoteClient;
    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggermAppComponent.builder()
                        .build();

        quoteClient = appComponent.getQCService();
        CalligraphyConfig.initDefault(appComponent.getCalligraphyConfig());

    }

    public static MyAppComponent getAppComponent(){
        return appComponent;
    }
    public static QuoteClient getQuoteClinet(){
        return quoteClient;
    }

}
