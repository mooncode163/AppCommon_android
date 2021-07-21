package com.moonma.common;

import android.content.Context;
import android.net.Uri;
import android.view.View;

public class LibCommon {

    public  ILibCommon delegate;

    static private LibCommon _main;
    public static  LibCommon Main() {
        if(_main==null){
            _main = new LibCommon();
        }
        return _main;
    }


    public void UnitySendMessage(String name,String method,String arg) {
            //        UnityPlayer.UnitySendMessage("Scene", "AdBannerDidReceiveAd", str);
        if(this.delegate!=null)
        {
            this.delegate.UnitySendMessage(name, method, arg);
        }
    }

}
