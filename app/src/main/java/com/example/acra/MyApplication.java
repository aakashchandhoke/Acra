package com.example.acra;

import android.app.Application;

import org.acra.ACRA;
import org.acra.ReportField;
import org.acra.ReportingInteractionMode;
import org.acra.annotation.ReportsCrashes;
import org.acra.sender.HttpSender;

/**
 * Created by iAugmentor on 07-Jul-16.
 */

@ReportsCrashes(
        formUri = "https://aakash24.cloudant.com/acra-aakash/_design/acra-storage/_update/report",
        //forUri="dev.api.iaugmentor.com/v2/log"
        reportType = HttpSender.Type.JSON,
        httpMethod = HttpSender.Method.POST,
        formUriBasicAuthLogin = "turesentornluditstarefte",
        formUriBasicAuthPassword = "03ef5ccf6f29a95dcf926111cb06d6357e56c5e2",
        customReportContent = {
                ReportField.APP_VERSION_CODE,
                ReportField.APP_VERSION_NAME,
                ReportField.ANDROID_VERSION,
                ReportField.PACKAGE_NAME,
                ReportField.REPORT_ID,
                ReportField.BUILD,
                ReportField.STACK_TRACE
        },
        mode = ReportingInteractionMode.TOAST,
        resToastText = R.string.toast_crash
)
public class MyApplication extends Application {
        public void onCreate() {
                // The following line triggers the initialization of ACRA
                super.onCreate();
                ACRA.init(this);
        }
}
