package com.pijiu.bundletool;

/**
 * https://developer.android.com/studio/command-line/bundletool
 */
public class BundleCommandHelper {

    /**
     * used by Build System
     *
     * @return
     */
    public String[] buildBundle() {
        String[] args = new String[]{
                "build-bundle",
                "--modules=/Users/wupengjian/Desktop/develop/MusicLive/AppBundle/app,/Users/wupengjian/Desktop/develop/MusicLive/AppBundle/dynamic_feature1",
                "--output=/Users/wupengjian/Desktop/AppBundle/result.aab",
        };
        return args;
    }

    /**
     * bundletool build-apks --bundle=/MyApp/my_app.aab --output=/MyApp/my_app.apks
     * --ks=/MyApp/keystore.jks
     * --ks-pass=file:/MyApp/keystore.pwd
     * --ks-key-alias=MyKeyAlias
     * --key-pass=file:/MyApp/key.pwd
     *
     * @return
     */
    public String[] buildApks() {
        String[] args = new String[]{
                "build-apks",
                "--bundle=./files/app.aab",
                "--output=./files/app.apks",
                "--ks=./files/keystore",
                "--ks-pass=pass:keystore",
                "--ks-key-alias=keystore",
                "--key-pass=pass:keystore",
        };
        return args;
    }

    /**
     * bundletool build-apks --connected-device --bundle=/MyApp/my_app.aab --output=/MyApp/my_app.apks
     * --ks=/MyApp/keystore.jks
     * --ks-pass=file:/MyApp/keystore.pwd
     * --ks-key-alias=MyKeyAlias
     * --key-pass=file:/MyApp/key.pwd
     *
     * @return
     */
    public String[] buildApksForConnectedDevice() {
        String[] args = new String[]{
                "build-apks",
                "--connected-device",
                "--bundle=./files/app.aab",
                "--output=./files/app.apks",
                "--ks=./files/keystore",
                "--ks-pass=pass:keystore",
                "--ks-key-alias=keystore",
                "--key-pass=pass:keystore",
        };
        return args;
    }

    /**
     * bundletool build-apks --connected-device --device-id=serial-id --bundle=/MyApp/my_app.aab --output=/MyApp/my_app.apks
     * --ks=/MyApp/keystore.jks
     * --ks-pass=file:/MyApp/keystore.pwd
     * --ks-key-alias=MyKeyAlias
     * --key-pass=file:/MyApp/key.pwd
     *
     * @return
     */
    public String[] buildApkForSpecifiedDevice() {
        String[] args = new String[]{
                "build-apks",
                "--connected-device",
                "--device-id=2011b8760704", // serial-id: adb devices
                "--bundle=./files/app.aab",
                "--output=./files/app.apks",
                "--ks=./files/keystore",
                "--ks-pass=pass:keystore",
                "--ks-key-alias=keystore",
                "--key-pass=pass:keystore",
        };
        return args;
    }

    /**
     * bundletool install-apks --apks=/MyApp/my_app.apks
     *
     * @return
     */
    public String[] installApks() {
        String[] args = new String[]{
                "install-apks",
                "--apks=./files/app.apks",
        };
        return args;
    }

    /**
     * bundletool install-apks --device-id=serial-id --apks=/MyApp/my_app.apks
     *
     * @return
     */
    public String[] installApkForSpecifiedDevice() {
        String[] args = new String[]{
                "install-apks",
                "--device-id=2011b8760704", // serial-id: adb devices
                "--apks=./files/app.apks",
        };
        return args;
    }

    /**
     * bundletool install-apks --modules=base,dynamic_feature1 --device-id=serial-id --apks=/MyApp/my_app.apks
     *
     * @return
     */
    public String[] installApkForSpecifiedModules() {
        String[] args = new String[]{
                "install-apks",
                "--modules=base,dynamic_feature1",
                "--device-id=2011b8760704", // serial-id: adb devices
                "--apks=./files/app.apks",
        };
        return args;
    }

    /**
     * bundletool get-device-spec --output=specification.json
     *
     * @return
     */
    public String[] getDeviceSpec() {
        String[] args = new String[]{
                "get-device-spec",
                "--output=./files/specification.json",
        };
        return args;
    }

    /**
     * bundletool get-device-spec --output=specification.json
     *
     * @return
     */
    public String[] getSpecifiedDeviceSpec() {
        String[] args = new String[]{
                "get-device-spec",
                "--output=./files/specification.json",
                "--device-id=2011b8760704", // serial-id: adb devices
        };
        return args;
    }

    /**
     * bundletool extract-apks
     * --apks=/MyApp/my_existing_APK_set.apks
     * --output-dir=/MyApp/my_pixel2_APK_set.apks
     * --device-spec=/MyApp/bundletool/pixel2.json
     *
     * @return
     */
    public String[] extractApksForDeviceSpec() {
        String[] args = new String[]{
                "extract-apks",
                "--apks=./files/app.apks",
                "--output-dir=./files/",
                "--device-spec=./files/specification.json",
        };
        return args;
    }

    /**
     * bundletool extract-apks
     * --apks=/MyApp/my_existing_APK_set.apks
     * --output-dir=/MyApp/my_pixel2_APK_set.apks
     * --device-spec=/MyApp/bundletool/pixel2.json
     *
     * @return
     */
    public String[] extractApksForSpecifiedModules() {
        String[] args = new String[]{
                "extract-apks",
                "--apks=./files/app.apks",
                "--modules=base,dynamic_feature1",
                "--output-dir=./files/",
                "--device-spec=./files/specification.json",
        };
        return args;
    }

    /**
     * bundletool get-size total --apks=/MyApp/my_app.apks
     *
     * @return
     */
    public String[] getSize() {
        String[] args = new String[]{
                "get-size",
                "total",
//                "--modules=base",//MIN,MAX 1021290,1021290
//                "--modules=dynamic_feature1",//MIN,MAX 1028469,1028469
                "--modules=base,dynamic_feature1",//MIN,MAX 1028469,1028469
                "--apks=./files/app.apks",
        };
        return args;
    }

    /**
     * bundletool get-size --device-spec=path --apks=/MyApp/my_app.apks
     *
     * @return
     */
    public String[] getSizeForDeviceSpec() {
        String[] args = new String[]{
                "get-size",
                "total",
                "--apks=./files/app.apks",
                "--device-spec=./files/specification.json",//MIN,MAX 1021290,1021290
//                "--modules=base",//MIN,MAX 1021290,1021290
//                "--modules=dynamic_feature1",//MIN,MAX 1028469,1028469
//                "--modules=base,dynamic_feature1",//MIN,MAX 1028469,1028469
        };
        return args;
    }
}
