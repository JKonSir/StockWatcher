package com.google.gwt.sample.stockwatcher.stockWatcher.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface StockWatcherServiceAsync
{
    void getMessage(String msg, AsyncCallback<String> async);
}
