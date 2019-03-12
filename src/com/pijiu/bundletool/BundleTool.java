package com.pijiu.bundletool;

import com.android.tools.build.bundletool.BundleToolMain;

public class BundleTool {

    public static void main(String[] args) {

        BundleCommandHelper helper = new BundleCommandHelper();
//        args = helper.buildBundle(); // used by Build System
//        args = helper.buildApks();
//        args = helper.buildApkForSpecifiedDevice();
//        args = helper.installApkForSpecifiedModules();
//        args = helper.getDeviceSpec();
        args = helper.getSpecifiedDeviceSpec();
//        args = helper.extractApksForDeviceSpec();
//        args = helper.extractApksForSpecifiedModules();
//        args = helper.getSize();
//        args = helper.getSizeForDeviceSpec();
        BundleToolMain.main(args);
    }
}
